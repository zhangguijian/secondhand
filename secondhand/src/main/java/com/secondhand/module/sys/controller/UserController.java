package com.secondhand.module.sys.controller;


import com.secondhand.common.basemethod.ApiResult;
import com.secondhand.common.basemethod.PageApiResult;
import com.secondhand.module.sys.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Erica
 * @since 2020-01-31
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //  获取列表
    @RequestMapping("/test1")
    public ApiResult test1(){
        return ApiResult.success(userService.test1());
    }

    @RequestMapping("/test2")
    public PageApiResult test2(){
        Integer pageNum=1;
        Integer PageSize=10;
        return userService.test2(pageNum,PageSize);
    }

}
