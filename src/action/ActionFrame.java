package action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    public ActionFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();

        Action yellowAction  = new ColorAction("Yellow", new ImageIcon("youtube.png"), Color.YELLOW);

        buttonPanel.add(new JButton(yellowAction));
        add(buttonPanel);

        InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");

        ActionMap amap = buttonPanel.getActionMap();
        amap.put("panel.yellow", yellowAction);
    }

    class ColorAction extends AbstractAction{
        public ColorAction(String name, Icon icon, Color c) {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Set panel color to"+name.toLowerCase());
            putValue("color",c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color");
            buttonPanel.setBackground(c);
        }
    }
}


