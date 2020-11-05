package com.talentpath.TicTacToe.services;

import com.talentpath.TicTacToe.daos.TTTDao;
import com.talentpath.TicTacToe.models.TTTBoard;
import com.talentpath.TicTacToe.models.TTTGame;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TTTService {

    TTTDao dao;

    @Autowired
    public TTTService ( TTTDao dao ){ this.dao = dao; }

    public Integer beginGame() {
        //create new game
        TTTGame newGame = new TTTGame();

        //set attributes
        newGame.setGameName( "Default Game Name" );

        //add to dao
        newGame = dao.addGame( newGame );

        //get id
        Integer newGameId = newGame.getGameId();

        //create blank array for game
        Integer [][] new3DArray = {{0,0,0},{0,0,0},{0,0,0}};

        //create new board
        TTTBoard newBoard = new TTTBoard();

        //set board attributes
        newBoard.setGameId(newGameId);
        newBoard.setBoard(new3DArray);

        //add to dao
        newBoard = dao.addBoard( newBoard );

        //get id
        Integer newBoardId = newBoard.getBoardId();

        return newGame.getGameId();
    }

    public List<TTTBoard> getBoards(){
        return dao.getAllBoards();
    }

    public List<TTTGame> getGames(){
        return dao.getAllGames();
    }

    public TTTBoard getBoardByBoardId(Integer boardId){
        return dao.getBoardByBoardId(boardId);
    }

    public TTTGame getGameByGameId(Integer gameId){
        return dao.getGameByGameId(gameId);
    }

    public List<TTTBoard> getBoardsByGameId(Integer gameId){
        //TODO: ensure this is actually accumulating boards
        List<TTTBoard> boardsAccum = new ArrayList<>();
        boardsAccum.add(dao.getAllBoards().stream().filter( g-> g.getGameId() == gameId ).findAny().orElse(null));
        return boardsAccum;
    }

    public boolean compareZeroVal (Integer target){
        return target == 0 ? true :  false;
    }

    public boolean checkIfSpaceEmpty(Integer placement, TTTBoard board){
        Integer targetValue = null;
        Integer [][] boardArry = board.getBoard();

        switch (placement) {
            case 0:
                targetValue = boardArry[0][0];
                return compareZeroVal(targetValue);
            case 1:
                targetValue = boardArry[0][1];
                return compareZeroVal(targetValue);
            case 2:
                targetValue = boardArry[0][2];
                return compareZeroVal(targetValue);
            case 3:
                targetValue = boardArry[1][0];
                return compareZeroVal(targetValue);
            case 4:
                targetValue = boardArry[1][1];
                return compareZeroVal(targetValue);
            case 5:
                targetValue = boardArry[1][2];
                return compareZeroVal(targetValue);
            case 6:
                targetValue = boardArry[2][0];
                return compareZeroVal(targetValue);
            case 7:
                targetValue = boardArry[2][1];
                return compareZeroVal(targetValue);
            case 8:
                targetValue = boardArry[2][0];
                return compareZeroVal(targetValue);
            default:
                return false;
        }
    }

    TTTBoard makeMove (Integer xO, Integer placement, TTTBoard board) {
        Integer[][] boardCopy = board.getBoard();

        if(checkIfSpaceEmpty(placement, board)){
            switch (placement) {
                case 0:
                    boardCopy[0][0]=xO;
                    break;
                case 1:
                    boardCopy[0][1]=xO;
                    break;
                case 2:
                    boardCopy[0][2]=xO;
                    break;
                case 3:
                    boardCopy[1][0]=xO;
                    break;
                case 4:
                    boardCopy[1][1]=xO;
                    break;
                case 5:
                    boardCopy[1][2]=xO;
                    break;
                case 6:
                    boardCopy[2][0]=xO;
                    break;
                case 7:
                    boardCopy[2][1]=xO;
                    break;
                case 8:
                    boardCopy[2][2]=xO;
                    break;
                default:
                    break;
            }
            board.setBoard(boardCopy);
        }



        return board;
    }

    void updateBoard(){

    }

}
