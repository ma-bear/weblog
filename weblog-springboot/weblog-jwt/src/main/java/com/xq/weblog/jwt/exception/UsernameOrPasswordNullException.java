package com.xq.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author xq
 * @create 2024/9/1 16:17
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}

