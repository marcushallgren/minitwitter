package com.minitwitter.dao;
 
import com.minitwitter.entity.User;
import java.util.List;
 
/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */
public interface UserDao {
     
    public void createUser(User user);
     
  //  public void delete(int contactId);
     
    public User get(User user);
     
    public List<User> list();

}