/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERSONAL
 */
public class Contador extends Thread{
    PanelJuego1 panel_esfera;
    Esfera obj_Esfera;
    int i=25,x,y;
    public Contador(PanelJuego1 obj_panel,int x,int y) {
        this.x=x;
        this.y=y;
        obj_Esfera= new Esfera(x,y);
        panel_esfera=obj_panel;
    }
     public void run(){
         panel_esfera.recibirEsfera(obj_Esfera);
         if(x==325){
             
             while(i>=0){
                try {
                    obj_Esfera.moveresferaX(i);
                    panel_esfera.paint(panel_esfera.getGraphics());
                    Thread.sleep(100);
                    i--;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Stop del hilo 1.");
                }
             }
         }
         if(x==0){
             
             while(i>=0){
                try {
                    obj_Esfera.moveresferaz(i);
                    panel_esfera.paint(panel_esfera.getGraphics());
                    Thread.sleep(100);
                    i--;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Stop del hilo 1.");
                }
            }
         }
         if(x==145&&y==325){
             
             try{
             while(i>=0){
                    obj_Esfera.moveresferay(i);
                    panel_esfera.paint(panel_esfera.getGraphics());
                    Thread.sleep(100);
                    i--;
            }
             }catch (InterruptedException ex) {
                     Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
         
         if(x==146&&y==324){   
             i=17;
             try{
                 while(i>0){
                     i--;
                    obj_Esfera.moveresferaX(i);
                    panel_esfera.paint1(panel_esfera.getGraphics());
                    Thread.sleep(10);
                 }
             }catch (InterruptedException ex) {
                     Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
        if(x==146&&y==325){  
            i=17;
             try{
                 while(i>0){
                    obj_Esfera.moveresferaz(i);
                    panel_esfera.paint1(panel_esfera.getGraphics());
                    Thread.sleep(10);
                    i--;
                 }
             }catch (InterruptedException ex) {
                     Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
        if(x==145&&y==0){   
             try{
             while(i>=0){
                    obj_Esfera.moveresferaw(i);
                    panel_esfera.paint(panel_esfera.getGraphics());
                    Thread.sleep(100);
                    i--;
            }
             }catch (InterruptedException ex) {
                     Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
     }
     public void reset(){
        this.i=10;
    }
}
