package menu;

import java.awt.Color;
import model.Challenge;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.util.Random;
import java.util.Date;

public class Collection extends javax.swing.JPanel {

    private Timer timer;
    private int count = 0;
    private Setting s;

    private boolean isReset = false;
    private boolean isDone = false;
    private boolean isDraw = true;
    public int totalChallenge = 0;
    public int doneChallange = 0;

    public String nameData = "";
    public String dateData = "";
    public String statusData = "";
    public Profile p;

    public void setSetting(Setting x) {
        s = x;
    }
    private List<Challenge> challenges = new ArrayList<>();

    public Collection() {
        initComponents();
        initChallenge();
        btnDraw.setFocusPainted(false);
        btnDone.setFocusPainted(false);
        btnDone.setFocusPainted(false);
        btnReset.setFocusPainted(false);

        CongratulationOff();

        resetButton();
    }

    public void setProfile(Profile x) {
        p = x;
    }

    public void drawCard() {
        Image icon = new ImageIcon(getClass().getResource("/icon/spinCard.gif")).getImage().getScaledInstance(300, 430, Image.SCALE_DEFAULT);
        imageCard.setIcon(new ImageIcon(icon));
    }

    private void initChallenge() {
        challenges.add(new Challenge("Drink Water", new ImageIcon(getClass().getResource("/icon/challenge/Drink water.png"))));
        challenges.add(new Challenge("Eat breakfast in the morning", new ImageIcon(getClass().getResource("/icon/challenge/Eat breakfast in the morning.png"))));
        challenges.add(new Challenge("Limited social media", new ImageIcon(getClass().getResource("/icon/challenge/Limited social media.png"))));
        challenges.add(new Challenge("Limited social media", new ImageIcon(getClass().getResource("/icon/challenge/Daily workout.png"))));
        challenges.add(new Challenge("Limited social media", new ImageIcon(getClass().getResource("/icon/challenge/Enjoy the meal without using phone.png"))));
        challenges.add(new Challenge("Limited social media", new ImageIcon(getClass().getResource("/icon/challenge/Smile.png"))));
        challenges.add(new Challenge("Limited social media", new ImageIcon(getClass().getResource("/icon/challenge/Tidy up.png"))));

    }

    private void CongratulationOff() {
        fireWork.setVisible(false);
        fireWork1.setVisible(false);
        heartBalloon.setVisible(false);
        heartBalloon1.setVisible(false);
        confetti.setVisible(false);
        confetti1.setVisible(false);
    }

    private void CongratulationOn() {
        fireWork.setVisible(true);
        fireWork1.setVisible(true);
        heartBalloon.setVisible(true);
        heartBalloon1.setVisible(true);
        confetti.setVisible(true);
        confetti1.setVisible(true);
    }

    private void randomChallenge() {
        Random ran = new Random();
        int result = ran.nextInt(8);
        nameData = challenges.get(result).getChallengeName();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        dateData = dateFormat.format(currentDate);
        imageCard.setIcon(challenges.get(result).getCard());
    }

    
   
    
    public void resetButton() {
        isDone = false;
        isReset = false;
        isDraw = true;

        btnDraw.setBackground(new Color(204, 255, 255));
        btnDone.setBackground(new Color(204, 204, 204));
        btnReset.setBackground(new Color(204, 204, 204));

        imageCard.setIcon(new ImageIcon(getClass().getResource("/icon/frame.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDraw = new javax.swing.JButton();
        imageCard = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        fireWork = new javax.swing.JLabel();
        fireWork1 = new javax.swing.JLabel();
        confetti = new javax.swing.JLabel();
        confetti1 = new javax.swing.JLabel();
        heartBalloon1 = new javax.swing.JLabel();
        heartBalloon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDraw.setBackground(new java.awt.Color(204, 255, 255));
        btnDraw.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btnDraw.setForeground(new java.awt.Color(204, 51, 0));
        btnDraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/draw.png"))); // NOI18N
        btnDraw.setText("  Draw");
        btnDraw.setToolTipText("");
        btnDraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153), 2));
        btnDraw.setFocusPainted(false);
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });
        add(btnDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 514, 150, 50));

        imageCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/frame.png"))); // NOI18N
        imageCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageCard.setInheritsPopupMenu(false);
        imageCard.setPreferredSize(new java.awt.Dimension(300, 450));
        add(imageCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 38, -1, -1));

        btnDone.setBackground(new java.awt.Color(153, 255, 153));
        btnDone.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(204, 51, 0));
        btnDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/done.png"))); // NOI18N
        btnDone.setText("Done");
        btnDone.setToolTipText("");
        btnDone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 2));
        btnDone.setFocusPainted(false);
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        add(btnDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 285, 150, 50));

        btnReset.setBackground(new java.awt.Color(255, 204, 204));
        btnReset.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(204, 51, 0));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setToolTipText("");
        btnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 163, 150, 50));

        fireWork.setBackground(new java.awt.Color(204, 255, 255));
        fireWork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/firework.gif"))); // NOI18N
        add(fireWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 69, -1, -1));

        fireWork1.setBackground(new java.awt.Color(204, 255, 255));
        fireWork1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/firework.gif"))); // NOI18N
        add(fireWork1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 69, -1, -1));

        confetti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/confetti.gif"))); // NOI18N
        add(confetti, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 221, -1, -1));

        confetti1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/confetti.gif"))); // NOI18N
        add(confetti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 221, -1, -1));

        heartBalloon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/heart-balloon.gif"))); // NOI18N
        add(heartBalloon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 403, -1, -1));

        heartBalloon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/heart-balloon.gif"))); // NOI18N
        add(heartBalloon, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 403, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blueBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        s.soundStart();
        if (isDraw == true) {   // trạng thái được rút            
            ++totalChallenge;
            // chuyển draw về vô hiệu hóa
            btnDraw.setBackground(new Color(204, 204, 204));
            isDraw = false;            
            // => kích hoạt hiệu ứng ngẫu nhiên
            drawCard();

            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ++count;
                    if (count == 3) {   // đã hiện thẻ
                        timer.stop();

                        randomChallenge();  // => hiện thẻ

                        // Hiện 2 nút chức năng
                        isDone = true;
                        btnDone.setBackground(new Color(153, 255, 153));
                        isReset = true;
                        btnReset.setBackground(new Color(255, 204, 204));

                        count = 0;
                    }
                }
            });
            timer.setInitialDelay(0);
            timer.start();
        }
    }//GEN-LAST:event_btnDrawActionPerformed


    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        s.soundStart();
        if (isDone == true) {
            isDone = false;
            statusData = "Done";
            p.addDataTable(totalChallenge, nameData, dateData, statusData);
            CongratulationOn();
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ++count;
                    if (count == 5) {
                        ++doneChallange;
                        timer.stop();
                        CongratulationOff();
                        resetButton();
                        count = 0;
                    }
                }
            });
            timer.setInitialDelay(0);
            timer.start();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        s.soundStart();
        if (isReset == true) {
            statusData = "Reset";
            p.addDataTable(totalChallenge, nameData, dateData, statusData);
            resetButton();
        }

    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnDraw;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel confetti;
    private javax.swing.JLabel confetti1;
    private javax.swing.JLabel fireWork;
    private javax.swing.JLabel fireWork1;
    private javax.swing.JLabel heartBalloon;
    private javax.swing.JLabel heartBalloon1;
    private javax.swing.JLabel imageCard;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
