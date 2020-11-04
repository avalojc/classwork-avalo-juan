package com.talentpath.battleship.daos;

import com.talentpath.battleship.models.BattleshipBoard;
import com.talentpath.battleship.models.BattleshipGame;
import com.talentpath.battleship.models.BattleshipGuess;

import java.util.List;

public class PostgresBattleshipDao implements BattleshipDao {
    @Override
    public List<BattleshipGame> getAllGames() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BattleshipBoard> getAllBoards() {
        throw new UnsupportedOperationException();
    }

    @Override
    public BattleshipGame addGame(BattleshipGame toAdd) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BattleshipGame getGameById(Integer gameId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {

    }

    @Override
    public BattleshipBoard addBoard(BattleshipBoard toAdd) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BattleshipBoard> getBoardById(Integer boardId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addShip(BattleshipGame gameId, BattleshipBoard boardId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void attack(BattleshipGuess attack) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void editGame(BattleshipGame currentGame) {
        throw new UnsupportedOperationException();
    }


}
