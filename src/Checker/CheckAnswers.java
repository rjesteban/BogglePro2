/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checker;

import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Vermilion
 */
public class CheckAnswers {
    TreeSet<String> boardWords;
    
    public CheckAnswers(List _boardWords){
        boardWords = new TreeSet<>(_boardWords);
    }
    
    public Boolean checkInList(String _word){
        for(String s: boardWords){
            if(s.equalsIgnoreCase(_word))
                return true;
        }
        return false;
    }
}
