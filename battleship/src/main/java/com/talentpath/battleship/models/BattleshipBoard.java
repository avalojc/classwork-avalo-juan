package com.talentpath.battleship.models;

import java.util.ArrayList;

public class BattleshipBoard {
    private Integer gameId;
    private Integer boardId;
    private String[][] ocean;
    private ArrayList<Integer []> shipPositions;
    private ArrayList<Integer []> guessedPositions;

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

    public ArrayList<Integer[]> getShipPositions() {
        return shipPositions;
    }

    public void setShipPositions(ArrayList<Integer[]> shipPositions) {
        this.shipPositions = shipPositions;
    }

    public ArrayList<Integer[]> getGuessedPositions() {
        return guessedPositions;
    }

    public void setGuessedPositions(ArrayList<Integer[]> guessedPositions) {
        this.guessedPositions = guessedPositions;
    }
}
