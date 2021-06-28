package ru.netology.domain;

import lombok.Data;
@Data
public class LikesInfo {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;
}
