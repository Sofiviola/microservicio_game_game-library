package com.dh.gamesLibraryService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_games")
public class UserGames {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
    
    @Column
	private Integer userId;
    
    @Column
	private String games;
}
