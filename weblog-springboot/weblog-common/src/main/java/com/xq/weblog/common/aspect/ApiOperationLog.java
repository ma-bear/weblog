package com.xq.weblog.common.aspect;

import java.lang.annotation.*;

/**
 * @author 29923
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}
