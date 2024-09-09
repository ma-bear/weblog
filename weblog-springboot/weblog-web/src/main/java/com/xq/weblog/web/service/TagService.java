package com.xq.weblog.web.service;

import com.xq.weblog.common.utils.Response;
import com.xq.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;

/**
 * @author: xq
 * 
 * @date: 2023-09-15 14:03
 * @description: 分类
 **/
public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();


    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
