import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo extends JPanel implements ActionListener
{
    Timer timer = new Timer(1000,this);
    int seconds = 0;

    public GraphicsDemo (){
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        seconds++;
        System.out.println(seconds+" seconds have passed.");

        if (seconds == 10){
            timer.stop();
            System.out.println("Times up");
        }
    }
}
