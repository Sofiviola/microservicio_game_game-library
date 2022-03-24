package com.dh.gamesLibraryService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameTitle {
	Integer id;
	String name;
	String classification;
}
