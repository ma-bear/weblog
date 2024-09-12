package com.xq.weblog.web.service;

import com.xq.weblog.admin.model.vo.wiki.FindWikiPageListReqVO;
import com.xq.weblog.common.utils.Response;
import com.xq.weblog.web.model.vo.wiki.FindWikiArticlePreNextReqVO;
import com.xq.weblog.web.model.vo.wiki.FindWikiCatalogListReqVO;

/**
 * @author: xq
 
 * @date: 2023-09-15 14:03
 * @description: 知识库
 **/
public interface WikiService {

    /**
     * 获取知识库
     * @return
     */
    Response findWikiList();

    /**
     * 获取知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 获取上下页
     * @param findWikiArticlePreNextReqVO
     * @return
     */
    Response findArticlePreNext(FindWikiArticlePreNextReqVO findWikiArticlePreNextReqVO);

    /**
     * 知识库分页查询
     * @param findWikiPageListReqVO
     * @return
     */
    Response findWikiPageList(FindWikiPageListReqVO findWikiPageListReqVO);

}
