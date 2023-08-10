package com.externas.apis.repository;

import com.externas.apis.model.UserBd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBd, Long> {
}
