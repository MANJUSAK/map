package com.goodsoft.map.controller;

import com.goodsoft.map.util.LngLatUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * function 百度地图API 获取地址经纬度
 * Created by 严彬荣 on 2017/9/26.
 * version v1.0
 */
@RestController
public class LngLatContraller {

    /**
     * 根据地址获取经纬度接口
     *
     * @param address 地址
     * @return 响应结果
     */
    @RequestMapping("/getLngLat")
    public Object getLngLat(@RequestParam(required = true) String address) throws Exception {
        return LngLatUtil.getLngAndLat(address);
    }

}
