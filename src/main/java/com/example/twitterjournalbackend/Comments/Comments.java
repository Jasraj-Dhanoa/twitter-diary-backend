package com.example.twitterjournalbackend.Comments;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comments {
    private Long CommentID;
    private String UserID;
    private String Topic;
    private String Comment;
    private LocalDate Date_Create;
    private LocalDate Last_Upd;
    private String Tweet1;
    private String Tweet2;
    private String Tweet3;
    private String Tweet4;
    private String Tweet5;

    public Comments(Long commentID, String userID, String topic, String comment, LocalDate date_Create, LocalDate last_Upd, String tweet1, String tweet2, String tweet3, String tweet4, String tweet5) {
        CommentID = commentID;
        UserID = userID;
        Topic = topic;
        Comment = comment;
        Date_Create = date_Create;
        Last_Upd = last_Upd;
        Tweet1 = tweet1;
        Tweet2 = tweet2;
        Tweet3 = tweet3;
        Tweet4 = tweet4;
        Tweet5 = tweet5;
    }

    public Long getCommentID() {
        return CommentID;
    }

    public String getUserID() {
        return UserID;
    }

    public String getTopic() {
        return Topic;
    }

    public String getComment() {
        return Comment;
    }

    public LocalDate getDate_Create() {
        return Date_Create;
    }

    public LocalDate getLast_Upd() {
        return Last_Upd;
    }

    public String getTweet1() {
        return Tweet1;
    }

    public String getTweet2() {
        return Tweet2;
    }

    public String getTweet3() {
        return Tweet3;
    }

    public String getTweet4() {
        return Tweet4;
    }

    public String getTweet5() {
        return Tweet5;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "CommentID=" + CommentID +
                ", UserID='" + UserID + '\'' +
                ", Topic='" + Topic + '\'' +
                ", Comment='" + Comment + '\'' +
                ", Date_Create=" + Date_Create +
                ", Last_Upd=" + Last_Upd +
                ", Tweet1='" + Tweet1 + '\'' +
                ", Tweet2='" + Tweet2 + '\'' +
                ", Tweet3='" + Tweet3 + '\'' +
                ", Tweet4='" + Tweet4 + '\'' +
                ", Tweet5='" + Tweet5 + '\'' +
                '}';
    }
}
