package com.crayon.dao.user_manage;

import com.crayon.pojo.user_manage.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
    List<User> findAll() throws Exception;
    List<User> findById(Integer id) throws Exception;
    void insert(User user) throws Exception;
    void update(User user) throws Exception;
    void delete(Integer id) throws Exception;

    List<User> findByName(String userName) throws Exception;
    Set<String> getRoles(String userName) throws Exception;
    Set<String> getPermissions(String userName) throws Exception;
}
