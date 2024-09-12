package com.xq.weblog.admin.model.vo.article;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author: xq
 * @date: 2023-09-15 14:07
 * @description: 更新文章发布状态
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "更新文章发布状态 VO")
public class UpdateArticleIsPublishReqVO {

    @NotNull(message = "文章 ID 不能为空")
    private Long id;

    @NotNull(message = "文章发布状态不能为空")
    private Boolean isPublish;
}
