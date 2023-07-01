package com.spring.listgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.listgames.dto.GameMinDTO;
import com.spring.listgames.entities.Game;
import com.spring.listgames.repositories.GameRepositories;

@Service
public class GameService {
	
	@Autowired
	GameRepositories gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
