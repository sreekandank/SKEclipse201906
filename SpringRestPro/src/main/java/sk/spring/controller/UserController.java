package sk.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.spring.dao.UserDAOImpl;
import sk.spring.model.User;

@RestController
public class UserController
{
    @Autowired
    private UserDAOImpl userDAOImpl;
    
    /*** Creating a new User ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/register", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createUser(@RequestBody User user)
    {
        userDAOImpl.createUser(user);
    }
    
    /*** Retrieve a single User by userid and password**
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/user/{userid}/{password}",produces="application/json",
            method=RequestMethod.GET)
    public User getUser(@PathVariable("userid") String userid, @PathVariable("password") String password)
    {
        User user = userDAOImpl.getUser(userid, password);
        return user;
    }
    */
    
    /*** Retrieve a single User by userid and password***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/user",produces="application/json",
            method=RequestMethod.GET)
    public User getUser(@RequestParam String userid, @RequestParam String password)
    {
        User user = userDAOImpl.getUser(userid, password);
        return user;
    }
    
    /*** Retrieve a single User by userid and password using POST method***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/getuser", produces="application/json", consumes="application/json",
            method=RequestMethod.POST)
    public User getUserByParam(@RequestBody User user)
    {
        User u = userDAOImpl.getUser(user);
        return u;
    }
    
    /*** Retrieve all Users ***/
    @CrossOrigin(origins="http://localhost:4200")
    @RequestMapping(value="/users",produces="application/json",
            method=RequestMethod.GET)
    public List<User> getUsers()
    {
        List<User> userList = userDAOImpl.getAllUsers();
        return userList;
    }
}
