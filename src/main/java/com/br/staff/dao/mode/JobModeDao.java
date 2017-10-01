package com.br.staff.dao.mode;

/**
 * Created by walter on 17/10/1.
 */

import java.util.Date;

/**
 * 公司岗位名称
 */
public class JobModeDao {

    /**
     * 岗位id
     */
    private int id;
    /**
     * 岗位名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;


    /**
     * 修改日期
     */
    private Date gmt_modify;

    /**
     * 创建日期
     */
    private Date gmt_create;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getGmt_modify() {
        return gmt_modify;
    }

    public void setGmt_modify(Date gmt_modify) {
        this.gmt_modify = gmt_modify;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }
}
