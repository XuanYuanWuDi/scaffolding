package com.lzx.scaffold.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.scaffold.entity.response.BaseResponse;
import com.lzx.scaffold.service.UserService;
import com.lzx.scaffold.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: lzx
 * @Date: 2019/3/6 18:33
 * @Description:
 */
@RestController("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/get/{id}")
    public BaseResponse getUser(@PathVariable Integer id){
          return ResponseUtil.success(userService.getUserById(id));
    }

    @RequestMapping("/test")
    public BaseResponse test(@RequestBody String json){
        return ResponseUtil.success(json);
    }
}
