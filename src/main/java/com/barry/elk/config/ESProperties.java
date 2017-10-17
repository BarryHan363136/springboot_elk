package com.barry.elk.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 指定读取参数的配置文件
 * @ConfigurationProperties(prefix = "wisely",locations = "classpath:config/wisely.properties")
 */

/**
 * 如不指定locations则默认在application.properties中获取
 */
@ConfigurationProperties(prefix = "esConfig")
public class ESProperties {

    private String clusterName;

    private String nodeName;

    private String serverIp;

    private String serverPort;

    private String index;

    private String type;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
