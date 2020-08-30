package com.example.openapi.controller;

import com.example.openapi.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XuYang
 * @date 2020/8/28 14:33
 */
@Tag(name = "HelloController", description = "Hello 控制器")
@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @Operation(summary = "简单说明接口作用", description = "这里可以写详细的接口描述")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @Operation(summary = "用户登录", description = "通过用户名和密码进行登录")
    @GetMapping("/login")
    public String login(@Parameter(description = "用户名 ") String username,
                        @Parameter(description = "密码") String password) {
        return "login success!";
    }

    @Operation(summary = "更新用户", description = "根据用户 id 更新用户的信息")
    @PostMapping("/update/{uid}")
    public String update(@Parameter(description = "用户 id")Long uid,
                         @Parameter(description = "用户信息") User user) {
        return "update success!";
    }

}
