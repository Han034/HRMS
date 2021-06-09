package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "JobSeekers")
public class JobSeekers {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Profession")
	private String profession;
	
	@Column(name="IdentityNumber")
	private String identityNumber;
	
}
