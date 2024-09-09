package com.xq.weblog.web.convert;

import com.xq.weblog.common.domain.dos.CommentDO;
import com.xq.weblog.web.model.vo.comment.FindCommentItemRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: xq
 * @date: 2023/10/8 14:57
 * @description: 评论实体类转换
 **/
@Mapper
public interface CommentConvert {
    /**
     * 初始化 convert 实例
     */
    CommentConvert INSTANCE = Mappers.getMapper(CommentConvert.class);

    /**
     * CommentDO -> FindCommentItemRspVO
     * @param bean
     * @return
     */
    FindCommentItemRspVO convertDO2VO(CommentDO bean);

}
