package com.spring.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.listgames.entities.Game;

public interface GameRepositories extends JpaRepository<Game, Long>{
	
}
