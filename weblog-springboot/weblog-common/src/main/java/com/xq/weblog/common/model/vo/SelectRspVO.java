package com.xq.weblog.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xq
 * @create 2024/9/2 16:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SelectRspVO {
    /**
     * Select 下拉列表的展示文字
     */
    private String label;

    /**
     * Select 下拉列表的 value 值，如 ID 等
     */
    private Object value;
}

