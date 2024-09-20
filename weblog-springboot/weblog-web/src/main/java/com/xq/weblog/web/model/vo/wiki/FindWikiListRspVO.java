package com.xq.weblog.web.model.vo.wiki;

import com.xq.weblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: xq
 
 * @date: 2023-09-15 14:07
 * @description: 知识库列表
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindWikiListRspVO extends BasePageQuery {
    private Long id;
    private String cover;
    private String title;
    private String summary;

    /**
     * 是否置顶
     */
    private Boolean isTop;

    /**
     * 第一篇文章 ID
     */
    private Long firstArticleId;
}
