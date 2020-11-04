package com.talentpath.battleship.daos;

import com.talentpath.battleship.models.BattleshipBoard;
import com.talentpath.battleship.models.BattleshipGame;
import com.talentpath.battleship.models.BattleshipGuess;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Profile("servicetesting")
public class InMemBattleshipDao implements BattleshipDao{

    List<BattleshipGame> allGames = new ArrayList<>();
    List<BattleshipBoard> allBoards = new ArrayList<>();
    List<BattleshipGuess> allGuess = new ArrayList<>();

    public InMemBattleshipDao() {reset();}

    @Override
    public void reset() {
        allGames.clear();
        allBoards.clear();
        allGuess.clear();

        BattleshipBoard zero1 = new BattleshipBoard();
        BattleshipBoard one1 = new BattleshipBoard();

        BattleshipBoard zero2 = new BattleshipBoard();
        BattleshipBoard one2 = new BattleshipBoard();

        List<BattleshipGuess> guessList1 = new ArrayList<>();
        List<BattleshipGuess> guessList2 = new ArrayList<>();

//        BattleshipGuess guess1 = new BattleshipGuess();
//        BattleshipGuess guess2 = new BattleshipGuess();
//        BattleshipGuess guess3 = new BattleshipGuess();
//        BattleshipGuess guess4 = new BattleshipGuess();

//        guessList1.add(guess1);
//        guessList1.add(guess2);
//        guessList2.add(guess3);
//        guessList2.add(guess4);


        BattleshipGame intial = new BattleshipGame();
        intial.setGameId(1);
        intial.setBattleshipBoardPlayer0(zero1) ;
        intial.setBattleshipBoardPlayer1(one1) ;
        intial.setGuessedPosition(guessList1);
        intial.setTotalGuesses(0);

        allGames.add(intial);

        BattleshipGame secondary = new BattleshipGame();
        secondary.setGameId(2);
        secondary.setBattleshipBoardPlayer0(zero2);
        secondary.setBattleshipBoardPlayer1(one2);
        secondary.setGuessedPosition(guessList2);
        secondary.setTotalGuesses(0);

        allGames.add(secondary);



    }

    @Override
    public List<BattleshipGame> getAllGames() {
        return allGames.stream().map(toCopy -> new BattleshipGame(toCopy)).collect(Collectors.toList());
    }

    @Override
    public List<BattleshipBoard> getAllBoards() {
        return allBoards.stream().collect(Collectors.toList());
    }

    @Override
    public BattleshipGame addGame(BattleshipGame toAdd) {
        BattleshipGame realCopy = new BattleshipGame((toAdd));
        realCopy.setGameId(allGames.stream().mapToInt( g -> g.getGameId() ).max().orElse(0)+1);
        allGames.add( realCopy );
        return new BattleshipGame(realCopy);
    }

    @Override
    public BattleshipGame getGameById(Integer gameId) {
        BattleshipGame toCopy = allGames.stream().filter( g -> g.getGameId() == gameId ).findAny().orElse(null);
        if( toCopy != null ) return new BattleshipGame(toCopy);
        return null;
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
