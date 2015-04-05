

package Trie;
import java.util.ArrayList;
import java.util.List;


public class Trie {

    private TrieNode root;

  
    public Trie() {
        root = new TrieNode();
    }

  
    public void addWord(String word) {
        root.addWord(word.toLowerCase());
    }

 
    public ArrayList getWords(String prefix) {
        
        TrieNode lastNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            lastNode = lastNode.getNode(prefix.charAt(i));
            if (lastNode == null) {
                return new ArrayList();
            }
        }        
        return lastNode.getWords();
    }
    
    public boolean findWord(String word){
       
        if(root.findWord(word)){
            return true; 
        }
        return false;
    }
    public boolean removeWord(String word){
        if(root.removeWord(word)){
            return true; 
        }
        return false;
    }
}

