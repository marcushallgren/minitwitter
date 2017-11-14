/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.entity;

/**
 *
 * @author marcus
 */
    public class Following {

    int id;
    int user_id;
    int following_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getFollowingId() {
        return following_id;
    }

    public void setFollowingId(int following_id) {
        this.following_id = following_id;
    }
}
