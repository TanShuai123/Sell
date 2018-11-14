package com.immoc.sell.service;

import com.immoc.sell.dto.OrderDTO;

public interface PushMessageService {

    /**
     * 订单状态变更
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
