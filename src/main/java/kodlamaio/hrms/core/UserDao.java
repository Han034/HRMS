package kodlamaio.hrms.core;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	User findByEmail(String Email);
}
