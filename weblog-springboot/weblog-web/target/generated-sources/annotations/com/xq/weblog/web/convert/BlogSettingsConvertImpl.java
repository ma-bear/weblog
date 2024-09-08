package com.xq.weblog.web.convert;

import com.xq.weblog.common.domain.dos.BlogSettingsDO;
import com.xq.weblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-08T22:39:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class BlogSettingsConvertImpl implements BlogSettingsConvert {

    @Override
    public FindBlogSettingsDetailRspVO convertDO2VO(BlogSettingsDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindBlogSettingsDetailRspVO.FindBlogSettingsDetailRspVOBuilder findBlogSettingsDetailRspVO = FindBlogSettingsDetailRspVO.builder();

        findBlogSettingsDetailRspVO.logo( bean.getLogo() );
        findBlogSettingsDetailRspVO.name( bean.getName() );
        findBlogSettingsDetailRspVO.author( bean.getAuthor() );
        findBlogSettingsDetailRspVO.introduction( bean.getIntroduction() );
        findBlogSettingsDetailRspVO.avatar( bean.getAvatar() );
        findBlogSettingsDetailRspVO.githubHomepage( bean.getGithubHomepage() );
        findBlogSettingsDetailRspVO.csdnHomepage( bean.getCsdnHomepage() );
        findBlogSettingsDetailRspVO.giteeHomepage( bean.getGiteeHomepage() );
        findBlogSettingsDetailRspVO.zhihuHomepage( bean.getZhihuHomepage() );

        return findBlogSettingsDetailRspVO.build();
    }
}
