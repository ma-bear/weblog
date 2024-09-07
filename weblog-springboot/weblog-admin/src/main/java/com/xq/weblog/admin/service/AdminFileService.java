package com.xq.weblog.admin.service;

import com.xq.weblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xq
 * @create 2024/9/3 0:08
 */
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}

