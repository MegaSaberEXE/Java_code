package javaswingtutorial6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserInterface extends JFrame {
public UserInterface() {
    
    setTitle("Using inner class");
    
    JPanel panel = new JPanel();
    panel.setLayout(null);
    
    MyButton close = new MyButton("Close");
    close.setBounds(40, 50, 80, 25);
    
    panel.add(close);
    add(panel);
    
    setSize(300, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
}

class MyButton extends JButton implements ActionListener {
    public MyButton(String text) {
        super.setText(text);
        addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}

public static void main(String[] args) {
    new UserInterface();
}
}

// actually call usinginterface

