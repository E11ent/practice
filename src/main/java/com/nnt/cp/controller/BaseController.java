package com.nnt.cp.controller;
import java.io.Serializable;
import com.nnt.cp.service.ex.ServiceException;
import com.nnt.cp.service.ex.UsernameDuplicatedException;
import com.nnt.cp.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class BaseController {
    public static final int OK = 200;

    @ExceptionHandler(ServiceException.class)
    public String handleException(Throwable e){
        if (e instanceof UsernameDuplicatedException){
            return "用户名已被占用！";
        }

        return "暂无异常";
    }
}
