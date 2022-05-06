package com.example.twitterjournalbackend.Comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentsRepository
        extends JpaRepository<Comments,Long>{
    //Add methods needed here
        //Performs a query on students by their userid
        Optional<Comments> findCommentsByuserID(String userID);

}
