package com.springcloud.service.user.mapper;

import com.springcloud.api.user.DTO.UserDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 14:50
 * @Description: todo
 */
@Component
public interface UserMapper {

    UserDTO getUserById(UserDTO userDTO);

}
