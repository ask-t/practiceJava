import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ArraysLab extends JPanel {
    public ArraysLab(){
        String filename = "coordinates.txt";
        File f = new File(filename);
        try {
            Scanner s = new Scanner(f);
            while (s.hasNext() == true) {
                int num = s.nextInt();
                System.out.println("Found a number!" + num);
            }
            s.close();
        }catch (FileNotFoundException e){
            System.out.println("Could not find" +filename);
        }
    }

    @Override
    public void paintComponent(Graphics g){

    }
    public static void main(String[]args){
        JFrame window = new JFrame();
        window.setSize(200,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new ArraysLab());
        window.setVisible(true);
    }
}
