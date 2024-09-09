package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.wiki.FindWikiPageListRspVO;
import com.xq.weblog.common.domain.dos.WikiDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T19:47:24+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class WikiConvertImpl implements WikiConvert {

    @Override
    public FindWikiPageListRspVO convertDO2VO(WikiDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindWikiPageListRspVO.FindWikiPageListRspVOBuilder findWikiPageListRspVO = FindWikiPageListRspVO.builder();

        findWikiPageListRspVO.id( bean.getId() );
        findWikiPageListRspVO.title( bean.getTitle() );
        findWikiPageListRspVO.cover( bean.getCover() );
        findWikiPageListRspVO.summary( bean.getSummary() );
        findWikiPageListRspVO.createTime( bean.getCreateTime() );
        findWikiPageListRspVO.isPublish( bean.getIsPublish() );

        findWikiPageListRspVO.isTop( bean.getWeight() > 0 );

        return findWikiPageListRspVO.build();
    }
}
