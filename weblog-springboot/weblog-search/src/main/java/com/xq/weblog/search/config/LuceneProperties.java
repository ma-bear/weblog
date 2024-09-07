package com.xq.weblog.search.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xq
 * @create 2024/9/7 15:26
 */
@ConfigurationProperties(prefix = "lucene")
@Component
@Data
public class LuceneProperties {
    /**
     * 索引存放的文件夹
     */
    private String indexDir;
}
