package kodlamaio.hrms.core;

public interface UserCheckService {
	boolean validate(String nationalityId, int birthYear);
}
