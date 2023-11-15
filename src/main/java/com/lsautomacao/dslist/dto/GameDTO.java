package com.lsautomacao.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.lsautomacao.dslist.entities.Game;

import lombok.Data;

@Data
public class GameDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);  //copidar os objetos da tabela Game
	}
}
