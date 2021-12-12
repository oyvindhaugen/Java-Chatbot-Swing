package com.oyvindh.chatbot.com.oyvindh.chatbot;

import javax.swing.*;
import java.awt.*;

public class Chat {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(new BorderLayout());
        JTextField text = new JTextField(40);
        JTextField answer = new JTextField(40);
        answer.setEnabled(false);
        JButton send = new JButton("Send");
        panel.add(text, BorderLayout.WEST);
        panel.add(send, BorderLayout.CENTER);
        panel.add(answer, BorderLayout.EAST);
        frame.pack();

    }
}
