package com.example.twitterjournalbackend.Comments;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private Long commentID;
    private String userID;
    private String topic;
    private String comment;
    private LocalDateTime dateCreate;
    private LocalDateTime lastUpd;
    private String tweet1;
    private String tweet2;
    private String tweet3;
    private String tweet4;
    private String tweet5;

    public Comments() {
    }

    public Comments(Long commentID, String userID, String topic, String comment, LocalDateTime dateCreate, LocalDateTime lastUpd, String tweet1, String tweet2, String tweet3, String tweet4, String tweet5) {
        this.commentID = commentID;
        this.userID = userID;
        this.topic = topic;
        this.comment = comment;
        this.dateCreate = dateCreate;
        this.lastUpd = lastUpd;
        this.tweet1 = tweet1;
        this.tweet2 = tweet2;
        this.tweet3 = tweet3;
        this.tweet4 = tweet4;
        this.tweet5 = tweet5;
    }

    public Comments(String userID, String topic, String comment, LocalDateTime dateCreate, LocalDateTime lastUpd, String tweet1, String tweet2, String tweet3, String tweet4, String tweet5) {
        this.userID = userID;
        this.topic = topic;
        this.comment = comment;
        this.dateCreate = dateCreate;
        this.lastUpd = lastUpd;
        this.tweet1 = tweet1;
        this.tweet2 = tweet2;
        this.tweet3 = tweet3;
        this.tweet4 = tweet4;
        this.tweet5 = tweet5;
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDateTime getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(LocalDateTime lastUpd) {
        this.lastUpd = lastUpd;
    }

    public String getTweet1() {
        return tweet1;
    }

    public void setTweet1(String tweet1) {
        this.tweet1 = tweet1;
    }

    public String getTweet2() {
        return tweet2;
    }

    public void setTweet2(String tweet2) {
        this.tweet2 = tweet2;
    }

    public String getTweet3() {
        return tweet3;
    }

    public void setTweet3(String tweet3) {
        this.tweet3 = tweet3;
    }

    public String getTweet4() {
        return tweet4;
    }

    public void setTweet4(String tweet4) {
        this.tweet4 = tweet4;
    }

    public String getTweet5() {
        return tweet5;
    }

    public void setTweet5(String tweet5) {
        this.tweet5 = tweet5;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "CommentID=" + commentID +
                ", userID='" + userID + '\'' +
                ", topic='" + topic + '\'' +
                ", comment='" + comment + '\'' +
                ", dateCreate=" + dateCreate +
                ", lastUpd=" + lastUpd +
                ", tweet1='" + tweet1 + '\'' +
                ", tweet2='" + tweet2 + '\'' +
                ", tweet3='" + tweet3 + '\'' +
                ", tweet4='" + tweet4 + '\'' +
                ", tweet5='" + tweet5 + '\'' +
                '}';
    }
}
