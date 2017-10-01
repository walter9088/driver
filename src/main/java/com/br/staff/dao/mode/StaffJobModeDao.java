package com.br.staff.dao.mode;

import java.util.Date;

/**
 * Created by walter on 17/10/1.
 */
public class StaffJobModeDao {

    /**
     * id
     */
    private int id;
    /**
     * staffid
     */
    private int staffId;

    /**
     * jobModeId
     */
    private int jobModeId;

    /**
     * 部门id
     */
    private int departmentId;

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

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getJobModeId() {
        return jobModeId;
    }

    public void setJobModeId(int jobModeId) {
        this.jobModeId = jobModeId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
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
