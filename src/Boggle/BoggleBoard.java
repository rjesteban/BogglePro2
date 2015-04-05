/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Boggle;

import Model.Dice.Dice;
import Model.Dice.DiceSet;
import java.util.Random;

/**
 *
 * @author El Gato
 */
public class BoggleBoard{
    private final DiceSet set;
    private final String[][] board;
    private final Random randomizer;
    private final int DEFAULT_MAX_BOARDSIZE;
    
    public BoggleBoard(DiceSet _set){
        DEFAULT_MAX_BOARDSIZE = 4;
        board = new String[DEFAULT_MAX_BOARDSIZE][DEFAULT_MAX_BOARDSIZE];
        set = _set;
        randomizer = new Random();
    }
    
    private Dice generateDice(){
        int i=0;
        while(set.getSet().get(i).getVisitedState()){
            i = (int) (Math.random()*100)%16;
            
        }
        set.getSet().get(i).setVisitedState(true);
        
        return set.getSet().get(i);
    }
    
    private String generateFace(){
        Dice _dice = generateDice();
        String s = String.valueOf(_dice.getSides().charAt(randomizer.nextInt(6)));
        if(s.equals("q"))
            s= "qu";
        return s;
    }
    
    public void generateBoard(){
        for(int x=0;x<this.DEFAULT_MAX_BOARDSIZE;x++){
            for(int y=0;y<this.DEFAULT_MAX_BOARDSIZE;y++){
                this.board[x][y] = this.generateFace();
            }
        }
    }

    public int getDEFAULT_MAX_BOARDSIZE() {
        return DEFAULT_MAX_BOARDSIZE;
    }

    public String[][] getBoard() {
        return this.board;
    }
    
}
