package com.xq.weblog.admin.service;

import com.xq.weblog.admin.model.vo.comment.DeleteCommentReqVO;
import com.xq.weblog.admin.model.vo.comment.ExamineCommentReqVO;
import com.xq.weblog.admin.model.vo.comment.FindCommentPageListReqVO;
import com.xq.weblog.common.utils.Response;

/**
 * @author: xq
 * @date: 2023-09-15 14:03
 * @description: 评论
 **/
public interface AdminCommentService {

    /**
     * 查询评论分页数据
     * @param findCommentPageListReqVO
     * @return
     */
    Response findCommentPageList(FindCommentPageListReqVO findCommentPageListReqVO);

    /**
     * 删除评论
     * @param deleteCommentReqVO
     * @return
     */
    Response deleteComment(DeleteCommentReqVO deleteCommentReqVO);

    /**
     * 评论审核
     * @param examineCommentReqVO
     * @return
     */
    Response examine(ExamineCommentReqVO examineCommentReqVO);

}
