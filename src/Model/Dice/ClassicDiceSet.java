/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author El Gato
 */
public class ClassicDiceSet implements DiceSet{
    private List<Dice> set;
    
    public ClassicDiceSet(){
        set = new ArrayList<>();
        set.add(new Dice("RIFOBX"));
        set.add(new Dice("IFEHEY"));
        set.add(new Dice("DENOWS"));
        set.add(new Dice("UTOKND"));
        set.add(new Dice("HMSRAO"));
        set.add(new Dice("LUPETS"));
        set.add(new Dice("ACITOA"));
        set.add(new Dice("YLGKUE"));
        set.add(new Dice("QBMJOA"));
        set.add(new Dice("EHISPN"));
        set.add(new Dice("VETIGN"));
        set.add(new Dice("BALIYT"));
        set.add(new Dice("EZAVND"));
        set.add(new Dice("RALESC"));
        set.add(new Dice("UWILRG"));
        set.add(new Dice("PACEMD"));
    }
            
    public List<Dice> getSet(){
        return set;
    }
    
}
