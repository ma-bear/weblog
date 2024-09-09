package com.xq.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xq.weblog.common.domain.dos.CommentDO;

import java.util.List;

/**
 * @author: xq
 * @date: 2023-08-22 17:06
 * @description: 评论
 **/
public interface CommentMapper extends BaseMapper<CommentDO> {

    /**
     * 根据路由地址、状态查询对应的评论
     * @param routerUrl
     * @return
     */
    default List<CommentDO> selectByRouterUrlAndStatus(String routerUrl, Integer status) {
        return selectList(Wrappers.<CommentDO>lambdaQuery()
                .eq(CommentDO::getRouterUrl, routerUrl) // 按路由地址查询
                .eq(CommentDO::getStatus, status) // 按状态查询
                .orderByDesc(CommentDO::getCreateTime) // 按创建时间倒序
        );
    }
}
