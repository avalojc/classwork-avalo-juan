package com.talentpath.TicTacToe.daos;

import com.talentpath.TicTacToe.models.TTTBoard;
import com.talentpath.TicTacToe.models.TTTGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
//import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Component
@Profile( {"production", "daotesting"} )
public class PostgresTTTDao implements  TTTDao{

//    @Autowired
//    private  JdbcTemplate template;

    @Override
    public List<TTTGame> getAllGames() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TTTBoard> getAllBoards() {
        throw new UnsupportedOperationException();
    }

    @Override
    public TTTGame addGame(TTTGame toAdd) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TTTGame getGameByGameId(Integer gameId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {

    }

    @Override
    public TTTBoard addBoard(TTTBoard toAdd) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TTTBoard> getBoardsByGameId(Integer gameId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TTTBoard getBoardByBoardId(Integer boardId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void xOrOPlacement(Integer xO, Integer placement) {

    }
}
