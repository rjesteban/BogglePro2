

package Trie;
import java.util.ArrayList;

public class TrieNode {

    private TrieNode parent;
    private TrieNode[] children;
    private boolean isLeaf;     
    private boolean isWord;     
    private char character;     

    public TrieNode() {
        children = new TrieNode[26];
        isLeaf = true;
        isWord = false;
    }

    public TrieNode(char character) {
        this();
        this.character = character;
    }

    protected void addWord(String word) {
        
        if(word == null)
            throw new IndexOutOfBoundsException();
        
        char[] chars = word.toCharArray();
        
        for (char c : chars) {
            if(!Character.isLetter(c))
                throw new IllegalArgumentException();
        }
        
        isLeaf = false;
        int charPos = word.charAt(0) - 'a';

        
        if (children[charPos] == null) {
            children[charPos] = new TrieNode(word.charAt(0));
            children[charPos].parent = this;
        }

        if (word.length() > 1) {
            children[charPos].addWord(word.substring(1));
        } else {
            children[charPos].isWord = true;
        }
    }


    protected TrieNode getNode(char c) {
        return children[c - 'a'];
    }

    protected ArrayList getWords() {
        
        ArrayList list = new ArrayList();

        
        if (isWord) {
            list.add(toString());
        }

        
        if (!isLeaf) {
            
            for (int i = 0; i < children.length; i++) {
                if (children[i] != null) {
                    list.addAll(children[i].getWords());
                }
            }
        }
        return list;
    }

    public String toString() {
        if (parent == null) {
            return "";
        } else {
            return parent.toString() + new String(new char[]{character});
        }
    }
    
    protected boolean findWord(String word){

        TrieNode current = this;
        while(current != null){
        for(int i=0;i<word.length();i++){ 
            if(word.charAt(i)-'a'<0||word.charAt(i)-'a'>26)
                break;
            if(current.children[(int)(word.charAt(i)-'a')] == null)
                return false;
            else
                current = current.children[(int)(word.charAt(i)-'a')];
        }
        if (current.isWord == true){
//////            System.out.println("Given String is a Word!");
            return true;
        }
        else {
            //System.out.println("Given String is not a Word!");
            return false;
        }
        }
        return false;
    }
    
    protected boolean removeWord(String word){

        TrieNode current = this;
        while(current != null){
            for(int i=0;i<word.length();i++){               
                if(current.children[(int)(word.charAt(i)-'a')] == null)
                    return false;
                else
                    current = current.children[(int)(word.charAt(i)-'a')];
            }
            if (current.isWord == true){
                current.isWord = false;
                return true;
            }
        }
        return false;
    }
}
