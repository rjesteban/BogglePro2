package Trie;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
    Trie t = new Trie(); 

    public Trie getT() {
        return t;
    }
    
    public Dictionary (String _path) throws FileNotFoundException {
        File file =  new File (_path);        
        Scanner fileread = new Scanner(file);
        while(fileread.hasNextLine()){
            String curLine= fileread.nextLine();
            if(curLine.length()>2&&curLine.length()<=16)
                t.addWord(curLine);
        }
    }
}
