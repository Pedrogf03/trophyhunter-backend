package com.trophyhunter.trophyhunter_backend.repository;

import com.trophyhunter.trophyhunter_backend.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Long> {

}
