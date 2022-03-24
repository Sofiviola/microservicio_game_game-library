package com.dh.gamesLibraryService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dh.gamesLibraryService.model.GameTitle;

import feign.Param;


@FeignClient(value = "Games", url = "http://localhost:8080/games-service/games")
public interface GameTitleClient {
	@RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
	 GameTitle findById(@Param("id") int id);
}
