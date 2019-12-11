package com.springcloud.service.user.service;

import com.springcloud.api.order.DTO.OrderDTO;
import com.springcloud.api.user.DTO.UserDTO;
import com.springcloud.api.user.service.UserService;
import com.springcloud.common.resopnse.Response;
import com.springcloud.service.user.feign.OrderServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 14:31
 * @Description: todo
 */
@RestController
@RequestMapping("user")
public class UserServiceImpl implements UserService {

    @Autowired
    private OrderServiceFeign orderServiceFeign;

    @Override
    public Response<Object> getUserById(@RequestBody UserDTO userDTO) {
        if(userDTO == null || userDTO.getId() == null){
            return new Response<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUserId(userDTO.getId());
        return new Response<>(orderServiceFeign.getOrderByUserId(orderDTO));
    }
}
