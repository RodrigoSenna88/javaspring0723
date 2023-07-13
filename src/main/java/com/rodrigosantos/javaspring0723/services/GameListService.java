package com.rodrigosantos.javaspring0723.services;


import com.rodrigosantos.javaspring0723.dto.GameListDTO;
import com.rodrigosantos.javaspring0723.entities.GameList;
import com.rodrigosantos.javaspring0723.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}