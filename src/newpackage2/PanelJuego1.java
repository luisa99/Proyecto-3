/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author PERSONAL
 */
public class PanelJuego1 extends javax.swing.JPanel {
    int x,y;
    Esfera objEsferaGlobal;
    ArrayList<Esfera> nomArrayList = new ArrayList<Esfera>();
    Graphics2D g2;
    /**
     * Creates new form PanelJuego1
     */
    public PanelJuego1() {
        initComponents();
    }
    public void recibirEsfera(Esfera obj){
        nomArrayList.add(obj);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        for(Esfera b: nomArrayList){
            g2.fill(b.crearEsfera());
        }
        g2.setStroke(new BasicStroke(15.0f)); 
        g2.drawLine (0, 0, 0, 620);
        g2.setStroke(new BasicStroke(15.0f)); 
        g2.drawLine (0, 620, 1220, 620);
        g2.setStroke(new BasicStroke(15.0f)); 
        g2.drawLine (1220, 620, 1220, 0);
        g2.setStroke(new BasicStroke(15.0f)); 
        g2.drawLine (0, 0, 1220, 0);
        repaint();
        removeAll();
    }
    public void paint1(Graphics g){
        super.paint(g);
        g2 = (Graphics2D)g;
        for(Esfera b: nomArrayList){
            g2.fill(b.crearEsfera1());
            
        }
        
        repaint();
        removeAll();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}