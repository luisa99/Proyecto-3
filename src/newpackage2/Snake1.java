
package newpackage2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author PERSONAL
 */
public class Snake1 extends javax.swing.JFrame implements KeyListener, Runnable{
    /*Declaracion de variables*/
    Graphics2D g2;
    JButton[] snake = new JButton[200];
    JButton obstaculo,obstaculo1,obstaculo2,obstaculo3,obstaculo4,obstaculo5,obstaculo6,obstaculo7,obstaculo16,obstaculo18;
    JButton obstaculo8,obstaculo9,obstaculo10,obstaculo11,obstaculo12,obstaculo13,obstaculo14,obstaculo15,obstaculo17,obstaculo19,obstaculo20;
     JButton obstaculo21,obstaculo22,obstaculo23,obstaculo24,obstaculo25,obstaculo26,obstaculo27,obstaculo28,obstaculo29,obstaculo30;
    JButton comidabonus;
    JLabel JLabel1;
    int x = 400, y = 400, gu = 2, direccionx = 1, direcciony = 0, velocidad = 100, diferencia = 0, anteriorx, anteriory, puntaje = 0;
    int[] lbx = new int[400];
    int[] lby = new int[400];
    Graphics g;
    Point[] lbp = new Point[400];
    Point punto = new Point();
    Thread hilo1,hilo2,hilo3;
    boolean comida = false, runl = false, runr = true, runu = true, rund = true, banderabonus = true;
    Random r = new Random();
    /*inicializa las variables*/ 
    public void inicializarVariables() {
        gu = 3;
        lbx[0] = 100;
        lby[0] = 150;
        direccionx = 10;
        puntaje=0;
        direcciony = 0;
        diferencia = 0;
        comida = false;
        runl = false;
        runr = true;
        runu = true;
        rund = true;
        banderabonus = true;
    }
        
    /*crea la culebrita de un tamaño de 3*/
    public void crearSnake() {
        for (int i = 0; i < 3; i++) {
            snake[i] = new JButton("lb" + i);
            snake[i].setEnabled(false);
            panel.add(snake[i]);
            snake[i].setBounds(lbx[i], lby[i], 10, 10);
            lbx[i + 1] = lbx[i] - 10;
            lby[i + 1] = lby[i];
        }
    }
    /*resetea el juego y vuelve a iniciarlo*/
    void reset() {
        inicializarVariables();
        panel.removeAll();
        crearSnake();
        jLabel1.setText("Puntaje" + puntaje);
        dispose();
    }
    /*metodo donde se agrega cola a la culebrita cada vez que coma*/
    void crecer() {
        snake[gu] = new JButton();
        snake[gu].setEnabled(false);
        panel.add(snake[gu]);

        int a = 10 + (10 * r.nextInt(30));
        int b = 10 + (10 * r.nextInt(30));

        lbx[gu] = a;
        lby[gu] = b;
        snake[gu].setBounds(a, b, 10, 10);

        gu++;
    }
    /*valida si se choca con el cuerpo por medio de coordenadas*/
    public void choqueCuerpo(){
        int i=2;
        while(snake[i]!=null){
            if(snake[0].getLocation().x==snake[i].getLocation().x&&snake[0].getLocation().y==snake[i].getLocation().y){
                JOptionPane.showMessageDialog(this, "Fin del Juego", "", JOptionPane.INFORMATION_MESSAGE);
                reset();
                break;
            }else{
                i++;
            }
        }
    }
    /*este metodo valida si se choca contra las paredes o los obstaculos por medio de coordenadas*/
    public void choquePared(){
        if(snake[0].getLocation().x<1 || snake[0].getLocation().x >390 || snake[0].getLocation().y<10 || snake[0].getLocation().y>370){
         JOptionPane.showMessageDialog(this, "Fin del Juego", "", JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if(puntaje>10&&puntaje<=20){
            if((snake[0].getLocation().x==50  || snake[0].getLocation().x ==250) && (snake[0].getLocation().y>=50&&snake[0].getLocation().y<=230)){
                JOptionPane.showMessageDialog(this, "Game Over", "", JOptionPane.INFORMATION_MESSAGE);
                reset();
            }
        }
        if(puntaje>20&&puntaje<=30){
             if((snake[0].getLocation().y==50 || snake[0].getLocation().y ==230)&&(snake[0].getLocation().x>=110&&snake[0].getLocation().x<=190) ){
                JOptionPane.showMessageDialog(this, "Game Over", "", JOptionPane.INFORMATION_MESSAGE);
                reset();
            }           
        }
    }
    
    
   /*este metodo mueve la culebrita segun el teclado*/
    void avanzar() {
        if(puntaje<=10){
            jLabel2.setText("Nivel: 1");
        }else{
            if(puntaje>=10&&puntaje<=20){
                
                panel.add(obstaculo);
                obstaculo.setBounds(50, 50, 20, 20);
                panel.add(obstaculo1);
                obstaculo1.setBounds(50, 70, 20, 20);
                panel.add(obstaculo2);
                obstaculo2.setBounds(50, 90, 20, 20);
                panel.add(obstaculo3);
                obstaculo3.setBounds(50, 110, 20, 20);
                panel.add(obstaculo4);
                obstaculo4.setBounds(50, 130, 20, 20);
                panel.add(obstaculo5);
                obstaculo5.setBounds(50, 150, 20, 20);
                panel.add(obstaculo6);
                obstaculo6.setBounds(50, 170, 20, 20);
                panel.add(obstaculo7);
                obstaculo7.setBounds(50, 190, 20, 20);
                panel.add(obstaculo8);
                obstaculo8.setBounds(50, 210, 20, 20);
                panel.add(obstaculo9);
                obstaculo9.setBounds(50, 230, 20, 20);
                panel.add(obstaculo10);
                obstaculo10.setBounds(250, 50, 20, 20);
                panel.add(obstaculo11);
                obstaculo11.setBounds(250, 70, 20, 20);
                panel.add(obstaculo12);
                obstaculo12.setBounds(250, 90, 20, 20);
                panel.add(obstaculo13);
                obstaculo13.setBounds(250, 110, 20, 20);
                panel.add(obstaculo14);
                obstaculo14.setBounds(250, 130, 20, 20);
                panel.add(obstaculo15);
                obstaculo15.setBounds(250, 150, 20, 20);
                panel.add(obstaculo16);
                obstaculo16.setBounds(250, 170, 20, 20);
                panel.add(obstaculo17);
                obstaculo17.setBounds(250, 190, 20, 20);
                panel.add(obstaculo18);
                obstaculo18.setBounds(250, 210, 20, 20);
                panel.add(obstaculo19);
                obstaculo19.setBounds(250, 230, 20, 20);
                panel.add(obstaculo20);
                obstaculo20.setBounds(250, 250, 20, 20);
                jLabel2.setText("Nivel: 2");
                
            }else{
                if(puntaje>=20&&puntaje<=30){
                    
                    panel.add(obstaculo);
                obstaculo.setBounds(50, 50, 20, 20);
                panel.add(obstaculo1);
                obstaculo1.setBounds(50, 70, 20, 20);
                panel.add(obstaculo2);
                obstaculo2.setBounds(50, 90, 20, 20);
                panel.add(obstaculo3);
                obstaculo3.setBounds(50, 110, 20, 20);
                panel.add(obstaculo4);
                obstaculo4.setBounds(50, 130, 20, 20);
                panel.add(obstaculo5);
                obstaculo5.setBounds(50, 150, 20, 20);
                panel.add(obstaculo6);
                obstaculo6.setBounds(50, 170, 20, 20);
                panel.add(obstaculo7);
                obstaculo7.setBounds(50, 190, 20, 20);
                panel.add(obstaculo8);
                obstaculo8.setBounds(50, 210, 20, 20);
                panel.add(obstaculo9);
                obstaculo9.setBounds(50, 230, 20, 20);
                panel.add(obstaculo10);
                obstaculo10.setBounds(250, 50, 20, 20);
                panel.add(obstaculo11);
                obstaculo11.setBounds(250, 70, 20, 20);
                panel.add(obstaculo12);
                obstaculo12.setBounds(250, 90, 20, 20);
                panel.add(obstaculo13);
                obstaculo13.setBounds(250, 110, 20, 20);
                panel.add(obstaculo14);
                obstaculo14.setBounds(250, 130, 20, 20);
                panel.add(obstaculo15);
                obstaculo15.setBounds(250, 150, 20, 20);
                panel.add(obstaculo16);
                obstaculo16.setBounds(250, 170, 20, 20);
                panel.add(obstaculo17);
                obstaculo17.setBounds(250, 190, 20, 20);
                panel.add(obstaculo18);
                obstaculo18.setBounds(250, 210, 20, 20);
                panel.add(obstaculo19);
                obstaculo19.setBounds(250, 230, 20, 20);
                panel.add(obstaculo20);    
                obstaculo20.setBounds(250, 250, 20, 20);
                panel.add(obstaculo21);
                obstaculo21.setBounds(110, 50, 20, 20);
                panel.add(obstaculo22);
                obstaculo22.setBounds(130, 50, 20, 20);
                panel.add(obstaculo23);
                obstaculo23.setBounds(150, 50, 20, 20);
                panel.add(obstaculo24);
                obstaculo24.setBounds(170, 50, 20, 20);
                panel.add(obstaculo25);
                obstaculo25.setBounds(190, 50, 20, 20);
                panel.add(obstaculo26);
                obstaculo26.setBounds(110, 230, 20, 20);
                panel.add(obstaculo27);
                obstaculo27.setBounds(130, 230, 20, 20);
                panel.add(obstaculo28);
                obstaculo28.setBounds(150, 230, 20, 20);
                panel.add(obstaculo29);
                obstaculo29.setBounds(170, 230, 20, 20);
                panel.add(obstaculo30);
                obstaculo30.setBounds(190, 230, 20, 20);
                jLabel2.setText("Nivel: 3");
               
                }
            }
        }
        choquePared();
        choqueCuerpo();
        for (int i = 0; i < gu; i++) {
            lbp[i] = snake[i].getLocation();//guarda las posiciones de la culebrita
            
        }
        
        lbx[0] += direccionx;
        lby[0] += direcciony;
        snake[0].setBounds(lbx[0], lby[0], 10, 10);

        for (int i = 1; i < gu; i++) {
            snake[i].setLocation(lbp[i - 1]);
        }

        if (lbx[0] == x) {
            lbx[0] = 10;
        } else if (lbx[0] == 0) {
            lbx[0] = x - 10;
        } else if (lby[0] == y) {
            lby[0] = 10;
        } else if (lby[0] == 0) {
            lby[0] = y - 10;
        }

        if (lbx[0] == lbx[gu - 1] && lby[0] == lby[gu - 1]) {
            comida = false;
            puntaje += 5;
            
            jLabel1.setText("Puntaje "+puntaje);//crea la comidabonus en coordenadas aleatorias
            if (puntaje % 50 == 0 && banderabonus == true) {
                panel.add(comidabonus);
                comidabonus.setBounds((10 * r.nextInt(30)), (10 * r.nextInt(30)), 15, 15);
                punto = comidabonus.getLocation();
                banderabonus = false;
            }
        }

        if (banderabonus == false) {
            if (punto.x <= lbx[0] && punto.y <= lby[0] && punto.x + 10 >= lbx[0] && punto.y + 10 >= lby[0]) {
                panel.remove(comidabonus);//remueve la comida del panel
                puntaje += 15;
               
                jLabel1.setText("Puntaje "+puntaje);
                banderabonus = true;
            }
        }

        if (comida == false) {
            crecer();
            comida = true;
        } else {
            snake[gu - 1].setBounds(lbx[gu - 1], lby[gu - 1], 10, 10);
        }
        

        panel.repaint();
        show();
    }
    
    public Snake1(String nombre) {
            initComponents();
            inicializarVariables();
            jLabel3.setText("Nombre: "+nombre);
            jLabel1.setText("Puntaje "+puntaje);
            comidabonus = new JButton();
            obstaculo=new JButton();
            obstaculo1=new JButton();
            obstaculo2=new JButton();//inicializa las variables y el nuevo hilo
            obstaculo3=new JButton();
            obstaculo4=new JButton();
            obstaculo5=new JButton();
            obstaculo6=new JButton();
            obstaculo7=new JButton();
            obstaculo8=new JButton();
            obstaculo9=new JButton();
            obstaculo10=new JButton();
            obstaculo11=new JButton();
            obstaculo12=new JButton();
            obstaculo13=new JButton();
            obstaculo14=new JButton();
            obstaculo15=new JButton();
            obstaculo16=new JButton();
            obstaculo17=new JButton();
            obstaculo18=new JButton();
            obstaculo19=new JButton();
            obstaculo20=new JButton();
            obstaculo21=new JButton();
            obstaculo22=new JButton();
            obstaculo23=new JButton();
            obstaculo24=new JButton();
            obstaculo25=new JButton();
            obstaculo26=new JButton();
            obstaculo27=new JButton();
            obstaculo28=new JButton();
            obstaculo29=new JButton();
            obstaculo30=new JButton();
            comidabonus.setEnabled(false);
           
            
            crearSnake();
            show();
            addKeyListener(this);
        
            hilo1 = new Thread(this);
            hilo1.start(); 
            
           
        
    }
    public int getPuntaje(){
        return this.puntaje;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(51, 153, 0));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("Puntaje: ");

        jLabel2.setText("Nivel:");

        jLabel3.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (runl == true && e.getKeyCode() == 37) {
            direccionx = -10; 
            direcciony = 0;
            runr = false;     
            runu = true;      
            rund = true;     
        }
        /* mueve la culebrita hacia arriba*/
        if (runu == true && e.getKeyCode() == 38) {
            direccionx = 0;
            direcciony = -10; 
            rund = false;    
            runr = true;     
            runl = true;      
        }
        /*mueve la culebrita hacia la derecha*/
        if (runr == true && e.getKeyCode() == 39) {
            direccionx = +10; 
            direcciony = 0;
            runl = false;
            runu = true;
            rund = true;
        }
        /* mueve la culebrita hacia abajo*/
        if (rund == true && e.getKeyCode() == 40) {
            direccionx = 0;
            direcciony = +10;
            runu = false;
            runr = true;
            runl = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    /*inicia el hilo*/
    @Override
    public void run() {
        while(puntaje<=30){
            avanzar();
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException ie) {
            }
        }
        JOptionPane.showMessageDialog(this, "Felicidades GANASTE", "", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
