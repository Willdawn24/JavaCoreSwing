package simpleFrame;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame jFrame = new SizedFrame();
            jFrame.setTitle("SizedFrame");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);

            MyComponent myComponent = new MyComponent();
            myComponent.setVisible(true);
            jFrame.getContentPane().add(myComponent);

        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2, screenHeight/2);
        setLocationByPlatform(true);
        pack();
    }
}

class MyComponent extends JComponent{
    public MyComponent() {
        setSize(200, 200);
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        System.out.println("print my component");
    }
}