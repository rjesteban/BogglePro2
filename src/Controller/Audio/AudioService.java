/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Audio;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
/**
 *
 * @author El Gato
 */
public class AudioService {
    
    //	Music 
	static File file;
	static AudioInputStream audioIn;
	
	public static Clip createClip(String sound){
		Clip clip;
		try{
			file = new File(sound);
			audioIn = AudioSystem.getAudioInputStream(file);
			
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			return clip;
		}catch(Exception e){
			System.err.println("Can't read: "+sound);
		}
		return null;
	}
	
	static boolean soundsIsOn = true;
        
	public static void normalSoundPlay(Clip sound){
		if(soundsIsOn){
			sound.stop();
			sound.setFramePosition(0);
			sound.start();
		}
	}
	
	public static void loopSoundPlay(Clip music){
		if(soundsIsOn){
			music.stop();
			music.setFramePosition(0);
			music.loop(Clip.LOOP_CONTINUOUSLY);
		}
	}
}
