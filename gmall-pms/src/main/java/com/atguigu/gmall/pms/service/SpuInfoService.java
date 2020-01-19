package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.SpuInfoVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息
 *
 * @author shanggao
 * @email 763977251@qq.com
 * @date 2020-01-15 12:44:40
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo querySpuInfo(QueryCondition condition, Long catId);

    void saveSpuInfoVO(SpuInfoVO spuInfoVO);

    void saveSkuInfoWithSaleInfo(SpuInfoVO spuInfoVO);

    void saveBaseAttrs(SpuInfoVO spuInfoVO);

    void saveSpuDesc(SpuInfoVO spuInfoVO);

    void saveSpuInfo(SpuInfoVO spuInfoVO);
}

