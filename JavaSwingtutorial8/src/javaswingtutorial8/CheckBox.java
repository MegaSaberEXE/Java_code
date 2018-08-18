package javaswingtutorial8;

/**
package javaswingtutorial8;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame implements ActionListener {
    
public CheckBox() {
    
setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
add(Box.createRigidArea(new Dimension(15, 20)));
JCheckBox checkbox = new JCheckBox("Show Title", true);
checkbox.setFocusable(false);
checkbox.addActionListener(this);
add(checkbox);

setSize(280, 200);

setTitle("CheckBox example");

setLocationRelativeTo(null);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new CheckBox();
}

public void actionPerformed(ActionEvent e) {
if (this.getTitle() == "") {
this.setTitle("Checkbox example");
} else {
this.setTitle("");
}
}
}
*/