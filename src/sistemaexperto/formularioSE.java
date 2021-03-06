package sistemaexperto;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class formularioSE extends javax.swing.JFrame {

    /**
     * Creates new form formularioSE
     */
    public formularioSE() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(formularioSE.class.getResource("/img/doct.png")));
        initComponents();
        setTitle("Sistema Experto de Diagnostico de Enfermedades");
        setResizable(false);
        this.setLocationRelativeTo(null);
        texto.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(Color.GRAY);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jLabel1.setFont(new Font("Dialog", Font.PLAIN, 20)); // NOI18N
        jLabel1.setText("Bienvenido al Sistema Experto");

        jLabel2.setFont(new java.awt.Font("Freestyle Script", 0, 30)); // NOI18N
        jLabel2.setText("Diagnostico de Enfermedades");

        jLabel4.setIcon(new ImageIcon(formularioSE.class.getResource("/img/buaplogo.png")));
        
        JLabel lblTaniaKarinaCastillo = new JLabel();
        lblTaniaKarinaCastillo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTaniaKarinaCastillo.setText("Tania Karina Castillo Morales");
        lblTaniaKarinaCastillo.setFont(new Font("Freestyle Script", Font.PLAIN, 25));
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(formularioSE.class.getResource("/img/doct.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(54)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblTaniaKarinaCastillo, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addComponent(lblNewLabel_1)
        			.addGap(89))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel2)
        					.addGap(11)
        					.addComponent(lblTaniaKarinaCastillo))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(24)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel_1)
        						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(Color.LIGHT_GRAY);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jButton1.setText("Empezar Examen");
        jButton1.setToolTipText("Click para comenzar el examen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Para comenzar el examen dar clic");

        jLabel3.setText("en el boton Empezar Examen");

        jLabel7.setText("responda todas las preguntas y");

        jLabel8.setText("tendra en diagnostico inmediatamente");

        jButton2.setText("Salir");
        jButton2.setToolTipText("Click para salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        texto = new javax.swing.JTextArea();
        texto.setTabSize(5);
        
                texto.setColumns(20);
                texto.setRows(5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        					.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(jButton2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jButton1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
        			.addGap(62)
        			.addComponent(texto, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
        			.addGap(116))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(17)
        					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel7)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel8)
        					.addGap(18)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addGap(16)
        					.addComponent(texto, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int u,d,t,c,ci,se;
          
        u = JOptionPane.showConfirmDialog(rootPane,"�Usted presenta Escalosfrios?", null, YES_NO_OPTION);     
        if(u == 0){
        	Tuberculosis();
        }
        else if(u == 1){
          d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Dolor de Cabeza?", null, YES_NO_OPTION);  
            if(d == 0){
            	Gripe();
            }
            else if(d==1){
                t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Secrecion Nasal?", null, YES_NO_OPTION);
                    if(t == 0){
                        Rubeola();
                    }
                    else if(t == 1){
                    	c = JOptionPane.showConfirmDialog(rootPane,"�Usted presenta Ictericia?", null, YES_NO_OPTION);     
                        if(c == 0){
                        	Tuberculosis();
                        }
                        else if(c == 1){
                        	ci = JOptionPane.showConfirmDialog(rootPane,"�Usted presenta Diarrea?", null, YES_NO_OPTION);     
                            if(ci == 0){
                            	Tuberculosis();
                            }
                            else if(ci == 1){
                            	se = JOptionPane.showConfirmDialog(rootPane,"�Usted presenta Apatia?", null, YES_NO_OPTION);     
                                if(se == 0){
                                	Tuberculosis();
                                }
                                else if(se == 1){
                        JOptionPane.showMessageDialog(rootPane, "Usted se encuentra bien de salud!!!!", null, YES_NO_OPTION);
                    }
            }
        }
                    }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void Tuberculosis(){
      int u,d,t;
      
      u = JOptionPane.showConfirmDialog(rootPane, "�Usted preseta Fiebre?", null, YES_NO_OPTION);
      d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Cansancio?", null, YES_NO_OPTION);
      t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Tos Seca?", null, YES_NO_OPTION);
      
      if((u==0) && (d==0) && (t==0)){
           String Tb = "----------------------------------------------------\n"
                     + "-********Sistema Experto de diagnostico*************\n"
                     + "----------------------------------------------------\n"
                     + "-*****************DIAGNOSTICO***********************\n"
                     + "----------------------------------------------------\n"
                     + "- lo que usted presenta es TUBERCULOSIS-------------\n"
                     + "--- Usted puede tomar Paracetamol-------------------\n"
                     + "----- Deber� ir con su Medico General---------------\n"
                     + "----------------------------------------------------";
           
           texto.setText(Tb);
      }
      else{
          Gripe();
      }
    }
    
    private void Gripe(){
      int u,d,t,c;  
      
      u = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Tos con Flemas?", null, YES_NO_OPTION);
      d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Cansancio?", null, YES_NO_OPTION);
      t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Fiebre mayor a 39'?", null, YES_NO_OPTION);
      c = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Dolor de Cabeza Constante?", null, YES_NO_OPTION);
           
      if((u==0) && (d==0) && (t==0) && (c==0)){
    	  String gp = "----------------------------------------------------\n"
                  + "-********Sistema Experto de diagnostico*************\n"
                  + "----------------------------------------------------\n"
                  + "-*****************DIAGNOSTICO***********************\n"
                  + "----------------------------------------------------\n"
                  + "- lo que usted presenta es GRIPE--------------------\n"
                  + "--- Usted puede tomar Jarabe / Contrex--------------\n"
                  + "----- Deber� ir con su Otorrinolaring�logo----------\n"
                  + "--- Tambien puede tomar una Vacuna -----------------\n"
                  + "--- Que le puede aplicar su Endocrinologo ---------\n"
                  + "----- Deber� ir con su Medico General --------------\n"
                  + "----------------------------------------------------";
        
        texto.setText(gp);
      }
      else{
    	  Rubeola();
      }
    }
    
    private void Rubeola(){
       int u,d,t,c;
       
       u = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Fiebre?", null, YES_NO_OPTION);
       d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Secreci�n Nasal?", null, YES_NO_OPTION);
       t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Jaquecas?", null, YES_NO_OPTION);
       c = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Escalofrios?", null, YES_NO_OPTION);
              
       if((u==0) && (d==0) && (t==0) && (c==0)){
            String Rb = "----------------------------------------------------\n"
                    + "-********Sistema Experto de diagnostico*************\n"
                    + "----------------------------------------------------\n"
                    + "-*****************DIAGNOSTICO***********************\n"
                    + "----------------------------------------------------\n"
                    + "- lo que usted presenta es RUBEOLA -----------------\n"
                    + "--- Usted puede tomar Paracetamol ------------------\n"
                    + "----- Deber� ir con su Medico General --------------\n"
                    + "--- Y aplicarse una Vacuna -------------------------\n"
                    + "----- Deber� ir con su Endocrinologo ---------------\n"
                    + "----------------------------------------------------";
            
           texto.setText(Rb); 
       }
       else{
    	   Hepatitis();
       }
    }
    
    private void Hepatitis(){
        int u,d,t;
        
        u = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Ictericia?", null, YES_NO_OPTION);
        d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Nauseas Repentinas?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Diarrea Constante?", null, YES_NO_OPTION);
                
        if((u==0) && (d==0) && (t==0)){
             String Hp = "----------------------------------------------------\n"
                     + "-********Sistema Experto de diagnostico*************\n"
                     + "----------------------------------------------------\n"
                     + "-*****************DIAGNOSTICO***********************\n"
                     + "----------------------------------------------------\n"
                     + "- lo que usted presenta es HEPATITIS ---------------\n"
                     + "--- Usted puede tomar Paracetamol ------------------\n"
                     + "----- Deber� ir con su Medico General --------------\n"
                     + "--- y aplicarse una Vacuna -------------------------\n"
                     + "----- Deber� ir con su Endocrinologo ---------------\n"
                     + "----------------------------------------------------";
             
            texto.setText(Hp); 
        }
        else{
            Malaria();
        }
     }
    
    private void Malaria(){
        int u,d,t,c;
        
        u = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Diarrea?", null, YES_NO_OPTION);
        d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Fiebre?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Ictericia?", null, YES_NO_OPTION);
        c = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Escalofrios Constantes?", null, YES_NO_OPTION);
                
        if((u==0) && (d==0) && (t==0) && (c==0)){
             String Ml = "----------------------------------------------------\n"
                     + "-********Sistema Experto de diagnostico*************\n"
                     + "----------------------------------------------------\n"
                     + "-*****************DIAGNOSTICO***********************\n"
                     + "----------------------------------------------------\n"
                     + "- lo que usted presenta es MALARIA -----------------\n"
                     + "--- Usted puede tomar Vacuna -----------------------\n"
                     + "----- Deber� ir con su Medico General --------------\n"
                     + "----- Y con su Endocrinologo -----------------------\n"
                     + "----------------------------------------------------";
             
            texto.setText(Ml); 
        }
        else{
            Anemia();
        }
     }
    
    private void Anemia(){
        int u,d,t;
        
        u = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Apatia?", null, YES_NO_OPTION);
        d = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Nauseas?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "�Usted presenta Cansancio?", null, YES_NO_OPTION);
                
        if((u==0) && (d==0) && (t==0)){
             String An = "--------------------------------------------------\n"
                     + "-********Sistema Experto de diagnostico*************\n"
                     + "----------------------------------------------------\n"
                     + "-*****************DIAGNOSTICO***********************\n"
                     + "----------------------------------------------------\n"
                     + "- lo que usted presenta es Anemia ------------------\n"
                     + "--- Usted puede tomar Vitaminas --------------------\n"
                     + "----- Deber� ir con su Nutriologo ------------------\n"
                     + "----------------------------------------------------";
             
            texto.setText(An); 
        }
        else{
            Tuberculosis();
        }
     }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea texto;
}
