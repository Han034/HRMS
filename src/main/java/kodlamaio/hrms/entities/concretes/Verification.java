package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Verification {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Verified")
	private boolean verified;
	
}
