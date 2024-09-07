package com.xq.weblog.admin.service;

import com.xq.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.xq.weblog.common.utils.Response;

/**
 * @author xq
 * @create 2024/9/3 0:13
 */
public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}

