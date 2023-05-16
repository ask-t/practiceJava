import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {
    float strip;
    int row;
    int column;
    public LoopLab(){
        // get basic information for the flag
        while(strip<1 || row<1 || column<1 ) {
            String input1 = JOptionPane.showInputDialog("How many stripes?");
            String input2 = JOptionPane.showInputDialog("How many rows of stars?");
            String input3 = JOptionPane.showInputDialog("How many columns of stars?");
            try {
                strip = Integer.parseInt(input1);
                row = Integer.parseInt(input2);
                column = Integer.parseInt(input3);
            }catch(Exception e){
                continue;
            }
        }

    }
    @Override
    public void paintComponent(Graphics g) {
        // strip
        int w = getWidth();
        int h = getHeight() / Math.round(strip);
        int x = 0;
        int y = 0;
        for (int i = 0; i < Math.round(strip/2); i++) {
            g.setColor(Color.red);
            g.fillRect(x, y, w, h);
            y += h;
            g.setColor(Color.white);
            g.fillRect(x, y, w, h);
            y += h;

        }
        // blue box
        w = getWidth() * 2/5;
        h = getHeight() / Math.round(strip) * 7;
        x = 0;
        y = 0;

        g.setColor(Color.blue);
        g.fillRect(x, y, w, h);

        //stars
        for (int i = 0; i<row; i++) {
            x =0;
            for(int j=0;j<column;j++) {
                g.setColor(Color.white);
                g.fillOval(x, y, w /column, h/row);
                x += w/column;
            }
            y += h/row;
        }

    }

    public static void main(String[]args){
        JFrame window = new JFrame();
        window.setSize(600,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }
}
