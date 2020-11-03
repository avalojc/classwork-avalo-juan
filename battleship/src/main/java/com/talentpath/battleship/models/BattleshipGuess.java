package com.talentpath.battleship.models;

import java.util.ArrayList;

public class BattleshipGuess {
    Integer gameId;
    Integer boardId;
    Integer [] guess ;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer[] getGuess() {
        return guess;
    }

    public void setGuess(Integer[] guess) {
        this.guess = guess;
    }
}
