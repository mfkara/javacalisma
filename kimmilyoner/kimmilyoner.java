
package calisma;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.SysexMessage;
import javax.swing.*;
import javax.swing.Timer;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class kimmilyoner extends javax.swing.JFrame {

    Random rnd=new Random();
    String sorgu="select * from sorular where idsorular=?";
    public  static Connection con=null;
    Timer tm1=null;
    int i=0;
    int soruid[]=new int[5];
    int sayi,j,soru=0,Ds=0,ys=0;
    String Dcevap;
    public kimmilyoner() throws SQLException {
        initComponents();        
        baglan();
        ButtonGroup bt=new ButtonGroup();
   
        buttonGroup2.add(jRadioButton1);
        buttonGroup2.add(jRadioButton4);
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton2);
        for(int i=0;i<5;i++){
            while(true){
                sayi=rnd.nextInt(5)+1;
                for(j=0;j<5;j++ )
                    if(soruid[j]==sayi)
                        break;
                if(j==5){
                    
                         soruid[i]=sayi;
                        System.out.println(sayi);
                    
                    break;
                }
            }
        }
        
        tm1=new Timer(1000, new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(i==0){
                try {
                    sorugetir(soruid[soru]);
                } catch (SQLException ex) {
                   System.out.println("hata timer");
                }
            }
                jLabel7.setText(String.valueOf(i));
                i++;
                
                if(i==31)
                {
                    tm1.stop();
                    jRadioButton1.setEnabled(false);
                    jRadioButton2.setEnabled(false);
                    jRadioButton3.setEnabled(false);
                    jRadioButton4.setEnabled(false);
                 
                }
            } 
           
        });
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Soru");

        jLabel2.setText("jLabel2");

        jRadioButton1.setText("cevap1");

        jRadioButton2.setText("cevap2");

        jRadioButton3.setText("cevap3");

        jRadioButton4.setText("cevap4");

        jButton1.setText("BAŞLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("İlerle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("süre");

        jLabel5.setText("puan");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tm1.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tm1.stop();
            soru++;
            
        if(jRadioButton1.isSelected())
        {
            if(jRadioButton1.getText().equals(Dcevap))
            {
                Ds++;
            }
            else
                ys++;
        }
        if(jRadioButton2.isSelected())
        {
            if(jRadioButton2.getText().equals(Dcevap))
            {
                Ds++;
            }
            else
                ys++;
        }
        if(jRadioButton3.isSelected())
        {
            if(jRadioButton3.getText().equals(Dcevap))
            {
                Ds++;
            }
            else
                ys++;
        }
        if(jRadioButton4.isSelected())
        {
            if(jRadioButton4.getText().equals(Dcevap))
            {
                Ds++;
            }
            else
                ys++;
        }
        if(soru==5)
            {
                jButton2.setText("sonuc");
                jLabel6.setText(String.valueOf(Ds*5)) ;
                String sorgu2="insert into skor(tarih,puan) values(?,?)";
            try {
                PreparedStatement ps= (PreparedStatement)this.con.prepareStatement(sorgu2);
                ps.setString(1,"13.1.2014");
                ps.setInt(2, Ds*5);
                ps.execute();
            } catch (SQLException ex) {
                System.out.println("hataaaa");
            }
            
            }
        i=0;
        tm1.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kimmilyoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kimmilyoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kimmilyoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kimmilyoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new kimmilyoner().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(kimmilyoner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

   
    public void sorugetir(int a) throws SQLException
    {
       String s;
       PreparedStatement ps3= (PreparedStatement)this.con.prepareStatement(sorgu);
       
       ps3.setString(1, String.valueOf(a));
       ResultSet rs= ps3.executeQuery();     
        while(rs.next()==true)
        {
            jLabel2.setText(rs.getString("soru"));
            jRadioButton1.setText(rs.getString("cevap1"));
            jRadioButton2.setText(rs.getString("cevap2"));
            jRadioButton3.setText(rs.getString("cevap3"));
            jRadioButton4.setText(rs.getString("cevap4"));
           
            Dcevap=rs.getString("Dcevap");
        }
        
    }
     static public   Boolean  baglan()
   {
       try
       {
             //mysqlin jdbc kütüphanesi içinde bulunan driver sınıfını kullanarak bağlantı yapacağım
             Class.forName("com.mysql.jdbc.Driver").newInstance();
           //con nesnesine mysqle bağlanacağı bilgileri veriyorum
        con= (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/okul","root","553198");
           	return true;
      	 } catch (Exception ex)
       	{
           System.out.println("Hata");
           return false;
       	}
   }
    
}
