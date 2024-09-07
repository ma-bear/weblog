package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.xq.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.xq.weblog.common.domain.dos.BlogSettingsDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-07T16:50:11+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class BlogSettingsConvertImpl implements BlogSettingsConvert {

    @Override
    public BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        BlogSettingsDO.BlogSettingsDOBuilder blogSettingsDO = BlogSettingsDO.builder();

        blogSettingsDO.logo( bean.getLogo() );
        blogSettingsDO.name( bean.getName() );
        blogSettingsDO.author( bean.getAuthor() );
        blogSettingsDO.introduction( bean.getIntroduction() );
        blogSettingsDO.avatar( bean.getAvatar() );
        blogSettingsDO.githubHomepage( bean.getGithubHomepage() );
        blogSettingsDO.csdnHomepage( bean.getCsdnHomepage() );
        blogSettingsDO.giteeHomepage( bean.getGiteeHomepage() );
        blogSettingsDO.zhihuHomepage( bean.getZhihuHomepage() );

        return blogSettingsDO.build();
    }

    @Override
    public FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean) {
        if ( bean == null ) {
            return null;
        }

        FindBlogSettingsRspVO.FindBlogSettingsRspVOBuilder findBlogSettingsRspVO = FindBlogSettingsRspVO.builder();

        findBlogSettingsRspVO.logo( bean.getLogo() );
        findBlogSettingsRspVO.name( bean.getName() );
        findBlogSettingsRspVO.author( bean.getAuthor() );
        findBlogSettingsRspVO.introduction( bean.getIntroduction() );
        findBlogSettingsRspVO.avatar( bean.getAvatar() );
        findBlogSettingsRspVO.githubHomepage( bean.getGithubHomepage() );
        findBlogSettingsRspVO.csdnHomepage( bean.getCsdnHomepage() );
        findBlogSettingsRspVO.giteeHomepage( bean.getGiteeHomepage() );
        findBlogSettingsRspVO.zhihuHomepage( bean.getZhihuHomepage() );

        return findBlogSettingsRspVO.build();
    }
}
