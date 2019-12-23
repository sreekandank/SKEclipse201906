package sk.spring.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sk.spring.model.User;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserDAOImpl implements UserDAO
{

    @PersistenceContext
    private EntityManager entityManager;
    
    public void createUser(User user)
    {
        entityManager.persist(user);
    }
    
    public User getUser(String uid, String pwd)
    {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.userid = :userid AND u.password = :password", User.class);
        query.setParameter("userid", uid);
        query.setParameter("password", pwd);
        return query.getSingleResult();
    }
    
    public User getUser(User user)
    {
    	String uid = user.getUserid();
    	String pwd = user.getPassword();
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.userid = :userid AND u.password = :password", User.class);
        query.setParameter("userid", uid);
        query.setParameter("password", pwd);
        return query.getSingleResult();
    }

    public List<User> getAllUsers()
    {
        return entityManager.createQuery("select u from User u").getResultList();
    }
}