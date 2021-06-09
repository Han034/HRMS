package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "JobPositions")
public class JobPositions {
	
		@Id
		@GeneratedValue
		@Column(name= "Id")
		private int id;
		
		@Column(name= "PositionName")
		private String positionName;
}
