package com.talentpath.battleship.models;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BattleshipGame {
    private Integer gameId;
    private BattleshipBoard battleshipBoardPlayer0;
    private BattleshipBoard battleshipBoardPlayer1;
    private Integer totalGuesses; //not needed technically but could be great for testing
    private ArrayList<Integer []> guessedPosition ;

    public BattleshipGame() {

    }

    public BattleshipGame(Integer gameId, BattleshipBoard battleshipBoardPlayer0, BattleshipBoard battleshipBoardPlayer1, Integer totalGuesses, ArrayList<Integer []> guessedPosition) {
        this.gameId = gameId;
        this.battleshipBoardPlayer0 = battleshipBoardPlayer0;
        this.battleshipBoardPlayer1 = battleshipBoardPlayer1;
        this.totalGuesses = totalGuesses;
        this.guessedPosition = guessedPosition;
//                .stream().collect(Collectors.toList());
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

    public ArrayList<Integer []> getGuessedPosition() {
        return guessedPosition;
    }

    public void setGuessedPosition(ArrayList<Integer []> guessedPosition) {
        this.guessedPosition = guessedPosition;
    }
}
