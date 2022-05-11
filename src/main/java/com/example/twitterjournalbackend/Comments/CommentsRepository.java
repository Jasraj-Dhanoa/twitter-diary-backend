package com.example.twitterjournalbackend.Comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentsRepository
        extends JpaRepository<Comments,Long>{

    @Query("SELECT s FROM Comments s WHERE s.userID = ?1")
    List<Comments> findCommentsByUserID(String UserID);

    //Add methods needed here
        //Performs a query on students by their userid
        //Optional<Comments> findCommentsByuserID(String userID);

}
