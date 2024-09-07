package com.xq.weblog.admin.model.vo.article;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author xq
 * @create 2024/9/3 13:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除文章 VO")
public class DeleteArticleReqVO {

    @NotNull(message = "文章 ID 不能为空")
    private Long id;
}

