import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.security.cert.CertPath;

public class GraphicLab extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        // sky
        g.setColor(new Color(20,150,200));
        g.fillRect(0,0,400,400);
        //cloud
        g.setColor(new Color(186,231,248));
        g.fillRect(0,200,400,300);
        g.fillOval(-50,100,200,200);
        g.fillOval(100,100,200,200);
        g.fillOval(250,100,150,150);

        //beach
        g.setColor(new Color(255,242,0));
        g.fillRect(0,270,400,100);

        //sea
        g.setColor(Color.blue);
        g.fillOval(-350,300,1100,800);


        int dx = 0;

        //hut
        g.setColor(Color.BLACK);
        g.fillRect(100,180-dx,100,100);
        //roof
        g.setColor(Color.gray);
        g.fillRect(80,180-dx,140,20);
        g.fillRect(100,160-dx,100,20);
        g.fillRect(115,140-dx,70,20);
        //door
        g.setColor(Color.white);
        g.fillRect(140,230-dx,25,50);
        //window
        g.fillRect(110,220-dx,20,20);


    }
    public static void main(String[] args){
        var window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new GraphicLab());
        window.setVisible(true);
    }
}
