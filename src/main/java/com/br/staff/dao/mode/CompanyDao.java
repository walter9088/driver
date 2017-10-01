package com.br.staff.dao.mode;

import java.util.Date;

/**
 * Created by walter on 17/10/1.
 */
public class CompanyDao {

    private int id;
    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司地址
     */
    private String address;


    /**
     * 公司电话
     */
    private String telephone;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
