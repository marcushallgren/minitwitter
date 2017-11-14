/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

import com.mycompany.chasarbetsprov.mappers.UserRowMapper;
import com.mycompany.chasarbetsprov.entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;
    //DataSource is initialized inside MvcConfiguration when DAO is fetched

    public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createUser(User user) {
        // insert
        String sql = "INSERT INTO user (name, email, password)"
                + " VALUES (?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getPassword());
    }

    /*
    @Override
    public void delete(int contactId) {
        // implementation details goes here...
    }
     */
    @Override
    public List<User> list() {
        String sql = "SELECT * FROM user";
        List<User> returnedUser = jdbcTemplate.query(sql, new UserRowMapper());
        return returnedUser;
    }

    @Override
    public User get(User user) {
        String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
        User returnedUser = (User) jdbcTemplate.queryForObject(
                sql, new Object[]{user.getEmail(), user.getPassword()}, new UserRowMapper());
        return returnedUser;
    }

}
