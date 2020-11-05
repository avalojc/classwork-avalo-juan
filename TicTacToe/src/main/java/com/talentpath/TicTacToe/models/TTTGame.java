package com.talentpath.TicTacToe.models;

public class TTTGame {
    private Integer gameId;
    private String gameName;

    public TTTGame() {
    }

    public TTTGame( TTTGame that) {
        this.gameId = that.gameId;
        this.gameName = that.gameName;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
