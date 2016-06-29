package com.zengcode.model;


import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.io.Serializable;

@Document
public class AdvertModel implements Serializable {

    @Id
    private String id;

    @Field("name") //in couchbase
    private String name;

    @Field
    private String description;

    @Field
    private int ownerId;

    @Field
    private int maximumClick;

    @Field
    private int currentClick = 0;

    @Field
    private int maximumImpression;

    @Field
    private int currentImpression = 0;

    @Field
    private AdvertImageModel advertImageModel;

    @Field
    private boolean enabled = true;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getMaximumClick() {
        return maximumClick;
    }

    public void setMaximumClick(int maximumClick) {
        this.maximumClick = maximumClick;
    }

    public int getCurrentClick() {
        return currentClick;
    }

    public void setCurrentClick(int currentClick) {
        this.currentClick = currentClick;
    }

    public AdvertImageModel getAdvertImageModel() {
        return advertImageModel;
    }

    public void setAdvertImageModel(AdvertImageModel advertImageModel) {
        this.advertImageModel = advertImageModel;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getMaximumImpression() {
        return maximumImpression;
    }

    public void setMaximumImpression(int maximumImpression) {
        this.maximumImpression = maximumImpression;
    }

    public int getCurrentImpression() {
        return currentImpression;
    }

    public void setCurrentImpression(int currentImpression) {
        this.currentImpression = currentImpression;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "AdvertModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ownerId=" + ownerId +
                ", maximumClick=" + maximumClick +
                ", currentClick=" + currentClick +
                ", maximumImpression=" + maximumImpression +
                ", currentImpression=" + currentImpression +
                ", advertImageModel=" + advertImageModel +
                ", enabled=" + enabled +
                '}';
    }
}
