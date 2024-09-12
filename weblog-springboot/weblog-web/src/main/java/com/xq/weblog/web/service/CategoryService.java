package com.xq.weblog.web.service;

import com.xq.weblog.common.utils.Response;
import com.xq.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.xq.weblog.web.model.vo.category.FindCategoryListReqVO;

/**
 * @author: xq
 * @date: 2023-09-15 14:03
 * @description: 分类
 **/
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);

}
