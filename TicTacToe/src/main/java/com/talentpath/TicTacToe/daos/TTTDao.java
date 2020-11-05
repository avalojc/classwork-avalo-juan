package com.talentpath.TicTacToe.daos;

import com.talentpath.TicTacToe.models.TTTBoard;
import com.talentpath.TicTacToe.models.TTTGame;

import java.util.List;

public interface TTTDao {
    List <TTTGame> getAllGames();

    List<TTTBoard> getAllBoards();

    TTTGame addGame (TTTGame toAdd);

    TTTGame getGameByGameId(Integer gameId);

    void reset();

    TTTBoard addBoard (TTTBoard toAdd);

    List <TTTBoard> getBoardsByGameId(Integer gameId);

    TTTBoard getBoardByBoardId(Integer boardId);

    void xOrOPlacement(Integer xO, Integer placement);
}
