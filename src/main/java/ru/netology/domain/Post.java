package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
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

    private LikesInfo likesInfo;
    private  CommentsInfo CommentsInfo;
    private RepostsInfo RepostInfo;
    private  ViewsInfo ViewsInfo;
}

