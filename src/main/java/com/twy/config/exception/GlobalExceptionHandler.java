package com.twy.config.exception;

import com.twy.utils.ErrorEnum;
import com.twy.utils.ResponseMessage;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    /**
     * 权限不足返回信息
     *
     * @return
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseMessage unauthorizedExceptionHandler() {
        return new ResponseMessage(ErrorEnum.E_UNAUTHORIZED);
    }

    /**
     * 未登录报错拦截
     * 在请求需要权限的接口,而连登录都还没登录的时候,会报此错
     */
    @ExceptionHandler(UnauthenticatedException.class)
    public ResponseMessage unauthenticatedException() {
        return new ResponseMessage(ErrorEnum.E_UNAUTHENTICATED);
    }

}