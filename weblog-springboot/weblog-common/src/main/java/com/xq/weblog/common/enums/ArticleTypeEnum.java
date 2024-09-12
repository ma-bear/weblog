package com.xq.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: xq
 * @date: 2023-08-15 10:33
 * @description: 文章类型
 **/
@Getter
@AllArgsConstructor
public enum ArticleTypeEnum {

    NORMAL(1, "普通"),
    WIKI(2, "收录于知识库");

    private Integer value;
    private String description;

}
