package JF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main3 extends JPanel implements KeyListener, MouseListener {
    public Main3(){
        addKeyListener(this);
        addMouseListener(this);

    }
    @Override
    public void paintComponent(Graphics g){
        requestFocusInWindow();
    }


    public static void main(String[] args) {
        JFrame window = new  JFrame();
        window.setSize(250,250);
        window.setContentPane(new Main3());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getExtendedKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + "," +e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
