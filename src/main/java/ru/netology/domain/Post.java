package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private  int date;
    private  int replyOwnerId;
    private  int replyPostId;
    private  int friendsOnly;
    private  String text;
    private  String RePost;

    private LikesInfo likesInfo;
    private  CommentsInfo CommentsInfo;
    private RepostsInfo RepostInfo;
    private  ViewsInfo ViewsInfo;
}

