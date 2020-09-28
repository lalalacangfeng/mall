package com.lcf.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.lcf.mall.mbg.mapper","com.lcf.mall.dao"})
public class MyBatisConfig {
}