package game;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Element.EleButton;
import Element.EleLabel;

public class Menu extends JPanel {

    private static final long serialVersionUID = 1L;
    public long point;

    public Menu() {

    }

    public Menu(long point,ActionListener main) {
        try {
            this.point = point;
            this.setBackground(new Color(167, 199, 231));
            this.setBounds(0,0,1000,600);
            this.setFocusable(true);
            this.setLayout(null);

            EleLabel status = new EleLabel("Nice Try",40,400,100,200,100);
            status.setForeground(Color.white);

            EleLabel showPoint = new EleLabel("Score : "+this.point,30,400,200,200,100);
            showPoint.setForeground(Color.white);

            EleButton restart = new EleButton("restart",15,380,300,200,50);
            restart.addActionListener(main);

            this.add(showPoint);
            this.add(status);
            this.add(restart);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}