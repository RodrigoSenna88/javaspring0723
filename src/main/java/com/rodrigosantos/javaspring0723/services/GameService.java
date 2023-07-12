package com.rodrigosantos.javaspring0723.services;

import com.rodrigosantos.javaspring0723.dto.GameMinDTO;
import com.rodrigosantos.javaspring0723.entities.Game;
import com.rodrigosantos.javaspring0723.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
