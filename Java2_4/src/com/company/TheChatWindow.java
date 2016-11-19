package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nikolaypisarev on 17.11.16.
 */
public class TheChatWindow extends JFrame {
    public TheChatWindow() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        GridLayout down = new GridLayout(2, 1);


        JPanel panelForEntering = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel panelForPrint = new JPanel();
        JTextField fieldForPrint = new JTextField(5);
        panelForEntering.add(fieldForPrint, BorderLayout.CENTER);
        JButton enterText = new JButton("Enter");
        panelForEntering.add(enterText);
        add(panelForEntering,BorderLayout.SOUTH);
        panelForEntering.setBackground(new Color(128, 128, 128));





        add(panelForPrint, BorderLayout.CENTER);
        setVisible(true);
    }
}
