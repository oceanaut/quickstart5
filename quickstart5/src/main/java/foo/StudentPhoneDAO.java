package foo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentPhoneDAO implements IStudentPhoneDAO {
	
	@Autowired
	//@Autowired(required=true)
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		  Session session = sessionFactory.getCurrentSession();
	      return (List<Student>)session.createQuery("from student").list();
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();    
         session.save(student);

	}

}
