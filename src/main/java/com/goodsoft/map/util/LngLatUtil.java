package com.goodsoft.map.util;

import com.goodsoft.map.entity.LatLongtude;
import com.goodsoft.map.entity.Result;
import com.goodsoft.map.entity.Status;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * function 通过百度地图API获取地址经纬度
 * Created by 严彬荣 on 2017/9/26.
 * version v1.0
 */
public class LngLatUtil {
    private static final String URLS = "http://api.map.baidu.com/geocoder/v2/?output=json&ak=5bSX6lqF6irleeYplWXQVTFYz4tgw2Is&address=";

    /**
     * 更具地址查询经纬度
     *
     * @param address 地址
     * @return 查询结果
     */
    public static Object getLngAndLat(String address) {
        StringBuilder sb = new StringBuilder(URLS);
        sb.append(address);
        String json = loadJSON(sb.toString());
        if (null == json) {
            return new Status(404, "未找到匹配的经纬度，请输入详细的地址!");
        }
        JSONObject obj = JSONObject.fromObject(json);
        int i = Integer.parseInt(obj.get("status").toString());
        if (i == 0) {
            LatLongtude data = new LatLongtude();
            double lng = obj.getJSONObject("result").getJSONObject("location").getDouble("lng");
            double lat = obj.getJSONObject("result").getJSONObject("location").getDouble("lat");
            data.setLng(lng);
            data.setLat(lat);
            return new Result(0, data);
        } else {
            return new Status(404, "未找到匹配的经纬度，请输入详细的地址!");
        }
    }

    /**
     * 打开百度地图API
     *
     * @param url 百度api
     * @return 查询结果
     */
    private static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL url_1 = new URL(url);
            URLConnection uct = url_1.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(uct.getInputStream()));
            String inputLine = null;
            while ((inputLine = br.readLine()) != null) {
                json.append(inputLine);
            }
            br.close();
            return json.toString();
        } catch (Exception e) {
            return null;
        }

    }
}
