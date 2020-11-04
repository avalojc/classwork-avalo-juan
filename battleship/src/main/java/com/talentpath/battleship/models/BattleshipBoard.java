package com.talentpath.battleship.models;

import java.util.List;

public class BattleshipBoard {
    private Integer gameId;
    private Integer boardId;
    private String[][] ocean;
    private List<Integer []> shipPositions;
    private List<BattleshipGuess> guessedPositions;

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

    public String[][] getOcean() {
        return ocean;
    }

    public void setOcean(String[][] ocean) {
        this.ocean = ocean;
    }

    public List<Integer[]> getShipPositions() {
        return shipPositions;
    }

    public void setShipPositions(List<Integer[]> shipPositions) {
        this.shipPositions = shipPositions;
    }

    public List<BattleshipGuess> getGuessedPositions() {
        return guessedPositions;
    }

    public void setGuessedPositions(List<BattleshipGuess> guessedPositions) {
        this.guessedPositions = guessedPositions;
    }
}
