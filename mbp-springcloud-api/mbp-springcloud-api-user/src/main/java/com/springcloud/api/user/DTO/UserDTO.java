package com.springcloud.api.user.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 11:27
 * @Description: todo
 */
@Data
@ApiModel(value = "用户请求参数")
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -248702579637010136L;
    @ApiModelProperty("用户id")
    private Long id;

    private String userName;

    private String addr;

}
