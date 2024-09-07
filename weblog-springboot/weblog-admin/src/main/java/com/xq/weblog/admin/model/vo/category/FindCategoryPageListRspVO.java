package com.xq.weblog.admin.model.vo.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author xq
 * @create 2024/9/2 16:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryPageListRspVO {
    /**
     * 分类 ID
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 文章总数
     */
    private Integer articlesTotal;

}

