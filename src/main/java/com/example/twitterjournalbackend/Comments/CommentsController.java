package com.example.twitterjournalbackend.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CommentsController {
    private final CommentsService commentsService;

    @Autowired
    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @GetMapping("/comments/{userId}")
    public Optional<Comments> getComments(@PathVariable("userId") String userId){
        return commentsService.getComments(userId);
    }

    @PostMapping("/comment")
    public void addNewComment(@RequestBody Comments comment) {
        commentsService.addNewComments(comment);
    }

    @DeleteMapping("/comment/{commentId}")
    public void deleteComment(@PathVariable("commentId") Long commentId) {
        commentsService.deleteComments(commentId);
    }

//    @PutMapping("comment/{commentId}")
//    public void updateComment(@PathVariable("commentId") Long commentId,
//                              @RequestParam(required = false) String comment,
//                              @RequestParam(required = false) LocalDate lastUpd) {
//        commentsService.updateComment(commentId, comment, lastUpd);
//    }
}
