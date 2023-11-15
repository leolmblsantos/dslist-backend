package com.lsautomacao.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game Game;
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;
}
