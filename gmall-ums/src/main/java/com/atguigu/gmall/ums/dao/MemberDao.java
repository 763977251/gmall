package com.atguigu.gmall.ums.dao;

import com.auguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shanggao
 * @email 763977251@qq.com
 * @date 2020-01-15 14:49:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
