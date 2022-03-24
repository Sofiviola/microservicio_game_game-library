package com.dh.gamesService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.gamesService.model.Game;
import com.dh.gamesService.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

	private GameService gameService;
	
	@Autowired
	public GameController(GameService gameService) {
		this.gameService=gameService;
	}
	
	@GetMapping("/{gameId}")
	public Game getGameDetails(@PathVariable Integer gameId) {
		return gameService.getGameDetails(gameId);
	}
}
