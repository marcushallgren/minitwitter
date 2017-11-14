/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

import com.mycompany.chasarbetsprov.entity.Following;
import com.mycompany.chasarbetsprov.entity.User;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface FollowingDao {
    
    public List<Following> getFollowing(int userId);
    
    public void follow(int userId, int followingId);
    
    public void unFollow(int userId, int followingId);
}
