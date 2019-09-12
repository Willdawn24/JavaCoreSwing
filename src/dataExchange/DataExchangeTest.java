package dataExchange;

import javax.swing.*;
import java.awt.*;

public class DataExchangeTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            JFrame frame = new DataExchangeFrame();
            frame.setTitle("DataExchangeTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
