package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.comment.FindCommentPageListRspVO;
import com.xq.weblog.common.domain.dos.CommentDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T19:47:24+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CommentConvertImpl implements CommentConvert {

    @Override
    public FindCommentPageListRspVO convertDO2VO(CommentDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindCommentPageListRspVO.FindCommentPageListRspVOBuilder findCommentPageListRspVO = FindCommentPageListRspVO.builder();

        findCommentPageListRspVO.id( bean.getId() );
        findCommentPageListRspVO.routerUrl( bean.getRouterUrl() );
        findCommentPageListRspVO.avatar( bean.getAvatar() );
        findCommentPageListRspVO.nickname( bean.getNickname() );
        findCommentPageListRspVO.mail( bean.getMail() );
        findCommentPageListRspVO.website( bean.getWebsite() );
        findCommentPageListRspVO.createTime( bean.getCreateTime() );
        findCommentPageListRspVO.content( bean.getContent() );
        findCommentPageListRspVO.status( bean.getStatus() );
        findCommentPageListRspVO.reason( bean.getReason() );

        return findCommentPageListRspVO.build();
    }
}
