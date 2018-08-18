package buttonsample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonSample {
  public static void main(String args[]) {
    Runnable runner = new Runnable() {
      public void run() {
          
        JFrame frame = new JFrame("Button Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Select Me");
        
        JButton button2 = new JButton("This is my custom button");
        
        // Define ActionListener
        ActionListener actionListener = new ActionListener() {
          public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("I was selected.");
            
        ActionListener aLtwo = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent){
                    System.out.println("Custom button selected");
        }
        };
            
          }
        };
        // Attach listeners
        button.addActionListener(actionListener);
        
        button2.addActionListener(aLtwo);
        
        frame.add(button, BorderLayout.SOUTH);
        
        frame.add(button2, BorderLayout.NORTH);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
      }
    };
    EventQueue.invokeLater(runner);
  }
}
