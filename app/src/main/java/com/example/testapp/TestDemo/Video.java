
package com.example.testapp.TestDemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("title_bng")
    @Expose
    private String titleBng;
    @SerializedName("is_commented")
    @Expose
    private Integer isCommented;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("video_type")
    @Expose
    private Integer videoType;
    @SerializedName("video_link")
    @Expose
    private String videoLink;
    @SerializedName("video_link_type")
    @Expose
    private Integer videoLinkType;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("description_bng")
    @Expose
    private String descriptionBng;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;
    @SerializedName("meta_title")
    @Expose
    private Object metaTitle;
    @SerializedName("meta_description")
    @Expose
    private Object metaDescription;
    @SerializedName("meta_keyword")
    @Expose
    private Object metaKeyword;
    @SerializedName("mobile_trailer_file")
    @Expose
    private Object mobileTrailerFile;
    @SerializedName("web_file")
    @Expose
    private String webFile;
    @SerializedName("mobile_file")
    @Expose
    private String mobileFile;
    @SerializedName("tv_file")
    @Expose
    private String tvFile;
    @SerializedName("trailer_file")
    @Expose
    private String trailerFile;
    @SerializedName("trailer_file_tv")
    @Expose
    private String trailerFileTv;
    @SerializedName("preview_trailer")
    @Expose
    private Object previewTrailer;
    @SerializedName("cobalt_video")
    @Expose
    private String cobaltVideo;
    @SerializedName("cobalt_trailer")
    @Expose
    private String cobaltTrailer;
    @SerializedName("og_image")
    @Expose
    private String ogImage;
    @SerializedName("vertical_image")
    @Expose
    private String verticalImage;
    @SerializedName("horizontal_image")
    @Expose
    private String horizontalImage;
    @SerializedName("tv_image")
    @Expose
    private String tvImage;
    @SerializedName("tv_background")
    @Expose
    private String tvBackground;
    @SerializedName("rollover_image")
    @Expose
    private String rolloverImage;
    @SerializedName("cover_image")
    @Expose
    private Object coverImage;
    @SerializedName("expanded_banner")
    @Expose
    private String expandedBanner;
    @SerializedName("preferred_image")
    @Expose
    private Integer preferredImage;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("skip_duration")
    @Expose
    private String skipDuration;
    @SerializedName("skip_start")
    @Expose
    private String skipStart;
    @SerializedName("video_text")
    @Expose
    private String videoText;
    @SerializedName("trailer_text")
    @Expose
    private String trailerText;
    @SerializedName("primary_label")
    @Expose
    private String primaryLabel;
    @SerializedName("secondary_label")
    @Expose
    private String secondaryLabel;
    @SerializedName("secondary_file")
    @Expose
    private String secondaryFile;
    @SerializedName("dual_audio")
    @Expose
    private Integer dualAudio;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("series_order")
    @Expose
    private Integer seriesOrder;
    @SerializedName("category_order")
    @Expose
    private Integer categoryOrder;
    @SerializedName("video_category_id")
    @Expose
    private Integer videoCategoryId;
    @SerializedName("category_season_id")
    @Expose
    private Object categorySeasonId;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("next_video_id")
    @Expose
    private Integer nextVideoId;
    @SerializedName("previous_video_id")
    @Expose
    private Integer previousVideoId;
    @SerializedName("show_next_in")
    @Expose
    private String showNextIn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitleBng() {
        return titleBng;
    }

    public void setTitleBng(String titleBng) {
        this.titleBng = titleBng;
    }

    public Integer getIsCommented() {
        return isCommented;
    }

    public void setIsCommented(Integer isCommented) {
        this.isCommented = isCommented;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public Integer getVideoLinkType() {
        return videoLinkType;
    }

    public void setVideoLinkType(Integer videoLinkType) {
        this.videoLinkType = videoLinkType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionBng() {
        return descriptionBng;
    }

    public void setDescriptionBng(String descriptionBng) {
        this.descriptionBng = descriptionBng;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Object getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(Object metaTitle) {
        this.metaTitle = metaTitle;
    }

    public Object getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(Object metaDescription) {
        this.metaDescription = metaDescription;
    }

    public Object getMetaKeyword() {
        return metaKeyword;
    }

    public void setMetaKeyword(Object metaKeyword) {
        this.metaKeyword = metaKeyword;
    }

    public Object getMobileTrailerFile() {
        return mobileTrailerFile;
    }

    public void setMobileTrailerFile(Object mobileTrailerFile) {
        this.mobileTrailerFile = mobileTrailerFile;
    }

    public String getWebFile() {
        return webFile;
    }

    public void setWebFile(String webFile) {
        this.webFile = webFile;
    }

    public String getMobileFile() {
        return mobileFile;
    }

    public void setMobileFile(String mobileFile) {
        this.mobileFile = mobileFile;
    }

    public String getTvFile() {
        return tvFile;
    }

    public void setTvFile(String tvFile) {
        this.tvFile = tvFile;
    }

    public String getTrailerFile() {
        return trailerFile;
    }

    public void setTrailerFile(String trailerFile) {
        this.trailerFile = trailerFile;
    }

    public String getTrailerFileTv() {
        return trailerFileTv;
    }

    public void setTrailerFileTv(String trailerFileTv) {
        this.trailerFileTv = trailerFileTv;
    }

    public Object getPreviewTrailer() {
        return previewTrailer;
    }

    public void setPreviewTrailer(Object previewTrailer) {
        this.previewTrailer = previewTrailer;
    }

    public String getCobaltVideo() {
        return cobaltVideo;
    }

    public void setCobaltVideo(String cobaltVideo) {
        this.cobaltVideo = cobaltVideo;
    }

    public String getCobaltTrailer() {
        return cobaltTrailer;
    }

    public void setCobaltTrailer(String cobaltTrailer) {
        this.cobaltTrailer = cobaltTrailer;
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

    public String getRolloverImage() {
        return rolloverImage;
    }

    public void setRolloverImage(String rolloverImage) {
        this.rolloverImage = rolloverImage;
    }

    public Object getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(Object coverImage) {
        this.coverImage = coverImage;
    }

    public String getExpandedBanner() {
        return expandedBanner;
    }

    public void setExpandedBanner(String expandedBanner) {
        this.expandedBanner = expandedBanner;
    }

    public Integer getPreferredImage() {
        return preferredImage;
    }

    public void setPreferredImage(Integer preferredImage) {
        this.preferredImage = preferredImage;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getSkipDuration() {
        return skipDuration;
    }

    public void setSkipDuration(String skipDuration) {
        this.skipDuration = skipDuration;
    }

    public String getSkipStart() {
        return skipStart;
    }

    public void setSkipStart(String skipStart) {
        this.skipStart = skipStart;
    }

    public String getVideoText() {
        return videoText;
    }

    public void setVideoText(String videoText) {
        this.videoText = videoText;
    }

    public String getTrailerText() {
        return trailerText;
    }

    public void setTrailerText(String trailerText) {
        this.trailerText = trailerText;
    }

    public String getPrimaryLabel() {
        return primaryLabel;
    }

    public void setPrimaryLabel(String primaryLabel) {
        this.primaryLabel = primaryLabel;
    }

    public String getSecondaryLabel() {
        return secondaryLabel;
    }

    public void setSecondaryLabel(String secondaryLabel) {
        this.secondaryLabel = secondaryLabel;
    }

    public String getSecondaryFile() {
        return secondaryFile;
    }

    public void setSecondaryFile(String secondaryFile) {
        this.secondaryFile = secondaryFile;
    }

    public Integer getDualAudio() {
        return dualAudio;
    }

    public void setDualAudio(Integer dualAudio) {
        this.dualAudio = dualAudio;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getSeriesOrder() {
        return seriesOrder;
    }

    public void setSeriesOrder(Integer seriesOrder) {
        this.seriesOrder = seriesOrder;
    }

    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public Integer getVideoCategoryId() {
        return videoCategoryId;
    }

    public void setVideoCategoryId(Integer videoCategoryId) {
        this.videoCategoryId = videoCategoryId;
    }

    public Object getCategorySeasonId() {
        return categorySeasonId;
    }

    public void setCategorySeasonId(Object categorySeasonId) {
        this.categorySeasonId = categorySeasonId;
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

    public Integer getNextVideoId() {
        return nextVideoId;
    }

    public void setNextVideoId(Integer nextVideoId) {
        this.nextVideoId = nextVideoId;
    }

    public Integer getPreviousVideoId() {
        return previousVideoId;
    }

    public void setPreviousVideoId(Integer previousVideoId) {
        this.previousVideoId = previousVideoId;
    }

    public String getShowNextIn() {
        return showNextIn;
    }

    public void setShowNextIn(String showNextIn) {
        this.showNextIn = showNextIn;
    }

}
