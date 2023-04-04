package signIn;

import model.ModelUser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.Path2D;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFileChooser;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import model.ModelUser;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class PanelLoading extends javax.swing.JLayeredPane {

    private final Animator animator;
    private boolean slideLeft;
    private float animate;
    private boolean isMessage;
    private ModelUser data;

    public ModelUser getData() {
        return data;
    }

    public PanelLoading() {
        initComponents();
        cmdCancel.setFocusPainted(false);
        cmdContinue.setFocusPainted(false);
        cmdEdit.setFocusPainted(false);       
        loading.setVisible(true);
        profile.setVisible(false);
        message.setVisible(false);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                if (isMessage) {
                    message.setVisible(true);
                } else {
                    profile.setVisible(true);
                }
            }

            @Override
            public void timingEvent(float fraction) {
                if (isMessage) {
                    message.setAlpha(fraction);
                    loading.setAlpha(1f - fraction);
                } else {
                    profile.setAlpha(fraction);
                    loading.setAlpha(1f - fraction);
                }
                repaint();
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
    }

    public void setAnimate(boolean slideLeft, float animate) {
        this.slideLeft = slideLeft;
        this.animate = animate;
    }

    public void addEventBack(ActionListener event) {
        cmdCancel.addActionListener(event);
        cmdCancel1.addActionListener(event);

        cmdCancel2.addActionListener(event);

    }

    public void addEventContinue(ActionListener event) {
        cmdContinue.addActionListener(event);
    }

    public void doneLogin(ModelUser data) {
        isMessage = false;
        this.data = data;
        pic.setIcon(data.getProfile());
        cmdContinue.setText("Continue with " + data.getUserName());
        animator.start();
    }

    public void showError(String ms) {
        lbMessage.setText(ms);
        isMessage = true;
        animator.start();
    }

    public void reset() {
        loading.setAlpha(1f);
        loading.setVisible(true);
        profile.setVisible(false);
        message.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile = new swingLogin.PanelTransparent();
        cmdCancel1 = new swingLogin.Button();
        pic = new swingLogin.ImageAvatar();
        cmdEdit = new swingLogin.EditButton();
        cmdContinue = new swingLogin.Button();
        loading = new swingLogin.PanelTransparent();
        cmdCancel = new swingLogin.Button();
        jLabel1 = new javax.swing.JLabel();
        message = new swingLogin.PanelTransparent();
        cmdCancel2 = new swingLogin.Button();
        lbMessage = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        cmdCancel1.setBackground(new java.awt.Color(67, 99, 132));
        cmdCancel1.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancel1.setText("Cancel");
        cmdCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancel1ActionPerformed(evt);
            }
        });

        pic.setBackground(new java.awt.Color(67, 99, 132));
        pic.setForeground(new java.awt.Color(186, 186, 186));
        pic.setBorderSize(2);
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        pic.setOpaque(true);
        pic.setPreferredSize(new java.awt.Dimension(150, 150));

        cmdEdit.setBackground(new java.awt.Color(213, 241, 243));
        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picLayout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cmdContinue.setBackground(new java.awt.Color(88, 129, 170));
        cmdContinue.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        cmdContinue.setForeground(new java.awt.Color(255, 255, 255));
        cmdContinue.setText("Continue");
        cmdContinue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cmdContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                        .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                        .addComponent(cmdCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(cmdContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(cmdCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        add(profile, "card2");

        cmdCancel.setBackground(new java.awt.Color(67, 99, 132));
        cmdCancel.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancel.setText("Cancel");
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loading.gif"))); // NOI18N

        javax.swing.GroupLayout loadingLayout = new javax.swing.GroupLayout(loading);
        loading.setLayout(loadingLayout);
        loadingLayout.setHorizontalGroup(
            loadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(loadingLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        loadingLayout.setVerticalGroup(
            loadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadingLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(cmdCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        add(loading, "card2");

        cmdCancel2.setBackground(new java.awt.Color(67, 99, 132));
        cmdCancel2.setForeground(new java.awt.Color(255, 255, 255));
        cmdCancel2.setText("Cancel");
        cmdCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancel2ActionPerformed(evt);
            }
        });

        lbMessage.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbMessage.setForeground(new java.awt.Color(234, 91, 91));
        lbMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMessage.setText("Message");

        javax.swing.GroupLayout messageLayout = new javax.swing.GroupLayout(message);
        message.setLayout(messageLayout);
        messageLayout.setHorizontalGroup(
            messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(cmdCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(messageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        messageLayout.setVerticalGroup(
            messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(cmdCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        add(message, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCancelActionPerformed

    private void cmdCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCancel1ActionPerformed

    private void cmdContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdContinueActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        JFileChooser ch = new JFileChooser();

        int option = ch.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = ch.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            pic.setIcon(icon);   
            data.setProfile(icon);
            repaint();
        }
    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCancel2ActionPerformed

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int width = getWidth();
        int height = getHeight();
        int x = 0;
        int y = 0;
        if (slideLeft) {
            int centerY = height / 2;
            Path2D.Float p = new Path2D.Float();
            p.moveTo(x, y);
            p.lineTo(width, y);
            p.lineTo(width, height);
            p.lineTo(x, height);
            p.curveTo(x, height, easeOutBounce(animate) * width, centerY, x, y);
            g2.fill(p);
        } else {
            g2.fillRect(x, y, width, height);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    private float easeOutBounce(float x) {
        float n1 = 7.5625f;
        float d1 = 2.75f;
        double v;
        if (x < 1 / d1) {
            v = n1 * x * x;
        } else if (x < 2 / d1) {
            v = n1 * (x -= 1.5 / d1) * x + 0.75;
        } else if (x < 2.5 / d1) {
            v = n1 * (x -= 2.25 / d1) * x + 0.9375;
        } else {
            v = n1 * (x -= 2.625 / d1) * x + 0.984375;
        }
        if (slideLeft) {
            return (float) (1f - v);
        } else {
            return (float) v;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swingLogin.Button cmdCancel;
    private swingLogin.Button cmdCancel1;
    private swingLogin.Button cmdCancel2;
    private swingLogin.Button cmdContinue;
    private swingLogin.EditButton cmdEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMessage;
    private swingLogin.PanelTransparent loading;
    private swingLogin.PanelTransparent message;
    private swingLogin.ImageAvatar pic;
    private swingLogin.PanelTransparent profile;
    // End of variables declaration//GEN-END:variables
}
