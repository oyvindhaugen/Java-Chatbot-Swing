package com.oyvindh.chatbot.com.oyvindh.chatbot;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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
    answerContent = new JTextArea(3,10);
    answerContent.setEditable(false);
    answer = new JScrollPane(answerContent);
    answer.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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

  }

  public void actionPerformed(ActionEvent e) {
    String string = e.getActionCommand();
    if (string.equals("Send")) {
      answerContent.append(input.getText() + "\n");
      input.setText(null);
    }
  }
}

  /*public static void main(String[] args) {
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
}*/
