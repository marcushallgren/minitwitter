package com.minitwitter.mappers;

import com.minitwitter.entity.Tweet;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TweetMapper implements RowMapper<Tweet> {

    public Tweet mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tweet tweet = new Tweet();
        tweet.setId(rs.getInt("tweet_id"));
        tweet.setUserId(rs.getInt("user_id"));
        tweet.setTweet(rs.getString("message"));
        tweet.setTimeStamp(rs.getString("timestamp"));
        return tweet;
    }
}