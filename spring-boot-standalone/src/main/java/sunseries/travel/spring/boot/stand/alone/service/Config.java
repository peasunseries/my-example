package sunseries.travel.spring.boot.stand.alone.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.InetAddress;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("connection")
public class Config {
    private String username;

    private InetAddress remoteAddress;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public String toString() {
        return "Config{" +
                "username='" + username + '\'' +
                ", remoteAddress=" + remoteAddress +
                '}';
    }
}
