/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dice;

/**
 *
 * @author El Gato
 */
public class Dice {
    private String sides;
    private boolean isVisited;
    
    public Dice(String _sides){
        sides = _sides.toLowerCase();
        isVisited = false;
    }

    public String getSides() {
        return sides;
    }

    public boolean getVisitedState() {
        return isVisited;
    }

    public void setVisitedState(boolean isVisited) {
        this.isVisited = isVisited;
    }
    
    
}
