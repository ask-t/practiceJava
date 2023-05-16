import javax.swing.*;
import java.awt.*;
public class ForLoop extends JPanel{
    ImageIcon duck;
    public ForLoop(){
        duck = new ImageIcon("./image/duck.png");
    }

    @Override
    public void paintComponent(Graphics g) {
        int x = 0;
        int y = 0;
        int w = getWidth();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                duck.paintIcon(null, g, x, y);
                x += 60;
            }
            y += 90;
        }
    }
    public static void main(String[]args){
        var window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new ForLoop());
        window.setVisible(true);
    }



}
