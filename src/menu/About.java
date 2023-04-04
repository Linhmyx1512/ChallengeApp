
package menu;

import model.ModelUser;


public class About extends javax.swing.JPanel {

 
    public About() {
        initComponents();
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(745, 598));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contact me");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 250, -1));

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phone.png"))); // NOI18N
        jLabel4.setText("Phone: 0372188179");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 270, 50));

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/locattion.png"))); // NOI18N
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, 40));

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N
        jLabel5.setText("Mail: linhmyx2003@gmail.com");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 370, 40));

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/website.png"))); // NOI18N
        jLabel6.setText("Website:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 594));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
