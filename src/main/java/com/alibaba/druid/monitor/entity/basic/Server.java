package com.alibaba.druid.monitor.entity.basic;

import com.alibaba.druid.monitor.annotation.MField;

/**
 * 服务器信息
 * 
 * @author wenshao<szujobs@hotmail.com>
 */
public class Server {

    private long   id;

    @MField(desc = "服务器的唯一编码")
    private String number;

    @MField(name = "位置", desc = "地理位置信息")
    private String location;
    
    private String description;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}