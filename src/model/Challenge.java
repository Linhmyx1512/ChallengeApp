package model;

import javax.swing.ImageIcon;

public class Challenge {

    static int stt = 0;
    String challengeName;
    ImageIcon card;

    public Challenge(String challengeName, ImageIcon card) {
        this.stt = ++stt;
        this.challengeName = challengeName;
        this.card = card;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getChallengeName() {
        return challengeName;
    }

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    public ImageIcon getCard() {
        return card;
    }

    public void setCard(ImageIcon card) {
        this.card = card;
    }


    
}
