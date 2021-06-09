package kodlamaio.hrms.core;

public class MernisAdapter implements UserCheckService {

	@Override
	public boolean validate(String nationalityId, int birthYear) {
		if (nationalityId.length() == 11 && birthYear > 1900) {
			return true;
		} else {

			return false;
		}
	}

}
