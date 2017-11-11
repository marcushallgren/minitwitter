/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.dao;

import com.minitwitter.entity.Following;
import com.minitwitter.entity.User;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface FollowingDao {
    
    public List<Following> getFollowing(int userId);
    
}
