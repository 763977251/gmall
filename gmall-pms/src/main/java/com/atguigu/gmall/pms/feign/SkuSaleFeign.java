package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.sms.feign.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("sms-service")
public interface SkuSaleFeign extends GmallSmsApi {

}
