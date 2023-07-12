package com.rodrigosantos.javaspring0723.repositories;

import com.rodrigosantos.javaspring0723.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
