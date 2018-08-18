package javaswingtutorial9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

public class ToggleButton extends JDialog implements ActionListener {
private JToggleButton red;
private JToggleButton green;
private JToggleButton blue;
private JPanel display;

public ToggleButton() {
JPanel bottom = new JPanel();
bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
bottom.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
JPanel leftPanel = new JPanel();
leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
red = new JToggleButton("red");
red.addActionListener(this);
green = new JToggleButton("green");
green.addActionListener(this);
blue = new JToggleButton("blue");
blue.addActionListener(this);
blue.setMaximumSize(green.getMaximumSize());
red.setMaximumSize(green.getMaximumSize());
leftPanel.add(red);
leftPanel.add(Box.createRigidArea(new Dimension(25, 7)));
leftPanel.add(green);
leftPanel.add(Box.createRigidArea(new Dimension(25, 7)));
leftPanel.add(blue);
bottom.add(leftPanel);
bottom.add(Box.createRigidArea(new Dimension(20, 0)));
display = new JPanel();
display.setPreferredSize(new Dimension(110, 110));
display.setBorder(LineBorder.createGrayLineBorder());
display.setBackground(Color.black);
bottom.add(display);
add(bottom);
pack();
setResizable(false);
setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new ToggleButton();
}
public void actionPerformed(ActionEvent e) {
Color color = display.getBackground();
int red = color.getRed();
int green = color.getGreen();
int blue = color.getBlue();
if (e.getActionCommand() == "red") {
if (red == 0) {
red = 255;
} else {
red = 0;
}
}
if (e.getActionCommand() == "green") {
if (green == 0) {
green = 255;
} else {
green = 0;
}
}
if (e.getActionCommand() == "blue") {
if (blue == 0) {
blue = 255;
} else {
blue = 0;
}
}
Color setCol = new Color(red, green, blue);
display.setBackground(setCol);
}
}