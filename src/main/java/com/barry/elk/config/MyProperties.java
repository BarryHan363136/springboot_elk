package com.barry.elk.config;

//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;

/**
 * @author: hants
 * @create: 2017/9/30 16:45
 * desc:
 */
@Component
//@ConfigurationProperties(prefix = "myproperties", ignoreUnknownFields = false)
public class MyProperties {
    private final CorsConfiguration cors = new CorsConfiguration();

    public CorsConfiguration getCors() {
        return cors;
    }

    private final Logging logging = new Logging();

    public Logging getLogging() { return logging; }

    public static class Logging {

        private final Logstash logstash = new Logstash();

        public Logstash getLogstash() { return logstash; }

        public static class Logstash {

            private boolean enabled = false;

            private String host = "192.168.1.50";

            private int port = 5000;

            private int queueSize = 512;

            public boolean isEnabled() { return enabled; }

            public void setEnabled(boolean enabled) { this.enabled = enabled; }

            public String getHost() { return host; }

            public void setHost(String host) { this.host = host; }

            public int getPort() { return port; }

            public void setPort(int port) { this.port = port; }

            public int getQueueSize() { return queueSize; }

            public void setQueueSize(int queueSize) { this.queueSize = queueSize; }
        }

    }
}