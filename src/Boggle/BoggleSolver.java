/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

import Trie.Dictionary;
import java.io.FileNotFoundException;
import java.util.List;


/**
 *
 * @author PurazmaKrakka
 */
public class BoggleSolver{
    private  Dictionary reference;

    public BoggleSolver(Dictionary _reference) throws FileNotFoundException {
        this.reference= _reference;
    }
    
    public List<String> solver(BoggleBoard board, boolean[][] tracker,
            String word, int x, int y, List<String> result) throws FileNotFoundException {
          //  System.out.println(word);
        if(this.reference.getT().findWord(word)) {
            if(!result.contains(word))
                result.add(word);
        }
    
          
        boolean[][] tmp = new boolean[4][4];
        for (int i = 0; i < tracker.length; i++) {
            for (int j = 0; j < tracker.length; j++) {
                tmp[i][j] = tracker[i][j];
            }
        }
        tmp[x][y] = true;
        //upper left
        if (0 <= x - 1 && 0 <= y - 1 && !tmp[x - 1][y - 1]) {
            solver(board, tmp,  word.concat(String.valueOf(board.getBoard()[x - 1][y - 1])), x - 1, y - 1, result);
        }
        //up
        if (0 <= y - 1 && !tmp[x][y - 1]) {
            solver(board, tmp,  word.concat(String.valueOf(board.getBoard()[x][y - 1])), x, y - 1, result);
        }
        //upper right
        if (x + 1 < board.getDEFAULT_MAX_BOARDSIZE() && 0 <= y - 1 && !tmp[x + 1][y - 1]) {
            solver(board, tmp, word.concat(String.valueOf(board.getBoard()[x + 1][y - 1])), x + 1, y - 1, result);
        }
        //right
        if (x + 1 < board.getDEFAULT_MAX_BOARDSIZE() && !tmp[x + 1][y]) {
            solver(board, tmp, word.concat(String.valueOf(board.getBoard()[x + 1][y])), x + 1, y, result);
        }
        //lower right
        if (x + 1 < board.getDEFAULT_MAX_BOARDSIZE() && y + 1 < board.getBoard()[0].length && !tmp[x + 1][y + 1]) {
            solver(board, tmp,  word.concat(String.valueOf(board.getBoard()[x + 1][y + 1])), x + 1, y + 1, result);
        }
        //down
        if (y + 1 < board.getBoard()[0].length && !tmp[x][y + 1]) {
            solver(board, tmp,  word.concat(String.valueOf(board.getBoard()[x][y + 1])), x, y + 1, result);
        }
        //lower left
        if (0 <= x - 1 && y + 1 < board.getBoard()[0].length && !tmp[x - 1][y + 1]) {
            solver(board, tmp,  word.concat(String.valueOf(board.getBoard()[x - 1][y + 1])), x - 1, y + 1, result);
        }
        //left
        if (0 <= x - 1 && !tmp[x - 1][y]) {
            solver(board, tmp,  word.concat(String.valueOf(board.getBoard()[x - 1][y])), x - 1, y, result);
        }
        
        return result;
    }
    public List<String>  loop(BoggleBoard board, boolean[][] tracker, 
            String word, List<String> result) throws FileNotFoundException{
       // for(int i=0;i<4;i++){
       //     for(int j=0;j<4;j++){
        //        System.out.print(" <" + board.getBoard()[i][j] + "> ");
       //     }
        //    System.out.println("");
       // }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                solver(board, tracker, String.valueOf(board.getBoard()[i][j]), i, j, result);
            }
        }
        return result;
    }
}
