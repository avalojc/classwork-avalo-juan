package com.talentpath.TicTacToe.daos;

import com.talentpath.TicTacToe.models.TTTBoard;
import com.talentpath.TicTacToe.models.TTTGame;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Profile( "servicetesting" )
public class InMemTTTDao implements TTTDao{

    List<TTTGame> allGames = new ArrayList<>();
    List<TTTBoard> allBoards = new ArrayList<>();

    public InMemTTTDao() { reset(); }

    @Override
    public void reset() {
        allBoards.clear();
        allGames.clear();

        //  allBoards.add(board0);
        //  allBoards.add(board1);
        //  create game
        TTTGame testGame = new TTTGame();
        testGame.setGameId(1);
        testGame.setGameName("testGame");

        // create boards
        TTTBoard board0 = new TTTBoard();
        TTTBoard board1 = new TTTBoard();
        // set board ids
        board0.setBoardId(1);
        board1.setBoardId(2);
        // set corrisponding game id
        board0.setGameId(1);
        board1.setGameId(1);
        //createboards to give to game
        Integer [][] threeD0 = {{0,0,0},{0,0,0},{0,0,0}};
        Integer [][] threeD1 = {{0,0,0},{0,0,0},{0,0,0}};
        //add arrays to board
        board0.setBoard(threeD0);
        board1.setBoard(threeD1);

        allGames.add( testGame );
        allBoards.add( board0 );
        allBoards.add( board1 );
    }


    @Override
    public List<TTTGame> getAllGames() {
        return allGames.stream().map( toCopy -> new TTTGame( toCopy ) ).collect(Collectors.toList());
    }

    @Override
    public List<TTTBoard> getAllBoards() {
        return allBoards.stream().map( toCopy -> new TTTBoard( toCopy ) ).collect(Collectors.toList());
    }

    @Override
    public TTTGame addGame(TTTGame toAdd) {
        //create copy of this game
        TTTGame realCopy = new TTTGame(toAdd);
        //sets game id to next ava value
        realCopy.setGameId(allGames.stream().mapToInt( g -> g.getGameId() ).max().orElse(0) + 1 );
        //adds game
        allGames.add( realCopy );
        //returns game
        return new TTTGame(realCopy);
    }

    @Override
    public TTTGame getGameByGameId(Integer gameId) {
        //filters all games for game with this id.
        TTTGame toCopy = allGames.stream().filter( g -> g.getGameId() == gameId ).findAny().orElse(null);
        //returns game if not null
        if( toCopy != null ) return new TTTGame(toCopy);
        return null;
    }



    @Override
    public TTTBoard addBoard(TTTBoard toAdd) {
        TTTBoard realCopy = new TTTBoard(toAdd);
        realCopy.setGameId(allBoards.stream().mapToInt( g -> g.getBoardId() ).max().orElse(0) + 1 );
        allBoards.add( realCopy );
        return new TTTBoard(realCopy);
    }

    @Override
    public List<TTTBoard> getBoardsByGameId(Integer gameId) {
        //TODO: Return a list not nulls
        TTTBoard toCopy = allBoards.stream().filter( g -> g.getGameId() == gameId ).findAny().orElse(null);
        //returns board if not null
        if( toCopy != null ) return null;
        return null;
    }

    @Override
    public TTTBoard getBoardByBoardId(Integer boardId) {
        //filters all games for game with this id.
        TTTBoard toCopy = allBoards.stream().filter( g -> g.getGameId() == boardId ).findAny().orElse(null);
        //returns game if not null
        if( toCopy != null ) return new TTTBoard(toCopy);
        return null;
    }

    @Override
    public void xOrOPlacement(Integer xO, Integer placement) {

    }
}
