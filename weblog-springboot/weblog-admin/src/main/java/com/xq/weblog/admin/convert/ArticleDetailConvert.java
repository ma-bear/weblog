package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.xq.weblog.common.domain.dos.ArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author xq
 * @create 2024/9/3 13:25
 */
@Mapper
public interface ArticleDetailConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}

