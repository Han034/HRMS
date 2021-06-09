package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.entities.concretes.JobPositions;

@RequestMapping("/api/JobPositions")
@RestController

public class JobPositionController {
	private JobPositionsService jobPositionsService;

	@Autowired
	public JobPositionController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	
	
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.jobPositionsService.getAll();	
	
	}
}