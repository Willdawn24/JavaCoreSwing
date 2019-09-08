package simpleFrame;

import javax.swing.*;
import java.awt.*;

public class NotHelloWorld {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame jFrame = new NotHelloWorldFrame();
            jFrame.setTitle("NotHelloWorld");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
        });
    }
}

class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame() throws HeadlessException {
        add(new NotHelloWorldComponent());
        pack();
    }
}

class NotHelloWorldComponent extends JComponent{
    public static final int MESSAGE_X=75;
    public static final int MESSAGE_Y=100;

    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    public void paintComponent(Graphics g){
        g.drawString("Not a hello, world program", MESSAGE_X, MESSAGE_Y);
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}