package ru.netology.domain;

import lombok.Data;
@Data
public class CommentsInfo {
    private int count;
    private boolean can_close;
    private boolean can_open;
    private CommentsInfo commentsInfo;
}











