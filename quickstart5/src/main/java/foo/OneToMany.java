package foo;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;



public class OneToMany {
	
	//@Autowired
	//IAddressService addressService;
	
	/*@Autowired
	private static  SessionFactory sessionFactory=null;
	private static ServiceRegistry serviceRegistry;
	private SessionFactory sessionFactory;
	*/
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentPhoneService istudebtService=(IStudentPhoneService) ctx.getBean("studentPhoneService");
		//IAddressService iaddressService = (IAddressService) ctx.getBean("addressService");
		//UserManager userManager = (UserManager) ctx.getBean("userManagerImpl");
		    /*
		    Configuration configuration = new Configuration();
		    configuration.configure();
		    serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		
			Address address = new Address("OMR Road", "Chennai", "TN", "600097");
			Student student1 = new Student("Eswar", address);
			Student student2 = new Student("Joe", address);
		    iaddressService.addStudent(student1);
		    iaddressService.addStudent(student2);
		    */
		
			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("home","32354353"));
			phoneNumbers.add(new Phone("school","9889343423"));
			Student student2 = new Student("Eshobio", phoneNumbers);
			istudebtService.addStudent(student2);
			// sessionFactory.getCurrentSession().save(student1);
		    //sessionFactory.getCurrentSession().save(student2);
			//session.save(student1);
			//session.save(student2);
	

	}

}
