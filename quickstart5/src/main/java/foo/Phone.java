package foo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PHONE")
public class Phone {

	private long phoneId;
	private String phoneType;
	private String phoneNumber;
	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Phone(String phoneType, String phoneNumber) {
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	
	@Id
	@GeneratedValue
	@Column(name = "PHONE_ID")
	public long getPhoneId() {
		return phoneId;
	}


	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	
	@Column(name = "PHONE_TYPE", nullable = false, length=10)
	public String getPhoneType() {
		return phoneType;
	}


	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	
	@Column(name = "PHONE_NUMBER", nullable = false, length=15)
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
		
	
	
}
