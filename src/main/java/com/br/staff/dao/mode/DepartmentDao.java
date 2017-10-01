package com.br.staff.dao.mode;

import java.util.Date;

/**
 * Created by walter on 17/10/1.
 */
public class DepartmentDao {
    /*部门id*/
    private int id;
    /*上级部门id*/
    private int parent;

    /*部门名称*/
    private String name;

    /*所属公司id*/
    private int companyId;

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

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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
