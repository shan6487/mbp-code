package com.springcloud.service.order.service;


import com.springcloud.api.order.DTO.OrderDTO;
import com.springcloud.api.order.service.OrderService;
import com.springcloud.common.resopnse.Response;
import com.springcloud.service.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 18:42
 * @Description: todo
 */
@RestController
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public Response<List<OrderDTO>> getOrderByUserId(@RequestBody OrderDTO orderDTO) {
        if(orderDTO == null || orderDTO.getUserId() == null){
            return new Response<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        System.out.println("serverPort:" + serverPort);
        return new Response<>(orderMapper.getOrderByUserId(orderDTO));
    }
}
