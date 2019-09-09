package plaf;

import javax.swing.*;
import java.awt.*;

public class PlafFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new PlafFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
