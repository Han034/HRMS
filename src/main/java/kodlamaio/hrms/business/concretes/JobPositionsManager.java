package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPositions;

public class JobPositionsManager implements JobPositionsService{

	private JobPositionDao jobPositionDao;
	
	
	@Autowired
	public JobPositionsManager(JobPositionDao jobPositionsDao) {
		super();
		this.jobPositionDao = jobPositionsDao;
	}



	@Override
	public List<JobPositions> getAll() {
		return this.jobPositionDao.findAll();
	}
	
}
