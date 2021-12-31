package com.oyvindh.chatbot.com.oyvindh.chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class Chat extends JFrame implements ActionListener {

  static JFrame frame;
  static JButton button;
  static JScrollPane answer;
  static JTextArea input;
  static JTextArea answerContent;

  Chat() {
  }

  public static void main(String[] args) {
    frame = new JFrame("Chatbot");
    button = new JButton("Send");
    button.setLayout(null);
    Chat te = new Chat();
    answerContent = new JTextArea(3, 10);
    answerContent.setEditable(false);
    answer = new JScrollPane(answerContent);
    answer.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    input = new JTextArea();

    button.addActionListener(te);

    input = new JTextArea(1, 8);

    JPanel panel = new JPanel();
    panel.add(input);
    panel.add(button);
    panel.add(answer);
    panel.setBorder(new TitledBorder(new EtchedBorder(), "IM Haugaland Bot"));

    frame.add(panel);
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
  }

  public void actionPerformed(ActionEvent e) {
    String string = e.getActionCommand();
    String inputContent = input.getText();
    String[] chatbot = {"what is your name", "how to", "who are", "how come", "how are" + " you"};
    String answerContentStatus = "Hello! My name is IM Haugaland Bot, what is yours?" + "\n";
    String answerContentStatusNameResponse = "That's a really nice name! Is there anything you're wondering about?";
    String answerContentStatus1 = "I am good thank you, how are you today?" + "\n";
    String answerContentStatus2 = "That's good to hear \n" + "lmao";
    String answerContentError = "Error";
    if (string.equals("Send")) {
      if (inputContent.toLowerCase().contains(chatbot[4].toLowerCase())) {
        // use this: https://www.baeldung.com/string-contains-multiple-words
        // maybe try to make it recognize a certain word at a time and make it check multiple times for multiple words
        // try to implement so it responds with answerContentStatusNameResponse when user replies with their name.
      } else {
        answerContent.append(answerContentError + "\n");
      }
    }
  }
}










/*import javax.swing.*;
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
        send.setBounds(130,100,100,40);
        panel.add(text, BorderLayout.WEST);
        panel.add(send, BorderLayout.CENTER);
        panel.add(answer, BorderLayout.EAST);
        frame.pack();

    }
}*/
