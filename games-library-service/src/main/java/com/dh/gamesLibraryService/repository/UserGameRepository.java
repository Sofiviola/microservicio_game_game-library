package com.dh.gamesLibraryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dh.gamesLibraryService.model.UserGames;

@Repository
public interface UserGameRepository extends JpaRepository<UserGames, Integer> {
	public List<UserGames> findByUserId(Integer userId);
}
