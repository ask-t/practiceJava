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
//        g.fillRect(0,200,400,300);
//        g.fillOval(-50,100,200,200);
//        g.fillOval(100,100,200,200);
//        g.fillOval(250,100,160,150);
        int x = 0;
        int y = 0;
        g.fillOval(30+x,50+y,100,50);
        g.fillOval(50+x,20+y,100,50);
        g.fillOval(80+x,40+y,100,50);

        //cloud2
        x = 200;
        y = 150;
        g.fillOval(30+x,50+y,70,35);
        g.fillOval(50+x,20+y,70,35);
        g.fillOval(80+x,40+y,70,35);
        //cloud3
        x = 0;
        y = 200;
        g.fillOval(30+x,50+y,70,35);
        g.fillOval(50+x,20+y,70,35);
        g.fillOval(80+x,40+y,70,35);


        //beach
        g.setColor(new Color(185,152,115));
        g.fillRect(0,270,400,100);

        //sea
        g.setColor(new Color(106,181,193));
        g.fillOval(-350,300,1100,800);
        g.setColor(new Color(35,186,167));
        g.fillOval(-250,320,880,640);

        y = 0;
        //hut
        g.setColor(new Color(159,96,9));
        g.fillRect(100,180-y,100,100);
        //roof
        g.setColor(Color.gray);
        g.fillRect(80,180-y,140,20);
        g.fillRect(100,160-y,100,20);
        g.fillRect(115,140-y,70,20);
        g.fillRect(135,120-y,30,30);
        //door
        g.setColor(new Color(248,196,124));
        g.fillRect(140,230-y,25,50);
        g.setColor(Color.black);
        g.fillOval(160,255-y,5,5);
        //window
        g.setColor(new Color(106,181,193));
        g.fillRect(110,220-y,20,20);

        //hut's sign
        g.setColor(new Color(159,96,9));
        g.fillRect(230,250,3,30);
        g.fillRect(205,240,55,20);
        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 11));
        g.drawString("Asuku's hut", 205,250);

        //AirPlane+x
        x = -50;
        g.setColor(new Color(192,192,192));
        g.fillOval(290+x,30,10,50);
        g.setColor(Color.white);
        g.fillOval(250+x,50,80,10);
        g.fillOval(318+x,38,10,20);
        g.setColor(Color.black);
        g.fillRect(255+x,53,7,3);
        g.fillRect(270+x,53,3,3);
        g.fillRect(280+x,53,3,3);
        g.fillRect(290+x,53,3,3);
        g.fillRect(300+x,53,3,3);
        //String for AirPlane
        g.setColor(Color.black);
        g.fillRect(330+x,55,15,1);
        //flag
        g.setColor(new Color(200,205,180));
        g.fillRect(345+x,50,100,20);
        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 12));
        g.drawString("GO SEASIDERS", 350+x,65);





    }
    public static void main(String[] args){
        var window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new GraphicLab());
        window.setVisible(true);

    }
}
