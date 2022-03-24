package com.dh.gamesService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String name;
    private String classification;
    private String developer;
    private String publisher;
    
    
}
