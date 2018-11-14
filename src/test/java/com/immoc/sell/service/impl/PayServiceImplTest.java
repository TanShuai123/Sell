package com.immoc.sell.service.impl;

import com.immoc.sell.dto.OrderDTO;
import com.immoc.sell.service.OrderService;
import com.immoc.sell.service.PayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO=orderService.findOne("1540203878651308178");
        payService.create(orderDTO);
    }

    @Test
    public void refund(){
        OrderDTO orderDTO=orderService.findOne("1542011619827233701");
        payService.refund(orderDTO);
    }
}