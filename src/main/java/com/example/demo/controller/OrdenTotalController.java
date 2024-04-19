package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 总单表 前端控制器
 * </p>
 *
 * @author jack
 * @since 2024-04-10
 */
@RestController
@RequestMapping("/orden-total")
@Validated
public class OrdenTotalController {

    @RequestMapping("/test")
    public Map test() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "xiaxiaxia");
        map.put("message", "还不下班啊");
        return map;
    }


}
