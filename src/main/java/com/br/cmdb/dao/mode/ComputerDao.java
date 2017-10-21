package com.br.cmdb.dao.mode;

/**
 * Created by walter on 17/10/21.
 */
public class ComputerDao {

    /**
     * id
     */
    private int id;

    /**
     * ipd
     */
    private String ip;

    private String hostname;

    private String cpu;

    private String os;

    private String memory;

    private String disk;

    private String net;

    /**
     * 机器运维管理初始化帐户密码
     */
    private String user;

    private String passd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassd() {
        return passd;
    }

    public void setPassd(String passd) {
        this.passd = passd;
    }
}
