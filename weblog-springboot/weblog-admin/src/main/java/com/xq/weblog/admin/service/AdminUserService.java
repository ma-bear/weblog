package com.xq.weblog.admin.service;

import com.xq.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.xq.weblog.common.utils.Response;

/**
 * @author xq
 * @create 2024/9/2 13:45
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}

