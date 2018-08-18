package javaswingtutorial9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List extends JFrame {
    
private JLabel label;
private JList list;

public List() {
    
setTitle("List");

JPanel panel = new JPanel();
panel.setLayout(new BorderLayout());
panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
String[] fonts = ge.getAvailableFontFamilyNames();

list = new JList(fonts);

list.addListSelectionListener(new ListSelectionListener() {   
public void valueChanged(ListSelectionEvent e) {
if (!e.getValueIsAdjusting()) {
String name = (String) list.getSelectedValue();
Font font = new Font(name, Font.PLAIN, 12);
label.setFont(font);
}
}
});

JScrollPane pane = new JScrollPane();
pane.getViewport().add(list);
pane.setPreferredSize(new Dimension(250, 200));
panel.add(pane);
label = new JLabel("Aguirre, der Zorn Gottes");
label.setFont(new Font("Serif", Font.PLAIN, 12));
add(label, BorderLayout.SOUTH);

setDefaultCloseOperation(EXIT_ON_CLOSE);
add(panel);
pack();
setLocationRelativeTo(null);
setVisible(true);
}
public static void main(String[] args) {
new List();
}
}