package com.atguigu.gmall.item.feign;

import com.atguigu.gmall.wms.feign.GmallWmsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("wms-service")
public interface GmallWmsClient extends GmallWmsApi {
}
