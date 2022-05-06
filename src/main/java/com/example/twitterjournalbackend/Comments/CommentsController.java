package com.example.twitterjournalbackend.Comments;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class CommentsController {
    private final CommentsService commentsService;

    @Autowired
    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @GetMapping("/comments/{userId}")
    public List<Comments> getComments(@PathVariable("userId") Long userId){
        return commentsService.getComments(userId);
    }

    @PostMapping("/comment")
    public void addNewComment(@RequestBody Comments comment) {
        commentsService.addNewComment(comment);
    }

    @DeleteMapping("/comment/{commentId}")
    public void deleteComment(@PathVariable("commentId") Long commentId) {
        commentsService.deleteComment(commentId);
    }

    @PutMapping("comment/{commentId}")
    public void updateComment(@PathVariable("commentId") Long commentId,
                              @RequestParam(required = false) String comment,
                              @RequestParam(required = false) LocalDate lastUpd) {
        commentsService.updateComment(commentId, comment, lastUpd);
    }
}
