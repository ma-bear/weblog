package com.xq.weblog.web.service;

import com.xq.weblog.common.utils.Response;

/**
 * @author xq
 * @create 2024/9/3 21:55
 */
public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
