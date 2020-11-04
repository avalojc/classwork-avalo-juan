package com.talentpath.battleship.models;

import java.util.List;
import java.util.stream.Collectors;

public class BattleshipGame {
    private Integer gameId;
    private BattleshipBoard battleshipBoardPlayer0;
    private BattleshipBoard battleshipBoardPlayer1;
    private Integer totalGuesses; //not needed technically but could be great for testing
    private List<BattleshipGuess> guessedPositions;

    public BattleshipGame() {

    }

    public BattleshipGame(BattleshipGame that) {
        this.gameId = that.gameId;
        this.battleshipBoardPlayer0 = that.battleshipBoardPlayer0;
        this.battleshipBoardPlayer1 = that.battleshipBoardPlayer1;
        this.totalGuesses = that.totalGuesses;
        this.guessedPositions = that.guessedPositions.stream().collect(Collectors.toList());
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public BattleshipBoard getBattleshipBoardPlayer0() {
        return battleshipBoardPlayer0;
    }

    public void setBattleshipBoardPlayer0(BattleshipBoard battleshipBoardPlayer0) {
        this.battleshipBoardPlayer0 = battleshipBoardPlayer0;
    }

    public BattleshipBoard getBattleshipBoardPlayer1() {
        return battleshipBoardPlayer1;
    }

    public void setBattleshipBoardPlayer1(BattleshipBoard battleshipBoardPlayer1) {
        this.battleshipBoardPlayer1 = battleshipBoardPlayer1;
    }

    public Integer getTotalGuesses() {
        return totalGuesses;
    }

    public void setTotalGuesses(Integer totalGuesses) {
        this.totalGuesses = totalGuesses;
    }

    public List<BattleshipGuess> getGuessedPosition() {
        return guessedPositions;
    }

    public void setGuessedPosition(List<BattleshipGuess> guessedPosition) {
        this.guessedPositions = guessedPosition;
    }
}
