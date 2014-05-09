/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekiller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Sungur Fırat
 */
public class Daire extends sekil {

    @Override
    public void ciz(Graphics g) {
       Graphics2D g2= (Graphics2D)g;
        g2.draw(new Ellipse2D.Double(getX(),getY(),getEn(),getBoy()));
    }
    
}
