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

        JPanel textEntering = new JPanel(new BorderLayout());
        JTextField textField = new JTextField(10);
        JButton enterButton = new JButton("Enter");
        textEntering.add(textField, BorderLayout.CENTER);
        textEntering.add(enterButton, BorderLayout.EAST);
        JTextArea content = new JTextArea();
        JScrollPane scrollContent = new JScrollPane(content);
        add(scrollContent, BorderLayout.CENTER);
        add(textEntering, BorderLayout.SOUTH);



        setVisible(true);
    }
}
