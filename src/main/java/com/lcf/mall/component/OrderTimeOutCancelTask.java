package com.lcf.mall.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderTimeOutCancelTask {

    private Logger logger = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    @Scheduled(cron = "0 0/10 * * * ?")
    private void cancelTimeOutOrder(){
        logger.info("取消订单，并根据sku编号释放库存");
    }
}
