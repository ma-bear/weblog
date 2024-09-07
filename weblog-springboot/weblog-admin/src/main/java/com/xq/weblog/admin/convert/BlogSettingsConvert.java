package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.xq.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.xq.weblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author xq
 * @create 2024/9/3 0:24
 */
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);

}

