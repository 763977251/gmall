package com.atguigu.gmall.search.feign;

import com.atguigu.gmall.pms.feign.GmallPmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("pms-service")
public interface GmallPmsFeign extends GmallPmsApi {
}
