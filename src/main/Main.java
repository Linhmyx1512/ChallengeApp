package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelUser;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(0, 0, 0, 0));
        
        collection.setVisible(true);
        profile.setVisible(false);
        setting.setVisible(false);
        about.setVisible(false);
        collection.setProfile(profile);
        collection.setSetting(setting);
        menu.setSetting(setting);
        menu.addEventCollection(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSelection();
                collection.setVisible(true);
            }
        });
        
      
        menu.addEventProfile(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSelection();
                profile.setVisible(true);
                profile.showInfor(collection);
            }
        });
        
        menu.addEventSetting(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSelection();
                setting.setVisible(true);
            }
        });
        
        menu.addEventAbout(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSelection();
                about.setVisible(true);
            }
        });                
    }
    
    private void resetSelection() {
        collection.setVisible(false);
        profile.setVisible(false);
        about.setVisible(false);
        setting.setVisible(false);
    }
    
    public void setData(ModelUser data) {
        menu.setData(data);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new menu.Menu();
        collection = new menu.Collection();
        profile = new menu.Profile();
        about = new menu.About();
        setting = new menu.Setting();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        collection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        collection.setPreferredSize(new java.awt.Dimension(745, 598));
        getContentPane().add(collection, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 790, 590));
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 790, 590));
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 790, 590));
        getContentPane().add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 790, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private menu.About about;
    private menu.Collection collection;
    private menu.Menu menu;
    private menu.Profile profile;
    private menu.Setting setting;
    // End of variables declaration//GEN-END:variables
}
