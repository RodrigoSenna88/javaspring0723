package com.rodrigosantos.javaspring0723.repositories;

import com.rodrigosantos.javaspring0723.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
