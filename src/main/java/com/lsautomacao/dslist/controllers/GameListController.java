package com.lsautomacao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsautomacao.dslist.dto.GameDTO;
import com.lsautomacao.dslist.dto.GameListDTO;
import com.lsautomacao.dslist.dto.GameMinDTO;
import com.lsautomacao.dslist.entities.Game;
import com.lsautomacao.dslist.entities.GameList;
import com.lsautomacao.dslist.services.GameListService;
import com.lsautomacao.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll () {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
