// Asuku Takahashi CIS202
import javax.swing.*;
import java.awt.*;

public class ConditionLab extends JPanel {
    // make Field variables.
    int age;
    String gender;

    // define each image files' locations.
    ImageIcon rockchapel = new ImageIcon("./image/rockchapel.jpg");
    ImageIcon beehive = new ImageIcon("./image/beehive.gif");
    ImageIcon miamaid = new ImageIcon("./image/miamaid.gif");
    ImageIcon laurel = new ImageIcon("./image/laurel.gif");
    ImageIcon RS = new ImageIcon("./image/RS.jpg");
    ImageIcon deacon = new ImageIcon("./image/deacon.jpg");
    ImageIcon teacher = new ImageIcon("./image/teacher.jpg");
    ImageIcon priest = new ImageIcon("./image/priest.jpg");
    ImageIcon elders = new ImageIcon("./image/elders.jpg");

    public ConditionLab() { // constructor
        // ask people how old and what gender you are.
        String input = JOptionPane.showInputDialog("Please enter your age");
        String[] choices = { "M","F" };
        String input2 = (String) JOptionPane.showInputDialog(null,"Please enter your gender","Gender",JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);

        // exchange letters to lowercase
        gender = input2.toLowerCase();
        // exchange string to integer
        age = Integer.parseInt(input);

    }

    @Override
    public void paintComponent(Graphics g){
        // decide which class they are in
        if (0 < age && age <= 119) {
            if (0 < age && age < 12) {
                g.drawString("You go to Primary!", 10, 10);
                rockchapel.paintIcon(null, g, 10, 30);
            } else if (age == 12 || age == 13) {
                if (gender.equals("f")) {
                    g.drawString("You belong to the Young Women 12–13 class. ", 10, 10);
                    beehive.paintIcon(null, g, 10, 30);
                } else if (gender.equals("m")) {
                    g.drawString("You belong to the Deacons quorum.", 10, 10);
                    deacon.paintIcon(null, g, 10, 30);
                }
            } else if (age == 14 || age == 15) {
                if (gender.equals("f")) {
                    g.drawString("You belong to the Young Women 14–15 class", 10, 10);
                    miamaid.paintIcon(null, g, 10, 30);
                } else if (gender.equals("m")) {
                    g.drawString("You belong to the Teachers quorum.", 10, 10);
                    teacher.paintIcon(null, g, 10, 30);
                }
            } else if (age == 16 || age == 17) {
                if (gender.equals("f")) {
                    g.drawString("You belong to the Young Women 16–17 class.", 10, 10);
                    laurel.paintIcon(null, g, 10, 30);
                } else if (gender.equals("m")) {
                    g.drawString("You belong to the Priests quorum.", 10, 10);
                    priest.paintIcon(null, g, 10, 30);
                }
            } else if (18 <= age && age <= 119) {
                if (gender.equals("f")) {
                    g.drawString("You are a member of the Relief Society.", 10, 10);
                    RS.paintIcon(null, g, 10, 30);
                } else if (gender.equals("m")) {
                    g.drawString("You belong to the Elders quorum.", 10, 10);
                    elders.paintIcon(null, g, 10, 30);
                }
            }
        }
        else {
            g.drawString("Are you sure you typed those correctly? ", 10, 10);
        }
    }

    public static void main(String[] args){
        // setting of JFrame
        JFrame window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new ConditionLab());
        window.setVisible(true);
    }
}
