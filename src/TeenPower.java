import javax.swing.*;
import java.awt.*;

public class TeenPower extends JPanel {
    int age; //This is a field
    public TeenPower(){
        String input = JOptionPane.showInputDialog("Please enter your age.");
        age = Integer.parseInt(input);


    }
    @Override
    public void paintComponent(Graphics g){
        if (age>13 && age<20){
            g.drawString("TEEN POWER!",10,10);
        }
        else {
            g.drawString("No teen power for you",10,10);
        }
    }

    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new TeenPower());
        window.setVisible(true);

    }


}
