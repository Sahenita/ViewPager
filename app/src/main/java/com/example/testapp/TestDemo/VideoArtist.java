
package com.example.testapp.TestDemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoArtist {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image_website")
    @Expose
    private Object imageWebsite;
    @SerializedName("image_app")
    @Expose
    private Object imageApp;
    @SerializedName("video_id")
    @Expose
    private Integer videoId;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("artist_id")
    @Expose
    private Integer artistId;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("artist")
    @Expose
    private Artist artist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getImageWebsite() {
        return imageWebsite;
    }

    public void setImageWebsite(Object imageWebsite) {
        this.imageWebsite = imageWebsite;
    }

    public Object getImageApp() {
        return imageApp;
    }

    public void setImageApp(Object imageApp) {
        this.imageApp = imageApp;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
