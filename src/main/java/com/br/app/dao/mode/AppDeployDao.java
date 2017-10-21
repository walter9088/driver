package com.br.app.dao.mode;

/**
 * Created by walter on 17/10/21.
 */
public class AppDeployDao {

    private int id;
    /**
     * 部署目标机器:ip
     */
    private String dIp;
    /**
     * 部署目录
     */
    private String dDir;

    /**
     * 启动脚本
     */
    private String startScript;

    /**
     * 启动参数
     */
    private String param;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdIp() {
        return dIp;
    }

    public void setdIp(String dIp) {
        this.dIp = dIp;
    }

    public String getdDir() {
        return dDir;
    }

    public void setdDir(String dDir) {
        this.dDir = dDir;
    }

    public String getStartScript() {
        return startScript;
    }

    public void setStartScript(String startScript) {
        this.startScript = startScript;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
