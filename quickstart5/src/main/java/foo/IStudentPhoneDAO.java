package foo;

import java.util.List;

public interface IStudentPhoneDAO {
	
	public List<Student> findAll();
	 public void save(Student student);

}
