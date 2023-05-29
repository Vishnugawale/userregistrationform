package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.entity.User;
@Repository
public interface Userrepository extends JpaRepository<User, String  >{

}
