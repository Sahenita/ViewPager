
package com.example.testapp.TestDemo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_bengali")
    @Expose
    private String nameBengali;
    @SerializedName("is_commented")
    @Expose
    private Integer isCommented;
    @SerializedName("originals")
    @Expose
    private Integer originals;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("long_description")
    @Expose
    private String longDescription;
    @SerializedName("meta_title")
    @Expose
    private String metaTitle;
    @SerializedName("meta_description")
    @Expose
    private String metaDescription;
    @SerializedName("og_image")
    @Expose
    private String ogImage;
    @SerializedName("vertical_image")
    @Expose
    private String verticalImage;
    @SerializedName("horizontal_image")
    @Expose
    private String horizontalImage;
    @SerializedName("image_cover")
    @Expose
    private String imageCover;
    @SerializedName("tv_image")
    @Expose
    private String tvImage;
    @SerializedName("tv_background")
    @Expose
    private String tvBackground;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameBengali() {
        return nameBengali;
    }

    public void setNameBengali(String nameBengali) {
        this.nameBengali = nameBengali;
    }

    public Integer getIsCommented() {
        return isCommented;
    }

    public void setIsCommented(Integer isCommented) {
        this.isCommented = isCommented;
    }

    public Integer getOriginals() {
        return originals;
    }

    public void setOriginals(Integer originals) {
        this.originals = originals;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getOgImage() {
        return ogImage;
    }

    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    public String getVerticalImage() {
        return verticalImage;
    }

    public void setVerticalImage(String verticalImage) {
        this.verticalImage = verticalImage;
    }

    public String getHorizontalImage() {
        return horizontalImage;
    }

    public void setHorizontalImage(String horizontalImage) {
        this.horizontalImage = horizontalImage;
    }

    public String getImageCover() {
        return imageCover;
    }

    public void setImageCover(String imageCover) {
        this.imageCover = imageCover;
    }

    public String getTvImage() {
        return tvImage;
    }

    public void setTvImage(String tvImage) {
        this.tvImage = tvImage;
    }

    public String getTvBackground() {
        return tvBackground;
    }

    public void setTvBackground(String tvBackground) {
        this.tvBackground = tvBackground;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
