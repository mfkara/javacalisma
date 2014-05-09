/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekiller;

import java.awt.Graphics;

/**
 *
 * @author Sungur Fırat
 */
public abstract class sekil {
    private double x;
    private double y;
    private double en;
    private double boy;

    public abstract void ciz(Graphics g);
    
    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
