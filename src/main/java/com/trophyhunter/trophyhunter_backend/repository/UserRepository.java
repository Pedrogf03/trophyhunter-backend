package com.trophyhunter.trophyhunter_backend.repository;

import com.trophyhunter.trophyhunter_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
