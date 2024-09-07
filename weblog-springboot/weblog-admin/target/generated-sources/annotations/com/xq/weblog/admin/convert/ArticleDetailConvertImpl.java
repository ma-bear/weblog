package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.xq.weblog.common.domain.dos.ArticleDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-07T16:50:11+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ArticleDetailConvertImpl implements ArticleDetailConvert {

    @Override
    public FindArticleDetailRspVO convertDO2VO(ArticleDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindArticleDetailRspVO.FindArticleDetailRspVOBuilder findArticleDetailRspVO = FindArticleDetailRspVO.builder();

        findArticleDetailRspVO.id( bean.getId() );
        findArticleDetailRspVO.title( bean.getTitle() );
        findArticleDetailRspVO.cover( bean.getCover() );
        findArticleDetailRspVO.summary( bean.getSummary() );

        return findArticleDetailRspVO.build();
    }
}
