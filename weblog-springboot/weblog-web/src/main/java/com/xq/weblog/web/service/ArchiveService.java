package com.xq.weblog.web.service;

import com.xq.weblog.common.utils.Response;
import com.xq.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author xq
 * @create 2024/9/4 10:05
 */
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}

