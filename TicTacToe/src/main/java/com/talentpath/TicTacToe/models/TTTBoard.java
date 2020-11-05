package com.talentpath.TicTacToe.models;

public class TTTBoard {
    private Integer [][] board;
    private Integer gameId;
    private Integer boardId;

    public TTTBoard() {
    }

    public TTTBoard(TTTBoard that) {
        this.board = that.board;
        this.gameId = that.gameId;
        this.boardId = that.boardId;
    }

    public Integer[][] getBoard() {
        return board;
    }

    public void setBoard(Integer[][] board) {
        this.board = board;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }
}
