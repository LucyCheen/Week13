import JF.Main3;

import javax.swing.*;
import java.awt.*;

public class MainSheep extends JPanel {
    Sheep s;
    public MainSheep(){
        s = new Sheep(30,30);
    }
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        s.drawSheep(g);
        requestFocusInWindow();
    }
    public static void main(String[] args) {
        //Sheep s = new Sheep(10,20);
        //System.out.println(s);

        JFrame window = new  JFrame();
        window.setSize(250,250);
        window.setContentPane(new Main3());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }


}
