package com.example.twitterjournalbackend.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return commentsRepository.findAll();
    }

    public void addNewComments(Comments comment) {
        //create comment class and sent to repository
        this.commentsRepository.save(comment);
    }

    public void deleteComments(Long ID) {
        this.commentsRepository.deleteById(ID);
    }

//    public void updateComments(Long ID, Comments new_comment) {
//        Comments comment = this.commentsRepository.find(ID);
//        //update comment
//    }
}
