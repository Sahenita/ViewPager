
package com.example.testapp.TestDemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoZone {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("free")
    @Expose
    private Integer free;
    @SerializedName("registration_needed")
    @Expose
    private Integer registrationNeeded;
    @SerializedName("video_id")
    @Expose
    private Integer videoId;
    @SerializedName("zone_id")
    @Expose
    private Integer zoneId;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getRegistrationNeeded() {
        return registrationNeeded;
    }

    public void setRegistrationNeeded(Integer registrationNeeded) {
        this.registrationNeeded = registrationNeeded;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
