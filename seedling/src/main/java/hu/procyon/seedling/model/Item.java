package hu.procyon.seedling.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    private int id;
    private LocalDateTime datetime;
    private String title;
    private String content;
    private boolean unread;
    private boolean starred;
    private String source;
    private String thumbnail;
    private String icon;
    private String uid;
    private String link;
    private String sourcetitle;
    private List<String> tags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @JsonIgnore
    public boolean isUnread() {
        return unread;
    }

    @JsonProperty("unread")
    public String getUnreadStr() {
        return unread ? "1" : "0";
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    @JsonIgnore
    public boolean isStarred() {
        return starred;
    }

    @JsonProperty("starred")
    public String getStarredStr() {
        return starred ? "1" : "0";
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSourcetitle() {
        return sourcetitle;
    }

    public void setSourcetitle(String sourcetitle) {
        this.sourcetitle = sourcetitle;
    }

    @JsonIgnore
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public String getTagsStr() {
        return String.join(",", tags);
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

}