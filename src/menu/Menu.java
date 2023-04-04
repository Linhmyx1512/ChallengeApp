package menu;

import model.ModelUser;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class Menu extends javax.swing.JPanel {

    private List<JButton> btns = new ArrayList<>();
    private Setting s;

    public Menu() {
        initComponents();
        setOpaque(true);
        setBackground(Color.WHITE);
        txtUser.setOpaque(true);
        initMenu();
    }

    public void setSetting(Setting x) {
        s = x;
    }

    private void initMenu() {

        btns.add(btnUser);
        btns.add(btnCollection);
        btns.add(btnSetting);
        btns.add(btnAbout);

        for (JButton i : btns) {
            i.setFocusPainted(false);
            i.setBackground(Color.WHITE);
        }
        btnCollection.setBackground(new Color(244, 255, 148));
    }

    public void setData(ModelUser data) {
        txtUser.setText("Welcome, " + data.getUserName());
        imageUser.setImage(data.getProfile());
    }

    public void resetEffect() {
        for (JButton i : btns) {
            i.setBackground(Color.WHITE);
        }
    }

    public void addEventProfile(ActionListener event) {
        btnUser.addActionListener(event);
    }

    public void addEventCollection(ActionListener event) {
        btnCollection.addActionListener(event);
    }

    public void addEventSetting(ActionListener event) {
        btnSetting.addActionListener(event);
    }

    public void addEventAbout(ActionListener event) {
        btnAbout.addActionListener(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageUser = new swingMain.ImageAvatar();
        txtApp = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        btnCollection = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        txtUser = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        imageUser.setBackground(new java.awt.Color(255, 255, 255));
        imageUser.setForeground(new java.awt.Color(255, 255, 255));

        txtApp.setBackground(new java.awt.Color(255, 255, 255));
        txtApp.setFont(new java.awt.Font("Algerian", 1, 20)); // NOI18N
        txtApp.setForeground(new java.awt.Color(255, 102, 0));
        txtApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtApp.setText("Challenge");

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));

        btnUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUser.setForeground(new java.awt.Color(0, 204, 204));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/6.png"))); // NOI18N
        btnUser.setText("  Profile");
        btnUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnCollection.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCollection.setForeground(new java.awt.Color(0, 153, 255));
        btnCollection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4.png"))); // NOI18N
        btnCollection.setText("  Collections");
        btnCollection.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnCollection.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionActionPerformed(evt);
            }
        });

        btnSetting.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(153, 51, 255));
        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting.png"))); // NOI18N
        btnSetting.setText("  Setting");
        btnSetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnAbout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(0, 204, 0));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/about.png"))); // NOI18N
        btnAbout.setText("  About");
        btnAbout.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCollection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtUser.setBackground(new java.awt.Color(255, 204, 204));
        txtUser.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 102, 0));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUser.setText("User Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(imageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        s.soundStart();
        resetEffect();
        btnUser.setBackground(new Color(244, 255, 148));
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionActionPerformed
        s.soundStart();
        resetEffect();
        btnCollection.setBackground(new Color(244, 255, 148));
    }//GEN-LAST:event_btnCollectionActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        s.soundStart();
        resetEffect();
        btnSetting.setBackground(new Color(244, 255, 148));
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        s.soundStart();
        resetEffect();
        btnAbout.setBackground(new Color(244, 255, 148));
    }//GEN-LAST:event_btnAboutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCollection;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnUser;
    private swingMain.ImageAvatar imageUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel txtApp;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
