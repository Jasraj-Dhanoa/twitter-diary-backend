package com.example.twitterjournalbackend;

import com.example.twitterjournalbackend.Comments.Comments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class TwitterJournalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterJournalBackendApplication.class, args);
	}
	@GetMapping
	public List<Comments> Hello(){
		return List.of(
				new Comments(
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



				)
		);
	}
}
