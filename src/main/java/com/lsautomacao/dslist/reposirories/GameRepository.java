package com.lsautomacao.dslist.reposirories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsautomacao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
