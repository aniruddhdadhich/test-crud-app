package com.aniruddh.crudBackend.repository;

import com.aniruddh.crudBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
