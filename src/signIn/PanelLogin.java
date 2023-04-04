package signIn;

import java.awt.event.ActionListener;

public class PanelLogin extends javax.swing.JPanel {

   
    public PanelLogin() {
        initComponents();
        setOpaque(false);
        cmd.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")

    public boolean checkUser() {
        boolean action = true;
        if (txtUser.getText().trim().equals("") || txtUser.getText().contains(" ")) {
            txtUser.setHelperText("Please input user name valid");
            action = false;
        } else {
            txtUser.setHelperText("");
        }

        if (String.valueOf(txtPass.getPassword()).trim().equals("")) {
            txtPass.setHelperText("Please input password valid");
            action = false;
        } else {
            txtPass.setHelperText("");
        }

        if (action == true) {
            txtUser.setHelperText("");
            txtPass.setHelperText("");

        }
        return action;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new swingLogin.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new swingLogin.PasswordField();
        cmd = new swingLogin.Button();

        txtUser.setLabelText("User Name");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Sign In");

        txtPass.setLabelText("Password");
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        cmd.setBackground(new java.awt.Color(27, 184, 247));
        cmd.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cmd.setForeground(new java.awt.Color(255, 255, 255));
        cmd.setText("Sign In");
        cmd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed
    public void addEventLogin(ActionListener event) {
        cmd.addActionListener(event);
    }

    public String getUserName() {
        return txtUser.getText().trim();
    }

    public String getPassword() {
        return String.valueOf(txtPass.getPassword());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swingLogin.Button cmd;
    private javax.swing.JLabel jLabel1;
    private swingLogin.PasswordField txtPass;
    private swingLogin.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
