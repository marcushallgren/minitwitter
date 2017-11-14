package com.mycompany.chasarbetsprov.dao;

import com.mycompany.chasarbetsprov.dao.TweetDao;
import com.mycompany.chasarbetsprov.entity.Tweet;
import com.mycompany.chasarbetsprov.mappers.TweetMapper;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author marcus
 */
public class TweetDaoImpl implements TweetDao {

    private DataSource dataSource;
     private JdbcTemplate jdbcTemplate;
    //DataSource is initialized inside MvcConfiguration when DAO is fetched
    public TweetDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createTweet(int userId, String message, String timestamp) {
        String SQL = "insert into tweets (user_id, message, timestamp) values (?, ?, ?)";
        jdbcTemplate.update(SQL, userId, message, timestamp);
        System.out.println("Created tweet by" + userId);
        return;
    }

    public List<Tweet> listTweets() {
        String SQL = "select * from tweets ORDER BY timestamp DESC";
        List<Tweet> tweets = jdbcTemplate.query(SQL, new TweetMapper());
        return tweets;
    }

}