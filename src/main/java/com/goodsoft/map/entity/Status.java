package com.goodsoft.map.entity;

import java.util.Objects;

/**
 * function 系统响应结果集实体
 * Created by 严彬荣 on 2017/9/26.
 * version v1.0
 */
public class Status implements java.io.Serializable {
    private int errorCode;//状态码
    private String msg;//描述

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Status(int errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return errorCode == status.errorCode &&
                Objects.equals(msg, status.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, msg);
    }


}
