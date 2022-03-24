package com.dh.gamesLibraryService.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.gamesLibraryService.client.GameTitleClient;
import com.dh.gamesLibraryService.model.GameTitle;
import com.dh.gamesLibraryService.model.UserGames;
import com.dh.gamesLibraryService.repository.UserGameRepository;


@Service
public class UserGameServiceImpl implements UserGameService {

	private UserGameRepository userGameRepository;

	private GameTitleClient gameTitleClient;
	
	@Autowired
	public UserGameServiceImpl(UserGameRepository userGameRepository,GameTitleClient gameTitleClient) {
		this.userGameRepository=userGameRepository;
		this.gameTitleClient=gameTitleClient;
	}
	
	
	@Override
	public UserGames getUserGameDetails(Integer userId) {
		// TODO Auto-generated method stub
		return userGameRepository.findByUserId(userId).get(0);
	}
	
	@Override
	public List<GameTitle> getUserGameTitles(Integer userId) {
		// TODO Auto-generated method stub
		String[] idsStr= userGameRepository.findByUserId(userId).get(0).getGames().split(",");
		int[] ids = Arrays.stream(idsStr).mapToInt(Integer::parseInt).toArray();
		List<GameTitle> gameTitles = new ArrayList<GameTitle>();
		
	
		for (int id: ids) {
			
		GameTitle gameTitle = gameTitleClient.findById(id);
			
			//GameTitle gameTitle=  new GameTitle(id, "Classification", "publisher");
 		gameTitles.add(gameTitle);
		}
 		return gameTitles;
	}

}
