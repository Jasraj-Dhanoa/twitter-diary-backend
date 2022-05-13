package com.example.twitterjournalbackend.Comments;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Configuration
public class CommentsConfig {

    @Bean
    CommandLineRunner commandlinerunner(CommentsRepository repository) {
        return args -> {
            //Add entries in the comments table by declaring an instance of comments class
            Comments isaidoun = new Comments(
                    "Isaidoun",
                    "Sports",
                    "I do not like this sport very much",
                    LocalDateTime.of(2020, Month.MAY, 5,7,4,2),
                    LocalDateTime.of(2020, Month.MAY, 5,7,4,2),
                    "sdkfljsdflk",
                    "34jfkdlsjf",
                    "234kjdfsjf",
                    "2343dsf",
                    "jfdslkf2"
            );

            Comments isaidoun_2 = new Comments(
                    "Isaidoun",
                    "Food",
                    "this food tastes quite good!",
                    LocalDateTime.of(2021, Month.JUNE, 5,6,56,4),
                    LocalDateTime.of(2021, Month.JUNE, 5,6,56,4),
                    "sdkfljsdflk",
                    "34jfkdlsjf",
                    "234kjdfsjf",
                    "2343dsf",
                    "jfdslkf2"
            );

            Comments isaidoun_3 = new Comments(
                    "Isaidoun",
                    "Weather",
                    "The sun is quite bright today! Although I like the winters, summer is simply much better!",
                    LocalDateTime.of(2022, Month.JUNE, 11,21,2,3),
                    LocalDateTime.of(2022, Month.JUNE, 11,21,2,3),
                    "sdkfljsdflk",
                    "34jfkdlsjf",
                    "234kjdfsjf",
                    "2343dsf",
                    "jfdslkf2"
            );
            repository.saveAll(List.of(isaidoun, isaidoun_2, isaidoun_3));

        };
    }
}
