package com.peerlender.lendingengine.repository;

import com.peerlender.lendingengine.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {

}
