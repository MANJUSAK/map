package com.goodsoft.map.entity;

/**
 * function 经纬度实体
 * Created by 严彬荣 on 2017/9/26.
 * version v1.0
 */
public class LatLongtude implements java.io.Serializable {
    private double lng;//纬度
    private double lat;//经度

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
