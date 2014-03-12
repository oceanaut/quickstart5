package foo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentPhoneService implements IStudentPhoneService {

	
    @Autowired
	//@Autowired(required=true)
	private StudentPhoneDAO studentPhoneDao;
    
    
	@Override
	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentPhoneDao.save(student);

	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		studentPhoneDao.findAll();
		return null;
	}

}
