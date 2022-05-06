package com.example.twitterjournalbackend.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

    private final CommentsRepository commentsRepository;

    @Autowired
    public CommentsService(CommentRepository commmentRepository){
        this.commentsRepository = commmentRepository;
    }

    public void addNewComments(Comments comment) {

        //create comment class and sent to repository

        this.commentsRepository.save(comment);
    }


    //retrieve comment from
    public Comments getComments(Long ID) {

       Comments comment = this.commentsRepository.find(ID);
       return comment;
    }


    public void updateComments(Long ID, Comments new_comment) {

        Comments comment = this.commentsRepository.find(ID);
        //update comment
    }

    public void deleteComments(Long ID) {

        this.commentsRepository.delete(ID);
    }
}
