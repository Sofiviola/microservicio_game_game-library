package com.dh.gamesService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.gamesService.model.Game;
import com.dh.gamesService.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {

	private GameRepository gameRepository;
	
	@Autowired
	public GameServiceImpl(GameRepository gameRepository) {
		this.gameRepository=gameRepository;
	}
	@Override
	public Game getGameDetails(Integer gameId) {
		// TODO Auto-generated method stub
		return gameRepository.findById(gameId).orElse(null);
	}

}
