import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ArraysLab extends JPanel {

    //initialize array
    int[][] array = new int[200][200];

    public ArraysLab(){
        //set file path
        String filename = "./src/kanji.txt";
//        String filename = "./src/coordinates.txt";
//        String filename = "./src/smiley.txt";


        try {
            // Creates a new File instance by converting the given pathname string into an abstract pathname.
            File f = new File(filename);
            // The Scanner class is used to get user input, and it is found in the java.util package.
            Scanner s = new Scanner(f);
            // set all value of index to 0
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = 0;
                }
            }
            // fetch the index number from txt file and change value to 1
            while (s.hasNext() == true) {
                int x = s.nextInt();
                int y = s.nextInt();
                // make big star
                for(int i=0; i<4; i++){
                    array[x+i][y] = 1;
                    array[x-i][y] = 1;
                    array[x][y+i] = 1;
                    array[x][y-i] = 1;
                    array[x-i][y-i] = 1;
                    array[x+i][y-i] = 1;
                    array[x-i][y+i] = 1;
                    array[x+i][y+i] = 1;

                }

            }
            // stop scanner
            s.close();
        }catch (FileNotFoundException e){
            System.out.println("Could not find" +filename);
        }

    }

    @Override
    public void paintComponent(Graphics g){
        // set default color
        int r = 10;
        int gr = 105;
        int b = 159;
        int a = 255;

        // make gradation
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] == 0) {
                    // set the goal color that you want
                    if(r>144){
                        r = 144;
                    }
                    if (gr>218){
                        gr =218;
                    }
                    if(b>231){
                        b = 231;
                    }
                    g.setColor(new Color(r,gr,b));
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(j, i, 1, 1);

            }
            r+=1;
            gr+=1;
            b+=1;
        }



    }
    public static void main(String[]args){
        // initialize JFrame
        JFrame window = new JFrame();
        window.setSize(200,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new ArraysLab());
        window.setVisible(true);
    }
}

