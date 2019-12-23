package sk.spring.dao;

import java.util.List;
import sk.spring.model.User;

public interface UserDAO
{
    public void createUser(User user);
    public User getUser(String userid, String password);
	public List<User> getAllUsers();
}