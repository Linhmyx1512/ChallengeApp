package menu;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Setting extends javax.swing.JPanel {

    private Clip clip;
    private Clip music;
    public boolean isMusic = true;
    public boolean isSound = true;
    private File soundClick, musicClick;
    private long clipTime;

    public Setting() {
        initComponents();
        try {
            musicClick = new File("D:\\Study\\Code\\JAVA\\ChallengeApp\\src\\demo.wav");
            soundClick = new File("D:\\Study\\Code\\JAVA\\ChallengeApp\\src\\bubble.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundClick);
            AudioInputStream musicIn = AudioSystem.getAudioInputStream(musicClick);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            music = AudioSystem.getClip();
            music.open(musicIn);
            music.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void soundStart() {
        if (isSound == true) {
            clip.setFramePosition(0);
            clip.start();
        }
    }

    private void setOff(JButton b) {
        b.setIcon(new ImageIcon(getClass().getResource("/icon/off.png")));
    }

    private void setOn(JButton b) {
        b.setIcon(new ImageIcon(getClass().getResource("/icon/on.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        turnMusic = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        turnSound = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(745, 598));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("MUSIC:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, 60));

        turnMusic.setBackground(new java.awt.Color(0, 212, 65));
        turnMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/on.png"))); // NOI18N
        turnMusic.setFocusPainted(false);
        turnMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnMusicActionPerformed(evt);
            }
        });
        add(turnMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 100, 50));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("SOUND:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        turnSound.setBackground(new java.awt.Color(0, 212, 65));
        turnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/on.png"))); // NOI18N
        turnSound.setFocusPainted(false);
        turnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnSoundActionPerformed(evt);
            }
        });
        add(turnSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bkV.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 612));
    }// </editor-fold>//GEN-END:initComponents

    private void turnMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnMusicActionPerformed
        soundStart();
        if (isMusic == true) {
            isMusic = false;
            clipTime = music.getMicrosecondPosition();
            setOff(turnMusic);
            music.stop();
        } else {
            isMusic = true;
            music.setMicrosecondPosition(clipTime);
            music.start();
            setOn(turnMusic);
        }
    }//GEN-LAST:event_turnMusicActionPerformed

    private void turnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnSoundActionPerformed
        soundStart();
        if (isSound == true) {
            isSound = false;
            setOff(turnSound);
        } else {
            isSound = true;
            setOn(turnSound);
        }

    }//GEN-LAST:event_turnSoundActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton turnMusic;
    private javax.swing.JButton turnSound;
    // End of variables declaration//GEN-END:variables
}
