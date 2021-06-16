package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int from_id;
    private  int date;
    private  int reply_owner_id;
    private  int reply_post_id;
    private  int friends_only;
    private  String text;
    private  String RePost;

    public void setDate(int date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public int getFriends_only() {
        return friends_only;
    }

    public void setFriends_only(int friends_only) {
        this.friends_only = friends_only;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String getRePost() {
        return RePost;
    }

    public void setRePost(String rePost) {
        RePost = rePost;
    }
}
