package com.lcf.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.lcf.mall.mbg.mapper","com.lcf.mall.dao"})
public class MyBatisConfig {
}