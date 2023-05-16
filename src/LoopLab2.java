import javax.swing.*;
import java.awt.*;

public class LoopLab2 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        // line
        int w = getWidth();
        int h = getHeight();
        int x = 0;
        int y = 0;

        g.setColor(Color.white);
        g.fillRect(x, y, w, h);

        // red circle
        x = getWidth()/3;
        y = getHeight()/4;

        g.setColor(Color.red);
        g.fillOval(x,y,w/3,w/3);

    }

    public static void main(String[]args){
        JFrame window = new JFrame();
        window.setSize(600,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new LoopLab2());
        window.setVisible(true);
    }
}

