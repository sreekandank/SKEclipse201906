package sk.login.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sk.login.model.Student;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentDAOImpl implements StudentDAO
{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void createStudent(Student student)
    {
        entityManager.persist(student);
    }
    
    @Override
    public Student getStudent(String n, long a)
    {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s WHERE s.name = :name AND s.age = :age", Student.class);
        query.setParameter("age", a);
        query.setParameter("name", n);
        return query.getSingleResult();
        //return entityManager.createQuery("From Student s WHERE s.name=:n AND s.age=:a", Student.class).setParameter("name",n),("age",a).getSingleResult();
    }
}