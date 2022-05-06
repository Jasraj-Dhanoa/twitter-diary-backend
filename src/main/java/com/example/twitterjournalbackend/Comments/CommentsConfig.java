package com.example.twitterjournalbackend.Comments;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CommentsConfig {
    @Bean
    CommandLineRunner commandlinerunner(CommentsRepository repository) {
        return args -> {
            //Add entries in the comments table by declaring an instance of comments class
            Comments isaidoun = new Comments(
                    1L,
                    "Isaidoun",
                    "Sports",
                    "I do not like this sport very much",
                    LocalDate.of(2022, Month.MAY, 5),
                    LocalDate.of(2022, Month.MAY, 5),
                    "sdkfljsdflk",
                    "34jfkdlsjf",
                    "234kjdfsjf",
                    "2343dsf",
                    "jfdslkf2"



            );
            repository.save(isaidoun);

        };
    }
}
