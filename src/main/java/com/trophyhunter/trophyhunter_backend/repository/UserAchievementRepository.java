package com.trophyhunter.trophyhunter_backend.repository;

import com.trophyhunter.trophyhunter_backend.model.UserAchievement;
import com.trophyhunter.trophyhunter_backend.model.UserAchievementId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAchievementRepository extends JpaRepository<UserAchievement, UserAchievementId> {

}
