/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.dao;

import com.minitwitter.mappers.FollowingMapper;
import com.minitwitter.entity.Following;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author marcus
 */
public class FollowingDaoImpl implements FollowingDao {

    private JdbcTemplate jdbcTemplate;

    public FollowingDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Following> getFollowing(int userId) {
        String SQL = "select * from user_follows where user_id = ?";
        List<Following> followingIds = jdbcTemplate.query(SQL, new Object[]{userId}, new FollowingMapper());
        return followingIds;
    }

}
