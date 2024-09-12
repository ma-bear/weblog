<template>
    <Header></Header>

    <!-- 主内容区域 -->
    <main class="container max-w-screen-xl mx-auto px-4 md:px-6 py-4">
        <!-- grid 表格布局，分为 4 列 -->
        <div class="grid grid-cols-12 gap-7">
            <!-- 左边栏，占用 3 列 -->
            <div class="col-span-12 md:col-span-8 lg:col-span-9 mb-3">

                <!-- grid 表格布局，分为 12 列 -->
                <div class="grid grid-cols-12 gap-7">
                    <div v-if="wikis && wikis.length > 0" v-for="(wiki, index) in wikis" :key="index" class="col-span-12 md:col-span-6 lg:col-span-4 animate__animated animate__fadeInUp">
                        <div 
                            class="relative bg-white h-full border border-gray-200 rounded-lg hover:scale-[1.03] dark:bg-gray-800 dark:border-gray-700">
                            <!-- 知识库封面 -->
                            <a @click="goWikiArticleDetailPage(wiki.id, wiki.firstArticleId)" class="cursor-pointer">
                                <img class="rounded-t-lg h-36 w-full"
                                :src="wiki.cover" />
                            </a>
                            <div class="p-5">
                                <!-- 知识库标题 -->
                                <a @click="goWikiArticleDetailPage(wiki.id, wiki.firstArticleId)" class="cursor-pointer">
                                    <h2 class="mb-2 text-2xl font-bold tracking-tight text-gray-900 dark:text-white">
                                        <span
                                            class="hover:border-gray-600 hover:border-b-2 dark:hover:border-gray-400">{{ wiki.title }}</span>
                                    </h2>
                                </a>
                                <!-- 知识库摘要 -->
                                <p class="font-normal text-gray-500 dark:text-gray-400">
                                    {{ wiki.summary }}
                                </p>
                            </div>

                            <!-- 是否置顶 -->
                            <div v-if="wiki.isTop" class="absolute inline-flex items-center justify-center w-14 h-7 text-xs font-bold text-white bg-red-500 border-2 border-white rounded-full -top-2 -end-2 dark:border-gray-900">
                                置顶
                            </div>
                        </div>
                    </div>
                </div>
                                <!-- 分页 -->
                                <nav aria-label="Page navigation example" class="mt-10 flex justify-center" v-if="pages > 1">
                    <ul class="flex items-center -space-x-px h-10 text-base">
                        <!-- 上一页 -->
                        <li>
                            <a @click="getWikis(current - 1)"
                                class="flex items-center justify-center px-4 h-10 ml-0 leading-tight text-gray-500 bg-white border border-gray-300 rounded-l-lg hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white"
                                :class="[current > 1 ? '' : 'cursor-not-allowed']"
                                >

                                <span class="sr-only">上一页</span>
                                <svg class="w-3 h-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none"
                                    viewBox="0 0 6 10">
                                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round"
                                        stroke-width="2" d="M5 1 1 5l4 4" />
                                </svg>
                            </a>
                        </li>
                        <!-- 页码 -->
                        <li v-for="(pageNo, index) in pages" :key="index">
                            <a @click="getWikis(pageNo)"
                                class="flex items-center justify-center px-4 h-10 leading-tight border  dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white"
                                :class="[pageNo == current ? 'text-blue-600  bg-blue-50 border-blue-300 hover:bg-blue-100 hover:text-blue-700' : 'text-gray-500 border-gray-300 bg-white hover:bg-gray-100 hover:text-gray-700']"
                                >
                                {{ index + 1 }}
                            </a>
                        </li>
                        <!-- 下一页 -->
                        <li>
                            <a @click="getWikis(current + 1)"
                                class="flex items-center justify-center px-4 h-10 leading-tight text-gray-500 bg-white border border-gray-300 rounded-r-lg hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white"
                                :class="[current < pages ? '' : 'cursor-not-allowed']"
                                >
                                <span class="sr-only">下一页</span>
                                <svg class="w-3 h-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none"
                                    viewBox="0 0 6 10">
                                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round"
                                        stroke-width="2" d="m1 9 4-4-4-4" />
                                </svg>
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>

            <!-- 右边侧边栏，占用一列 -->
            <aside class="col-span-12 md:col-span-4 lg:col-span-3">
                <div class="sticky top-[5.5rem]">
                    <!-- 博主信息 -->
                    <UserInfoCard></UserInfoCard>

                    <!-- 分类 -->
                    <CategoryListCard></CategoryListCard>

                    <!-- 标签 -->
                    <TagListCard></TagListCard>
                </div>
            </aside>
        </div>
    </main>

    <!-- 返回顶部 -->
    <ScrollToTopButton></ScrollToTopButton>

    <Footer></Footer>
</template>

<script setup>
import Header from '@/layouts/frontend/components/Header.vue'
import Footer from '@/layouts/frontend/components/Footer.vue'
import UserInfoCard from '@/layouts/frontend/components/UserInfoCard.vue'
import TagListCard from '@/layouts/frontend/components/TagListCard.vue'
import CategoryListCard from '@/layouts/frontend/components/CategoryListCard.vue'
import ScrollToTopButton from '@/layouts/frontend/components/ScrollToTopButton.vue'
import { getWikiPageList } from '@/api/frontend/wiki'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()

// 知识库
const wikis = ref([])
// 当前页码
const current = ref(1)
// 每页显示的知识库数
const size = ref(10)
// 总知识库数
const total = ref(0)
// 总共多少页
const pages = ref(0)

function getWikis(currentNo) {
    // 上下页是否能点击判断，当要跳转上一页且页码小于 1 时，则不允许跳转；当要跳转下一页且页码大于总页数时，则不允许跳转
    if (currentNo < 1 || (pages.value > 0 && currentNo > pages.value)) return
    // 调用分页接口渲染数据
    getWikiPageList({current: currentNo, size: size.value}).then((res) => {
        if (res.success) {
            wikis.value = res.data
            current.value = res.current
            size.value = res.size
            total.value = res.total
            pages.value = res.pages
        }
    })
}
getWikis(current.value)

// 跳转文章详情页
const goWikiArticleDetailPage = (wikiId, articleId) => {
    console.log('跳转' + wikiId + ',' + articleId)
    router.push({path: '/wiki/' + wikiId, query: {articleId}})
}
</script>
