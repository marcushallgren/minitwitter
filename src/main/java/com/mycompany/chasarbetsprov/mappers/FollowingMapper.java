/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.mappers;

import com.mycompany.chasarbetsprov.entity.Following;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author marcus
 */
public class FollowingMapper implements RowMapper<Following> {

    //Mappers are used to map the resultset into an Entity, and then returning the entity
    public Following mapRow(ResultSet rs, int rowNum) throws SQLException {
        Following following = new Following();
        following.setId(rs.getInt("id"));
        following.setUserId(rs.getInt("user_id"));
        following.setFollowingId(rs.getInt("following_id"));
        return following;
    }
}