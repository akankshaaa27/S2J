package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Entity;

public interface Dao extends JpaRepository<Entity ,Long>{

}
