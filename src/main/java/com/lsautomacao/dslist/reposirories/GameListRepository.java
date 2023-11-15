package com.lsautomacao.dslist.reposirories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsautomacao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
