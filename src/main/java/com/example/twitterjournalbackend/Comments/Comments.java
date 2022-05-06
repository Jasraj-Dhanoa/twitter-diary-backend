package com.example.twitterjournalbackend.Comments;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Comments {
    @Id
    @SequenceGenerator(
            name = "comment_sequence",
            sequenceName = "comment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "comment_sequence"
    )
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

    public Comments() {
    }

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

    public Comments(String userID, String topic, String comment, LocalDate date_Create, LocalDate last_Upd, String tweet1, String tweet2, String tweet3, String tweet4, String tweet5) {
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

    public void setCommentID(Long commentID) {
        CommentID = commentID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public LocalDate getDate_Create() {
        return Date_Create;
    }

    public void setDate_Create(LocalDate date_Create) {
        Date_Create = date_Create;
    }

    public LocalDate getLast_Upd() {
        return Last_Upd;
    }

    public void setLast_Upd(LocalDate last_Upd) {
        Last_Upd = last_Upd;
    }

    public String getTweet1() {
        return Tweet1;
    }

    public void setTweet1(String tweet1) {
        Tweet1 = tweet1;
    }

    public String getTweet2() {
        return Tweet2;
    }

    public void setTweet2(String tweet2) {
        Tweet2 = tweet2;
    }

    public String getTweet3() {
        return Tweet3;
    }

    public void setTweet3(String tweet3) {
        Tweet3 = tweet3;
    }

    public String getTweet4() {
        return Tweet4;
    }

    public void setTweet4(String tweet4) {
        Tweet4 = tweet4;
    }

    public String getTweet5() {
        return Tweet5;
    }

    public void setTweet5(String tweet5) {
        Tweet5 = tweet5;
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
