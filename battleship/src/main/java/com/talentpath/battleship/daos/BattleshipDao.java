package com.talentpath.battleship.daos;


import com.talentpath.battleship.models.BattleshipBoard;
import com.talentpath.battleship.models.BattleshipGame;
import com.talentpath.battleship.models.BattleshipGuess;

import java.util.List;

public interface BattleshipDao {
    List <BattleshipGame> getAllGames();

    List <BattleshipBoard> getAllBoards();

    BattleshipGame addGame (BattleshipGame toAdd);

    BattleshipGame getGameById(Integer gameId);

    void reset();

    BattleshipBoard addBoard (BattleshipBoard toAdd);

    List <BattleshipBoard>getBoardById(Integer boardId);

    void addShip(BattleshipGame gameId, BattleshipBoard boardId);

    void attack(BattleshipGuess attack);

}
