package com.examples.javaprog;

import javax.swing.*;
import java.awt.event.*;

public class Questions implements ActionListener {
    public static void main(String[] args) {
        Questions q = new Questions();
        q.start();
    }

    public void start() {
        JFrame frame = new JFrame();               // creates a frame
        button = new JButton(":)");   // creates a button with words in passed in arg
        button.addActionListener(this);         // adds this object button to list of listeners


        frame.getContentPane().add(button);                   // puts the button onto the frame's content pane
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quits program after clicking x on window
        frame.setSize(250, 250);                // size of frame (x,y)
        frame.setVisible(true);                               // makes frame visible
    }

    public void actionPerformed(ActionEvent Event) {
        button.setText("REE");
    }
}
