package com.lcf.mall.dao;

import com.lcf.mall.nosql.elasticsearch.document.EsProduct;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 */
public interface  EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
