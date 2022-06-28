package com.devsuperior.dscalatog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscalatog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
