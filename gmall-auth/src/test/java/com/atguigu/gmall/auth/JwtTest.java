package com.atguigu.gmall.auth;

import com.atguigu.core.utils.JwtUtils;
import com.atguigu.core.utils.RsaUtils;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {
	private static final String pubKeyPath = "E:\\project\\JetBrains\\gmall\\rsa\\rsa.pub";

    private static final String priKeyPath = "E:\\project\\JetBrains\\gmall\\rsa\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "2432sdsdAD@#@#sfdsf23");
    }

    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "11");
        map.put("username", "liuyan");
        // 生成token
        String token = JwtUtils.generateToken(map, privateKey, 1);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6IjExIiwidXNlcm5hbWUiOiJsaXV5YW4iLCJleHAiOjE1ODQ5NTM3Nzl9.e_18VlEYDv3-oSftTYidaOpY8o-wHljDhpBL4Sv682JlYsH5W7isOdSDL5pptiuZXnApUG4JPGET2i72lRqG8I3CUWoDQwjIAe0t_P2OrO7u0XdsNyU4NwmCHWib7HI6wCvsXfxpkniurysgEQknisS-JamQZM2bv3WW4JzdKuOJ7EIqAyloljXyADDHewy9sAzMfHyiuGmJnTfW0S5ZpvfhmQ8T1UVB5f6lkjkTOyglFaGp-TyA5WnSYataQAUQq_6SsWiHvpPDvcZ35D_TM_Ncjitun7nBqzUENIs8xwSTcawfxQ0qrXwiIfR-6QWiF5AXYWYTNqV-wKnswrDibQ";

        // 解析token
        Map<String, Object> map = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + map.get("id"));
        System.out.println("userName: " + map.get("username"));
    }
}