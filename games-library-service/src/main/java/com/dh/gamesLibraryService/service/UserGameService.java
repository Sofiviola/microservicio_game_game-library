package com.dh.gamesLibraryService.service;

import java.util.List;

import com.dh.gamesLibraryService.model.GameTitle;
import com.dh.gamesLibraryService.model.UserGames;

public interface UserGameService {
	UserGames getUserGameDetails(Integer gameId);
	public List<GameTitle> getUserGameTitles(Integer userId);
}
