/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author Sungur Fırat
 */
public class mp3 extends Thread {
    File f;
    public mp3(File f){
        this.f=f;
    }
    
public  void run() {
   
    try {
        FileInputStream fileInputStream = new FileInputStream(f);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);    
        Player player = new Player(fileInputStream);
        player.play();
    } catch (JavaLayerException ex) {
        Logger.getLogger(mp3.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(mp3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    
}
