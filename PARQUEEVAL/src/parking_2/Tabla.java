
package parking_2;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.time.LocalTime;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document; 
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;



public class Tabla extends javax.swing.JFrame {
    int i = 1;
    DefaultTableModel model = new DefaultTableModel(); 
    
  
    List <Persona> personas = new LinkedList<>();
    String nombre;
    String cedula;
    String placa; 
    String time;
    String tipoVehiculo;
    
    DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
    public Tabla() {  
        initComponents();
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Cedula");
        model.addColumn("Placa");
        model.addColumn("Hora");
        model.addColumn("Tipo");
        
        jTable1.setModel(model);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(1700, 900));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 1300, 760));

        jLabel7.setBackground(new java.awt.Color(255, 153, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingresar");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 270, 50));

        jLabel8.setBackground(new java.awt.Color(255, 153, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Generar Recibo");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 270, 50));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel5.setText("Otro: $20/Min");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 270, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel6.setText("Moto: $30/Min");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, 50));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel4.setText("Tabla De Vehiculos");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 490, 50));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel9.setText("Carro: $60/Min");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 290, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel4.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void recibo()
    {
        int cantidadPago; 
        String hora = LocalTime.now().format(f);
        int horaActual = LocalTime.now().getHour();
        int minutoActual = LocalTime.now().getMinute();
        boolean continua = false;
        int minutoPagar;
      
        File file = new File("src/assets/recibo.pdf");
        String fileName = file.getAbsolutePath();
        int index;
        Salida salida = new Salida(this, true);            
        
                    

                index = salida.id;
         
                if (index!= -1) {
                    if (horaActual != personas.get(index).getHour()) {
                        minutoPagar = horaActual - personas.get(index).getHour();
                        minutoPagar += personas.get(index).getMinute();       
                    }
                    else{
                        minutoPagar = minutoActual - personas.get(index).getMinute();
                    }
            
                    if (personas.get(index).getTipoVehiculo().equals("Carro")) {
                        cantidadPago = 80;
                    }
                    else if (personas.get(index).getTipoVehiculo().equals("Moto")){
                        cantidadPago = 40;
                    }
                    else{
                        cantidadPago = 30;
                    }

            try {
                
                Document document = new Document(PageSize.A5);
                
                    PdfWriter.getInstance(document, new FileOutputStream(fileName));
                    document.open();
                    Paragraph para1 = new Paragraph("Recibo Parqueadero");
                    Paragraph para2 = new Paragraph("Nombre del Propietario: " + personas.get(index).getNombre()); 
                    Paragraph para3 = new Paragraph("Cedula propietario: "+ personas.get(index).getCedula());
                    Paragraph para4 = new Paragraph("Placa: "+ personas.get(index).placa); 
                    Paragraph para5 = new Paragraph("Hora de ingreso: "+ personas.get(index).getHour()+ ":" + personas.get(index).getMinute()); 
                    Paragraph para6 = new Paragraph("Hora de salida: "+ horaActual+ ":"+ minutoActual); 
                    Paragraph para7 = new Paragraph("Tiempo en parqueadero: "+ minutoPagar+ " Minutos");
                    Paragraph para8 = new Paragraph("Total a pagar: $" +minutoPagar * cantidadPago+ " Pesos");
                            
                    document.add(para1);
                    document.add(para2); 
                    document.add(para3);
                    document.add(para4);
                    document.add(para5); 
                    document.add(para6); 
                    document.add(para7);
                    document.add(para8);
                    document.close();
                    continua = true;
                    jTable1.setRowSelectionInterval(index, index);
                    int selected = jTable1.getSelectedRow();
                    model.removeRow(selected);
                    jTable1.setModel(model);
                    
                    JOptionPane.showMessageDialog(this, "TOTAL PAGAR: "+ minutoPagar *cantidadPago);
                    personas.remove(index);
                    
                     try {
                       FileWriter writer = new FileWriter("src/assets/registrosSalidas.txt",true);
                       writer.write("\nNombre: "+ nombre+ " Cedula: " + cedula + " placa: " + placa + " Tipo de vehiculo: "+ tipoVehiculo + " Hora de entrada: "
                                     + time + " Hora de salida "+ hora + " Total pago:  "+ (minutoPagar *cantidadPago) );   
                       writer.close();
                    } catch (Exception e) {

                    }
                    
   
            } catch (Exception e) {
                
            }

            }
                else{
                    JOptionPane.showMessageDialog(this, "Ingrese un ID valido", "ID NO VALIDO", JOptionPane.ERROR_MESSAGE);
                }
        try {
                if ((new File(fileName).exists()) && continua == true) {

                        Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ fileName);
                        p.waitFor(); 
                }
                else{
                        System.out.println("file doesnt exist");
                }

        } catch (Exception e) {
             JOptionPane.showMessageDialog(this,"Ocurrio un error al intentar ejecutar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
             
        Entrada entrada = new Entrada(this, true);
        entrada.setVisible(true);
        
        if (entrada.getRootPane() != null) {
                
                nombre = entrada.nombre;
                cedula = entrada.cedula;
                placa = entrada.placa;
                tipoVehiculo = entrada.tipo;
            String[] datos = new String[6];
            datos[0] = i+"";
            datos[1] = nombre;
            datos[2]= cedula;
            datos[3]= placa;
                time = LocalTime.now().format(f);
                int hora = LocalTime.now().getHour();
                int minuto = LocalTime.now().getMinute();
            datos[4] = time;
            datos[5]= tipoVehiculo;
                
                Persona persona;
                persona = new Persona(i, nombre, cedula, placa, LocalDate.now(), hora, minuto, tipoVehiculo);
                personas.add(persona);
                i++; 
        
                    File file = new File("src/assets/id.pdf");
                    String fileName = file.getAbsolutePath(); 
        
                    try {
                        
                        Document document = new Document(PageSize.A5);
                        PdfWriter.getInstance(document, new FileOutputStream(fileName));

                        document.open();
                        Paragraph para1 = new Paragraph("ID: " + (i - 1));
                        Paragraph para2 = new Paragraph("Nombre del Propietario: " + nombre); 
                        Paragraph para3 = new Paragraph("Cedula propietario: "+ cedula);
                        Paragraph para4 = new Paragraph("Placa: "+ placa); 
                        Paragraph para5 = new Paragraph("Hora de ingreso: "+ time); 

                        document.add(para1);
                        document.add(para2); 
                        document.add(para3);
                        document.add(para4);
                        document.add(para5); 
                        document.close();
                        JOptionPane.showMessageDialog(this, "Se Registro correctamente", "Registro", JOptionPane.INFORMATION_MESSAGE);

                        
                    } catch (Exception e1) {
                        JOptionPane.showMessageDialog(this, "Error al crear el PDF", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                   
                    try {
                       FileWriter writer = new FileWriter("src/assets/registros.txt",true);
                       writer.write("\nNombre: "+ nombre+ " Cedula: " + cedula + " placa: " + placa + " Tipo de vehiculo: "+ tipoVehiculo + " Hora de entrada: "+ time);   
                       writer.close();
                    } catch (Exception e) {

                    }
                    try {
                        if ((new File(fileName).exists())) {
                
                            Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ fileName);
                            p.waitFor(); 
                        }else{
                            System.out.println("file doesnt exist");
                        }
            
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this,"Ocurrio un error al intentar ejecutar el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }          
           
            model.addRow(datos);
            jTable1.setModel(model);
           
        }
        
        
        

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         Salida salida = new Salida(this,true);
            salida.setVisible(true);
        
            if (salida.getRootPane()!= null) {
                recibo();
            }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
         jLabel8.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
         jLabel8.setBackground(new Color(255,153,51));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8KeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
