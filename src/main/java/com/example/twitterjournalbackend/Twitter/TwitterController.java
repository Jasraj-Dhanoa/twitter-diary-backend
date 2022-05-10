package com.example.twitterjournalbackend.Twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Trend;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/twitter")
public class TwitterController {

    @Autowired
    private Twitter twitter;

    @GetMapping
    public List<Trend> getTrends(){
        return twitter.searchOperations().getLocalTrends(4118).getTrends();
    }

    @GetMapping(path = "{trend}")
    public List<Tweet> getTweetsByTrend(@PathVariable("trend") String trend){
        return twitter.searchOperations().search(trend, 5).getTweets();
    }
}
