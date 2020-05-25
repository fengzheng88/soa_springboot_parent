package com.skx.cloud.microservicesimpleprovideruser.dao;

import com.skx.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
