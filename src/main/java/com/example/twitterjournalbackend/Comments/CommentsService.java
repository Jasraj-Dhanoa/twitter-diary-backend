package com.example.twitterjournalbackend.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentsService {

    private final CommentsRepository commentsRepository;

    @Autowired
    public CommentsService(CommentsRepository commmentsRepository){
        this.commentsRepository = commmentsRepository;
    }

    //retrieve comment from
    public List<Comments> getComments(String Id) {
//        return commentsRepository.findAll();
        return commentsRepository.findCommentsByUserID(Id);
    }

    public void addNewComments(Comments comment) {
        //create comment class and sent to repository
        this.commentsRepository.save(comment);
    }

    public void deleteComments(Long Id) {
        //checks if commentID passed exists in database
        Boolean commentByCommentId = commentsRepository.existsById(Id);
        if (!commentByCommentId){
            throw new IllegalArgumentException("comment with ID: " + Id + " does not exist");
        }
        this.commentsRepository.deleteById(Id);
    }

    @Transactional
    public void updateComment(Long Id, String newComment, LocalDateTime lastUpd) {

        System.out.println(newComment);
        Comments Comment = commentsRepository.findById(Id)
                .orElseThrow(() -> new IllegalStateException(
                        "comment with id: " + Id + "does not exist"
                ));
        //validation for date
        if (lastUpd!=null && lastUpd.isAfter(Comment.getLastUpd()))
            Comment.setLastUpd(lastUpd);
        //validation for new Comment text
        if(newComment != null && newComment.length() > 0 && newComment != Comment.getComment())
            Comment.setComment(newComment);
    }
}
