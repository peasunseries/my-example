package com.zengcode.model;


public class PropertiesModel {
    private int redisPort = 6379;
    private String redisHost;
    private String couchBaseHost;
    private String couchBaseBucket;
    private String couchBaseBucketPassword;

    public int getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(int redisPort) {
        this.redisPort = redisPort;
    }

    public String getRedisHost() {
        return redisHost;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public String getCouchBaseHost() {
        return couchBaseHost;
    }

    public void setCouchBaseHost(String couchBaseHost) {
        this.couchBaseHost = couchBaseHost;
    }

    public String getCouchBaseBucket() {
        return couchBaseBucket;
    }

    public void setCouchBaseBucket(String couchBaseBucket) {
        this.couchBaseBucket = couchBaseBucket;
    }

    public String getCouchBaseBucketPassword() {
        return couchBaseBucketPassword;
    }

    public void setCouchBaseBucketPassword(String couchBaseBucketPassword) {
        this.couchBaseBucketPassword = couchBaseBucketPassword;
    }

    @Override
    public String toString() {
        return "PropertiesModel{" +
                "redisPort=" + redisPort +
                ", redisHost='" + redisHost + '\'' +
                ", couchBaseHost='" + couchBaseHost + '\'' +
                ", couchBaseBucket='" + couchBaseBucket + '\'' +
                ", couchBaseBucketPassword='" + couchBaseBucketPassword + '\'' +
                '}';
    }
}
