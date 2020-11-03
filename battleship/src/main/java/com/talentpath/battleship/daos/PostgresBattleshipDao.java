package com.talentpath.battleship.daos;

import com.talentpath.battleship.models.BattleshipBoard;
import com.talentpath.battleship.models.BattleshipGame;
import com.talentpath.battleship.models.BattleshipGuess;

import java.util.List;

public class PostgresBattleshipDao implements BattleshipDao {
    @Override
    public List<BattleshipGame> getAllGames() {
        return null;
    }

    @Override
    public List<BattleshipBoard> getAllBoards() {
        return null;
    }

    @Override
    public BattleshipGame addGame(BattleshipGame toAdd) {
        return null;
    }

    @Override
    public BattleshipGame getGameById(Integer gameId) {
        return null;
    }

    @Override
    public void reset() {

    }

    @Override
    public BattleshipBoard addBoard(BattleshipBoard toAdd) {
        return null;
    }

    @Override
    public List<BattleshipBoard> getBoardById(Integer boardId) {
        return null;
    }

    @Override
    public void addShip(BattleshipGame gameId, BattleshipBoard boardId) {

    }

    @Override
    public void attack(BattleshipGuess attack) {

    }
}
