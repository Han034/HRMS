package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "Employers")
public class Employers {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name= "CompanyName")
	private String companyName;
	
	@Column(name= "CompanySurname")
	private String companySurname;
	
	@Column(name= "TelephoneNumber")
	private int telephoneNumber;
}
