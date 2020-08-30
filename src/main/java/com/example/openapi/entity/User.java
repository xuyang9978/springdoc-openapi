package com.example.openapi.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author XuYang
 * @date 2020/8/28 20:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "用户实体类")
public class User {

    @Schema(description = "用户 id")
    private Long uid;

    @Schema(description = "用户名", example = "xuyang")
    private String username;

    @Schema(description = "密码", example = "123456", maxLength = 18)
    private String password;
}
