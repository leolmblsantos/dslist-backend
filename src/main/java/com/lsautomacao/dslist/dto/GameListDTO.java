package com.lsautomacao.dslist.dto;

import com.lsautomacao.dslist.entities.GameList;

import lombok.Data;

@Data
public class GameListDTO {
	private Long id;
	private String name;
	
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	
}
