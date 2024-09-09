package com.xq.weblog.web.convert;

import com.xq.weblog.common.domain.dos.CommentDO;
import com.xq.weblog.web.model.vo.comment.FindCommentItemRspVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T19:47:32+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CommentConvertImpl implements CommentConvert {

    @Override
    public FindCommentItemRspVO convertDO2VO(CommentDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindCommentItemRspVO.FindCommentItemRspVOBuilder findCommentItemRspVO = FindCommentItemRspVO.builder();

        findCommentItemRspVO.id( bean.getId() );
        findCommentItemRspVO.avatar( bean.getAvatar() );
        findCommentItemRspVO.nickname( bean.getNickname() );
        findCommentItemRspVO.website( bean.getWebsite() );
        findCommentItemRspVO.content( bean.getContent() );
        findCommentItemRspVO.createTime( bean.getCreateTime() );

        return findCommentItemRspVO.build();
    }
}
