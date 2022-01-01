package com.oyvindh.chatbot.com.oyvindh.chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class Chat extends JFrame implements ActionListener {

  static JFrame frame;
  static JButton button;
  static JScrollPane answer;
  static JTextArea input;
  static JTextArea answerContent;
  private static final String[][] NOUNS_FOR_SENTENCES = new String[][]{
      {"learn", "do", "get"},
      {"work", "learn"},
      {"programs", "languages", "language", "is"},
      {"teaches", "attends"}
  };
  private static final String[] VERBS_FOR_SENTENCES = new String[]{"what do you ", "how do you ", "what ",
      "who "};
  private static final String[] ANSWER_CONTENT_STATUS = new String[]{/*[0]*/
      "Hello! My name is IM Haugaland Bot. " + "\n"
          + "The topics I can answer are questions about IM at Haugaland Upper Secondary School."
          + "\n",
      /*[1]*/"You learn about programming, security, hardware and software, and media etc." + "\n",
      /*[2]*/
      "Here at IM we have fun, learning and having a great class environment that is friendly to all. "
          + "\n" + "We start our day at 8 am and end at 3 pm with a never ending smile!"
          + "\n",
      /*[3]*/
      "At IM you get a friendly environment, friends to have for life and a good way into a futuristic work field. "
          + "\n",
      "At IM there is lots of group work to simulate the normal work life in this field. "
          + "\n"
          + "There are some single person tasks, but it's mainly centered around group work. "
          + "\n",
      "Every subject starts with a small theoretical part where you learn what the reason you are learning this and the basics of that thing. "
          + "\n" + "Then you get assigned a few tasks to let you get a little used to it. "
          + "\n"
          + "At the end you get assigned one bigger task that will take some more time and some more work. This way it will be easier to learn. "
          + "\n",
      "At IM you learn about the Adobe Creative Cloud package of programs including Photoshop, Premiere Pro and Illustrator to name a few. "
          + "\n"
          + "You also learn programs such as Visual Studio Code, which is an Integrated Developer Environment for programming. "
          + "\n",
      "You can learn basically any language you want to learn. Be it C++, Python or even Assembly, all of these are possibilities."
          + "\n",
      "You are expected to be a good student and to finish your work, but " + "\n"
          + "as important as that is it's even more important to be a good classmate and a good group worker."
          + "\n",
      "At IM VG1, we have 3 teachers: Åsmund Kringlebotten, Kjartan Haavik and Odd Arne Hemmingstad. "
          + "\n"
          + "At IM VG2, we have Julie Holst Pedersen, who often has help from the teamleader: Rune Karlsen. "
          + "\n"
          + "All of these are amazing teachers, who have a lot of passion for their work."
          + "\n",
      "Everyone can attend at IM Haugaland, even you!" + "\n"
          + "This is an amazing work field to get into and one that will be very prevalent in the future."
          + "\n"
  };

  Chat() {
  }

  public static void main(String[] args) {
    frame = new JFrame("Chatbot");
    button = new JButton("Send");
    button.setLayout(null);
    Chat te = new Chat();
    answerContent = new JTextArea(8, 46);
    answerContent.setEditable(false);
    answer = new JScrollPane(answerContent);
    answer.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    input = new JTextArea(1, 20);

    button.addActionListener(te);

    JPanel panel = new JPanel();
    panel.add(input);
    panel.add(button);
    panel.add(answer);
    panel.setBorder(new TitledBorder(new EtchedBorder(), "IM Haugaland Bot"));

    frame.setLocationRelativeTo(null);
    frame.add(panel);
    frame.setSize(500, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();

    String answerContentStatus = "Hello! My name is IM Haugaland Bot." + "\n"
        + "The topics I can answer are questions about IM at Haugaland Upper Secondary School."
        + "\n";
    answerContent.append(answerContentStatus);
  }

  public void actionPerformed(ActionEvent e) {
    String string = e.getActionCommand();
    String inputContent = input.getText();
    String[] endingsForSentences = {};
    String answerContentError = "I cannot answer that, please try with a different question.";
    if (string.equals("Send")) {
      sendMessage(inputContent, answerContentError);
    }
  }

  private void sendMessage(String inputContent, String answerContentError) {
    if (inputContent.toLowerCase().startsWith(VERBS_FOR_SENTENCES[0].toLowerCase())) {
      // what do you
      String restInput = inputContent.substring(VERBS_FOR_SENTENCES[0].length()).trim();
      if (restInput.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[0][0].toLowerCase())) {
        answerContent.append(ANSWER_CONTENT_STATUS[1]);
        input.setText(null);
      } else if (restInput.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[0][1])) {
        answerContent.append(ANSWER_CONTENT_STATUS[2]);
        input.setText(null);
      } else if (restInput.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[0][2])) {
        answerContent.append(ANSWER_CONTENT_STATUS[3]);
        input.setText(null);
      } else {
        answerContent.append(answerContentError + "\n");
      }
    } else if (inputContent.toLowerCase().startsWith(VERBS_FOR_SENTENCES[1])) {
      // how do you
      String restInput = inputContent.substring(VERBS_FOR_SENTENCES[1].length()).trim();
      if (restInput.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[1][0])) {
        answerContent.append(ANSWER_CONTENT_STATUS[4]);
        input.setText(null);
      } else if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[1][1])) {
        answerContent.append(ANSWER_CONTENT_STATUS[5]);
        input.setText(null);
      }
    } else if (inputContent.toLowerCase().startsWith(VERBS_FOR_SENTENCES[2])) {
      //what
      String restInput = inputContent.substring(VERBS_FOR_SENTENCES[2].length()).trim();
      if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[2][0])) {
        answerContent.append(ANSWER_CONTENT_STATUS[6]);
        input.setText(null);
      } else if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[2][1])) {
        answerContent.append(ANSWER_CONTENT_STATUS[7]);
        input.setText(null);
      } else if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[2][2])) {
        answerContent.append(ANSWER_CONTENT_STATUS[8]);
        input.setText(null);
      } else if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[2][3])) {
        answerContent.append(ANSWER_CONTENT_STATUS[9]);
        input.setText(null);
      } else {
        answerContent.append(answerContentError + "\n");
      }
    } else if (inputContent.toLowerCase().startsWith(VERBS_FOR_SENTENCES[3])) {
      // who
      String restInput = inputContent.substring(VERBS_FOR_SENTENCES[3].length()).trim();
      if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[3][0])) {
        answerContent.append(ANSWER_CONTENT_STATUS[10]);
        input.setText(null);
      } else if (inputContent.toLowerCase().startsWith(NOUNS_FOR_SENTENCES[3][1])) {
        answerContent.append(ANSWER_CONTENT_STATUS[11]);
        input.setText(null);
      } else {
        answerContent.append(answerContentError + "\n");
      }
    } else {
      answerContent.append(answerContentError + "\n");
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
