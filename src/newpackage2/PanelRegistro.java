/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PERSONAL
 */
public class PanelRegistro extends javax.swing.JPanel {
    //declaracion de variables
    DateTimeFormatter formato= DateTimeFormatter.ofPattern("yyyy-MM-d HH:mm");
    DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("d-MMM-yyyy");
    private Persona persona;
    private DefaultTableModel table_model_personas;
    int edad;
    /**
     * Creates new form PanelRegistro
     */
    public PanelRegistro() {
        initComponents();
        jButton2.setVisible(false);
    }
    public void setTableModel(DefaultTableModel table_model_personas) {
        this.table_model_personas = table_model_personas;
    }
    /*actualiza los datos de la base de datos infantil en la tabla */
    public void refreshTableModel() {
        
            ArrayList<Persona> lista_personas = Repositorio.obtenerTodos();
            while (table_model_personas.getRowCount() > 0) {
                table_model_personas.removeRow(0);
            }

            for (Persona p : lista_personas) {
                String[] data = {Integer.toString(p.getId()), Integer.toString(p.getDocumento()),p.getNombre(), p.getApellido(),Integer.toString(p.getEdad()),p.getFecha(),Integer.toString(p.getPuntaje())};
                 table_model_personas.addRow(data);
            }
        
    }
     /*actualiza los datos de la base de datos juvenil en la tabla */
    public void refreshTableModel2() {
        
            ArrayList<Persona> lista_personas = Repositorio2.obtenerTodos();
            while (table_model_personas.getRowCount() > 0) {
                table_model_personas.removeRow(0);
            }

            for (Persona p : lista_personas) {
                String[] data = {Integer.toString(p.getId()), Integer.toString(p.getDocumento()),p.getNombre(), p.getApellido(),Integer.toString(p.getEdad()),p.getFecha(),Integer.toString(p.getPuntaje())};
                 table_model_personas.addRow(data);
            }
        
    }     
     /*actualiza los datos de la base de datos mayores en la tabla */
    public void refreshTableModel3() {
        
            ArrayList<Persona> lista_personas = Repositorio3.obtenerTodos();
            while (table_model_personas.getRowCount() > 0) {
                table_model_personas.removeRow(0);
            }
            for (Persona p : lista_personas) {
                String[] data = {Integer.toString(p.getId()), Integer.toString(p.getDocumento()),p.getNombre(), p.getApellido(),Integer.toString(p.getEdad()),p.getFecha(),Integer.toString(p.getPuntaje())};
                 table_model_personas.addRow(data);
            }
        
    }
     /*actualiza los datos de la base de datos  en la tabla de historial*/
    public void refreshTableModel4() {
        
            ArrayList<Puntajes> lista_puntajes = Repositorio.obtenerTodos1();
            while (table_model_personas.getRowCount() > 0) {
                table_model_personas.removeRow(0);
            }
            for (Puntajes p : lista_puntajes) {
                String[] data = {p.getCategoria(),p.getNombre(), p.getApellido(),Integer.toString(p.getEdad()),Integer.toString(p.getPuntaje())};
                 table_model_personas.addRow(data);
            }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Documento");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Edad");

        jLabel5.setText("Fecha Nacimiento");

        jTextField5.setText("Dia");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField6.setText("Mes");

        jTextField7.setText("Año");

        jButton2.setText("JUGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(33, 33, 33)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int i=0;
        try{
        if (jTextField1.getText().isEmpty() ||//valida que los campos no esten vacios
            jTextField2.getText().isEmpty() ||
            jTextField3.getText().isEmpty() || 
            jTextField4.getText().isEmpty() ||
            jTextField6.getText().isEmpty() ||
            jTextField7.getText().isEmpty() ||
            jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor diligencie todo el formulario", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            switch (evt.getActionCommand()) {
                case "Registrar":
                    String fecha=jTextField5.getText()+"-"+jTextField6.getText()+"-"+jTextField7.getText();
                    int dia= Integer.parseInt(jTextField5.getText());
                    int año=Integer.parseInt(jTextField7.getText());
                    if(dia<1||dia>31){//validaciones
                        JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Bien", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        if(año<0){
                            JOptionPane.showMessageDialog(this, "Fecha incorrecta", "Bien", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            edad=Integer.parseInt(jTextField4.getText());
                            if(edad>=5&&edad<=15){
                                persona = Persona.crear(0, Integer.parseInt(jTextField1.getText()), jTextField2.getText(), jTextField3.getText(), Integer.parseInt( jTextField4.getText()),fecha,0);
                                Repositorio.crear(persona);
                                JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
                                i++;
                            }
                            if(edad>=16&&edad<=24){
                                persona = Persona.crear(0, Integer.parseInt(jTextField1.getText()), jTextField2.getText(), jTextField3.getText(), Integer.parseInt( jTextField4.getText()),fecha,0);
                                Repositorio2.crear(persona);
                                JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
                                i++;
                            }
                            if(edad>=25&&edad<=50){
                                persona = Persona.crear(0, Integer.parseInt(jTextField1.getText()), jTextField2.getText(), jTextField3.getText(), Integer.parseInt( jTextField4.getText()),fecha,0);
                                Repositorio3.crear(persona);
                                JOptionPane.showMessageDialog(this, "Persona creada satisfactoriamente", "Bien", JOptionPane.INFORMATION_MESSAGE);
                                i++;
                            }
                             
                        }
                    }
                    jButton2.setVisible(true);
                    break;
            }
            if(i>0){
                this.refreshTableModel();
                this.resetPersona();
            }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    //inicia el juego y actualiza el puntaje
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Snake1 juego=new Snake1(jTextField2.getText());
         int puntaje=juego.getPuntaje();
         persona.setPuntaje(puntaje);
         if(persona.getEdad()<=15){
             Repositorio.editar(persona.getDocumento(), puntaje);
         }
         if(persona.getEdad()<=25&&persona.getEdad()>=16){
             Repositorio2.editar(persona.getDocumento(), puntaje);
         }
         if(persona.getEdad()>25){
             Repositorio3.editar(persona.getDocumento(), puntaje);
         }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //este metodo reinicia los campos de texto del jpanel
    private void resetForm() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        
    }
    
    private void resetPersona() {
        persona.setId(0);
        persona.setDocumento(0);
        persona.setNombre("");
        persona.setFecha("");
        persona.setApellido("");
        persona.setEdad(0);
        popularPersona(persona);
    }
    
    private void popularPersona(Persona persona) {
        jTextField1.setText(String.valueOf(persona.getDocumento()));
         jTextField2.setText(persona.getNombre());
         jTextField3.setText(persona.getApellido());
         jTextField4.setText(String.valueOf(persona.getEdad()));
         jTextField5.setText(persona.getFecha());
        jTextField6.setText(persona.getFecha());
        jTextField7.setText(persona.getFecha());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
