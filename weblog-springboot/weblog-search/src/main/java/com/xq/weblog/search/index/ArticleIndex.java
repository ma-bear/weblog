package com.xq.weblog.search.index;

/**
 * @author xq
 * @create 2024/9/7 15:28
 */
public interface ArticleIndex {
    /**
     * 索引名称
     */
    String NAME = "article";

    // --------------------- 文档字段 ---------------------
    String COLUMN_ID = "id";

    String COLUMN_TITLE = "title";

    String COLUMN_COVER = "cover";

    String COLUMN_SUMMARY = "summary";

    String COLUMN_CONTENT = "content";

    String COLUMN_CREATE_TIME = "createTime";
}
