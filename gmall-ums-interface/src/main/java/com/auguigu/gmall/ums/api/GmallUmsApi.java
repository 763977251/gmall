package com.auguigu.gmall.ums.api;

import com.atguigu.core.bean.Resp;
import com.auguigu.gmall.ums.entity.MemberEntity;
import com.auguigu.gmall.ums.entity.MemberReceiveAddressEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface GmallUmsApi {

    @GetMapping("ums/member/info/{id}")
    public Resp<MemberEntity> queryMemberById(@PathVariable("id") Long id);

    @GetMapping("ums/member/query")
    public Resp<MemberEntity> queryUser(@RequestParam("username") String username, @RequestParam("password") String password);

    @GetMapping("ums/memberreceiveaddress/{userId}")
    public Resp<List<MemberReceiveAddressEntity>> queryAddressesByUserId(@PathVariable("userId") Long userId);

}
