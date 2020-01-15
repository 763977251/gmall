package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author shanggao
 * @email 763977251@qq.com
 * @date 2020-01-15 14:47:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
