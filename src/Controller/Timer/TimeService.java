/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Timer;

import Controller.Audio.AudioService;
import View.Panels.Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author El Gato
 */
public class TimeService {
    static DecimalFormat timeFormatter = new DecimalFormat("00");    
    static Timer timer;
    static int minutes, seconds, milliseconds;
    static boolean flag = false;
    Game game1;
    
    public TimeService(Game _game){
        game1 = _game;
    }
//    
//    private static void formatTimer() {
//        timer = new Timer(10, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //addtimer();
//                if(minutes == 2 && seconds == 54 && flag==false){
//                    AudioService.loopSoundPlay(timeLeft);
//                    diceHolder.removeAll();
//                    diceHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Resources/thrill.gif")));
//                    flag = true;
//                    diceHolder.revalidate();
//                    diceHolder.repaint();
//                }
//                else if(minutes==0 && seconds > 19 && flag == true){
//                    diceHolder.removeAll();
//                    diceHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Resources/Board.png")));
//                    flag = false;
//                    diceHolder.revalidate();
//                    diceHolder.repaint();
//                }
//                if (milliseconds > 0) {
//                    milliseconds--;
//                } else {
//                    if (seconds == 0 && minutes == 0) {
//                        timer.stop();
//                        try {
//                            gameOver();
//                        } catch (FileNotFoundException ex) {
//                            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    } else if (seconds > 0) {
//                        seconds--;
//                        milliseconds = 99;
//                    } else if (minutes > 0) {
//                        minutes--;
//                        seconds = 59;
//                        milliseconds = 99;
//                    }
//                }
//                addtimer();
//                timeRunning.setText(timeFormatter.format(minutes) + ":"
//                        + timeFormatter.format(seconds) + "."
//                        + timeFormatter.format(milliseconds));
//            }
//        });
//
//    }
}
