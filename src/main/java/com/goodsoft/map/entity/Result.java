package com.goodsoft.map.entity;

import java.util.Objects;

/**
 * function 结果集实体
 * Created by 严彬荣 on 2017/9/26.
 * version v1.0
 */
public class Result implements java.io.Serializable {
    private int errorCode;//状态码
    private Object data;//数据

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(int errorCode, Object data) {
        this.errorCode = errorCode;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return errorCode == result.errorCode &&
                Objects.equals(data, result.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, data);
    }
}
