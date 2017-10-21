package com.br.app.dao.mode;

/**
 * Created by walter on 17/10/21.
 */
public class AppDao {

    private int id;

    private String name;

    /**
     * 仅指向svn应用名称，不用指向trunk/branch
     */
    private String svn;
    /**
     * 应用归属人性名
     */
    private String ownerName;
    /**
     * 应用归属人：staffid
     */
    private String Ownerid;

    /**
     * 应用归属部门id
     */
    private String dpmtId;

    /**
     * 应用归属部门名称
     */
    private String dpmtName;

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

    public String getSvn() {
        return svn;
    }

    public void setSvn(String svn) {
        this.svn = svn;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerid() {
        return Ownerid;
    }

    public void setOwnerid(String ownerid) {
        Ownerid = ownerid;
    }

    public String getDpmtId() {
        return dpmtId;
    }

    public void setDpmtId(String dpmtId) {
        this.dpmtId = dpmtId;
    }

    public String getDpmtName() {
        return dpmtName;
    }

    public void setDpmtName(String dpmtName) {
        this.dpmtName = dpmtName;
    }
}
