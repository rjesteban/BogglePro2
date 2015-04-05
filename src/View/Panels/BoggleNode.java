/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panels;

import java.util.ArrayList;

/**
 *
 * @author Vermilion
 */
public class BoggleNode {
    boolean isPressed;
    ArrayList<BoggleNode> neighbors; 

    public BoggleNode() {
        this.isPressed=false;
        neighbors=new ArrayList<BoggleNode>(); 
    }
    
    
    public boolean IsPressed() {
        return isPressed;
    }

    public void setIsPressed(boolean isPressed) {
        this.isPressed = isPressed;
    }

    public boolean isNeighbor(BoggleNode b) {
        return neighbors.contains(b);
    }

    public void addNeighbors(BoggleNode b) {
        neighbors.add(b);
    }
}
