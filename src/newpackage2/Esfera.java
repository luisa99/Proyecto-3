/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author PERSONAL
 */
public class Esfera {
    int x , y , tama = 30;

    Esfera(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public Ellipse2D crearEsfera() {
        
        return new Ellipse2D.Double(x, y, tama, tama);
        
    }
    public Rectangle2D crearEsfera1() {
        
        return new Rectangle2D.Double(x, y, tama, tama);
        
    }

    public void moveresferaX(int contador) {
        x = x - contador;
    }
    
   
    public void moveresferay(int contador) {
        y = y - contador;
    }
     public void moveresferaz(int contador) {
        x = x + contador;
    }
     
    public void moveresferaw(int contador) {
        y = y + contador;
    }
}
