package com.examples.javaprog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questions implements ActionListener {
    private JButton button;
    private JTextField text_field;

    public static void main(String[] args) {
        Questions q = new Questions();
        q.start();
    }

    private void start() {
        JFrame frame = new JFrame();
        button = new JButton("Type \"apple\" then click me")
        button.addActionListener(this);  // adds this object button to list of listeners

        text_field = new JTextField();


        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, text_field);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent Event) {
        if (text_field.getText().equalsIgnoreCase("apple")) {  // if the text box has "apple" written in
            button.setText("Good job.");  // make the button say "good job"
        }
    }
}
