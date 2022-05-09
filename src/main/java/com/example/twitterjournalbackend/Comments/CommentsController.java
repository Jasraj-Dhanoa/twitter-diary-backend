package com.example.twitterjournalbackend.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class CommentsController {
    private final CommentsService commentsService;

    @Autowired
    private Twitter twitter;

    @Autowired
    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @GetMapping(path = "/twitter")
    public List<Tweet> getTweets(){
        return twitter.searchOperations().search("#computer", 20).getTweets();
    }

    @GetMapping(path = "/comments/{userId}")
    public Optional<Comments> getComments(@PathVariable("userId") String userId){
        return commentsService.getComments(userId);
    }

    @PostMapping(path = "/comment")
    public void addNewComment(@RequestBody Comments comment) {
        commentsService.addNewComments(comment);
    }

    @DeleteMapping(path = "/comment/{commentId}")
    public void deleteComment(@PathVariable("commentId") Long commentId) {
        commentsService.deleteComments(commentId);
    }

    @PutMapping(path = "comment/{commentId}")
    public void updateComment(@PathVariable("commentId") Long commentId,
                              @RequestParam(required = false) String comment,
                              @RequestParam(required = false) LocalDate lastUpd) {
        commentsService.updateComment(commentId, comment, lastUpd);
    }
}
