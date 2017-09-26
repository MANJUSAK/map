package com.goodsoft.map.entity;

/**
 * function 经纬度实体
 * Created by 严彬荣 on 2017/9/26.
 * version v1.0
 */
public class LatLongtude implements java.io.Serializable {
    private double lat;//纬度
    private double lgt;//经度

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLgt() {
        return lgt;
    }

    public void setLgt(double lgt) {
        this.lgt = lgt;
    }
}
