package com.talentpath.TicTacToe.controllers;

import com.talentpath.TicTacToe.services.TTTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TTTController {

    @Autowired
    TTTService service;

    @PostMapping("/begin")
    public Integer beginGame() {
        return service.beginGame();
    }



}
