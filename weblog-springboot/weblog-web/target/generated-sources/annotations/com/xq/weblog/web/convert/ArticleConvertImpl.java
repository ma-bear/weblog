package com.xq.weblog.web.convert;

import com.xq.weblog.common.domain.dos.ArticleDO;
import com.xq.weblog.web.model.vo.archive.FindArchiveArticleRspVO;
import com.xq.weblog.web.model.vo.article.FindIndexArticlePageListRspVO;
import com.xq.weblog.web.model.vo.category.FindCategoryArticlePageListRspVO;
import com.xq.weblog.web.model.vo.tag.FindTagArticlePageListRspVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-08T22:39:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ArticleConvertImpl implements ArticleConvert {

    @Override
    public FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindIndexArticlePageListRspVO.FindIndexArticlePageListRspVOBuilder findIndexArticlePageListRspVO = FindIndexArticlePageListRspVO.builder();

        findIndexArticlePageListRspVO.id( bean.getId() );
        findIndexArticlePageListRspVO.cover( bean.getCover() );
        findIndexArticlePageListRspVO.title( bean.getTitle() );
        findIndexArticlePageListRspVO.summary( bean.getSummary() );

        findIndexArticlePageListRspVO.createDate( java.time.LocalDate.from(bean.getCreateTime()) );

        return findIndexArticlePageListRspVO.build();
    }

    @Override
    public FindArchiveArticleRspVO convertDO2ArchiveArticleVO(ArticleDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindArchiveArticleRspVO.FindArchiveArticleRspVOBuilder findArchiveArticleRspVO = FindArchiveArticleRspVO.builder();

        findArchiveArticleRspVO.id( bean.getId() );
        findArchiveArticleRspVO.cover( bean.getCover() );
        findArchiveArticleRspVO.title( bean.getTitle() );

        findArchiveArticleRspVO.createDate( java.time.LocalDate.from(bean.getCreateTime()) );
        findArchiveArticleRspVO.createMonth( java.time.YearMonth.from(bean.getCreateTime()) );

        return findArchiveArticleRspVO.build();
    }

    @Override
    public FindCategoryArticlePageListRspVO convertDO2CategoryArticleVO(ArticleDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindCategoryArticlePageListRspVO.FindCategoryArticlePageListRspVOBuilder findCategoryArticlePageListRspVO = FindCategoryArticlePageListRspVO.builder();

        findCategoryArticlePageListRspVO.id( bean.getId() );
        findCategoryArticlePageListRspVO.cover( bean.getCover() );
        findCategoryArticlePageListRspVO.title( bean.getTitle() );

        findCategoryArticlePageListRspVO.createDate( java.time.LocalDate.from(bean.getCreateTime()) );

        return findCategoryArticlePageListRspVO.build();
    }

    @Override
    public FindTagArticlePageListRspVO convertDO2TagArticleVO(ArticleDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindTagArticlePageListRspVO.FindTagArticlePageListRspVOBuilder findTagArticlePageListRspVO = FindTagArticlePageListRspVO.builder();

        findTagArticlePageListRspVO.id( bean.getId() );
        findTagArticlePageListRspVO.cover( bean.getCover() );
        findTagArticlePageListRspVO.title( bean.getTitle() );

        findTagArticlePageListRspVO.createDate( java.time.LocalDate.from(bean.getCreateTime()) );

        return findTagArticlePageListRspVO.build();
    }
}
