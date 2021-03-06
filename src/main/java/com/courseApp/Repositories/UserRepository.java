package com.courseApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.courseApp.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.userName=:userName")
	public User findByUserName(@Param("userName")String userName);
}
