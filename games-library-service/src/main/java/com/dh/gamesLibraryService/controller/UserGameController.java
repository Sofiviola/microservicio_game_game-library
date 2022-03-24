package com.dh.gamesLibraryService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.gamesLibraryService.model.GameTitle;
import com.dh.gamesLibraryService.model.UserGames;
import com.dh.gamesLibraryService.service.UserGameService;

@RestController
@RequestMapping("/library")
public class UserGameController {

	private UserGameService userGameService;
	
	@Autowired
	public UserGameController(UserGameService userGameService) {
		this.userGameService=userGameService;
	}
	
	@GetMapping("/{userId}")
	public UserGames getGameDetails(@PathVariable Integer userId) {
		return userGameService.getUserGameDetails(userId);
	}
	
	
	@GetMapping("/{userId}/titles")
	public List<GameTitle> getGameTitles(@PathVariable Integer userId) {
		return userGameService.getUserGameTitles(userId);
	}
}
