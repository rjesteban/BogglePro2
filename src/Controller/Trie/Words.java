/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie;

import java.util.LinkedList;

/**
 *
 * @author PurazmaKrakka
 */
public class Words {
        private LinkedList<String> word;
        private int length;
    /**
     * Constructor.
     */
    public Words() {
        word = new LinkedList<String>();
        length = 0;
    }

    public LinkedList<String> getWords() {
        return word;
    }
    
    /**
     * Add a letter to the Word.
     */
    public void addLetter (String letter) {
        word.add(letter);
        length++;
    }
    /**
     *Returns length of word
     **/
    public int length(){
        return length;
    }
    /**
     * "Flatten" the word back into a String.
     */
    public String toString() {
        String tempStr = "";
        for(int i=0; i< word.size(); i++){
                tempStr += word.get(i);
        }
        return tempStr;
    }

    /**
     * Make a copy of the word.  This is important for getting your
     * recursion to work correctly (pass by value instead of by
     * reference).
     */
    public Words makeCopy() {
        String str = this.toString();
        Words newWord = new Words();
        for(int i = 0; i< str.length(); i++){
                newWord.addLetter(""+str.charAt(i));
        }
        return newWord;
    }

}
