package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.atguigu.gmall.pms.vo.CategoryVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品三级分类
 * 
 * @author shanggao
 * @email 763977251@qq.com
 * @date 2020-01-15 12:44:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
    List<CategoryVO> querySubCategories(Long pid);
}
