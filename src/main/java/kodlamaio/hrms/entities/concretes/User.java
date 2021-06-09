package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {

	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Verified")
	private boolean verified;
	
	
}
