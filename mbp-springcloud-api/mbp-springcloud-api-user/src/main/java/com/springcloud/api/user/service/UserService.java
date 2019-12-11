package com.springcloud.api.user.service;

import com.springcloud.api.user.DTO.UserDTO;
import com.springcloud.common.resopnse.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 11:29
 * @Description: todo
 */
@Api(tags="用户服务接口")
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param userDTO
     * @return
     */
    @PostMapping("getUserById")
    @ApiOperation("根据id查询用户信息")
    Response<Object> getUserById(@RequestBody UserDTO userDTO);

}
