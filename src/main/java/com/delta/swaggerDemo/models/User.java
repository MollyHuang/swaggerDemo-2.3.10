package com.delta.swaggerDemo.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("使用者實體")
public class User {
    @ApiModelProperty("使用者名稱")
    public String username;
    @ApiModelProperty("密碼")
    public String password;
}