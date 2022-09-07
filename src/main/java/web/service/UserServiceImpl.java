package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoIml;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    @Transactional
    public void editUser(int id, User user) {
        userDao.editUser(id, user);
    }

    @Override
    public User showUser(int id) {
        return userDao.showUser(id);
    }
}
