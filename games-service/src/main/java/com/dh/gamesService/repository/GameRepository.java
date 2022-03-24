package com.dh.gamesService.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dh.gamesService.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
