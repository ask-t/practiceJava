import javax.swing.*;
import java.awt.*;

public class WhileLoop extends JPanel {
    ImageIcon duck;
    public WhileLoop(){
        duck = new ImageIcon("./image/duck.png");
    }

    @Override
    public void paintComponent(Graphics g){
        int x = 0;
        int y = 0;
        int w = getWidth();
        while (x<w){
            duck.paintIcon(null,g,x,y);
            x += 60;

        }

    }
    public static void main(String[]args){
        var window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new WhileLoop());
        window.setVisible(true);
    }

}
