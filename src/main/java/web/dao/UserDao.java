package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    void removeUserById(long id);

    void editUser(int id, User user);

    User showUser(int id);
}
