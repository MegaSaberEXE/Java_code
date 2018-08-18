package javaswingtutorial4;

/**
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        
        setTitle("FlowLayout Example");
        JPanel panel = new JPanel();
        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));
        JButton button = new JButton("button");
        
        panel.add(button);
        
        JTree tree = new JTree();
        
        panel.add(tree);
        panel.add(area);
        add(panel);
        
        pack();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
}
    
    public static void main(String[] args) {
        new FlowLayoutExample();
}
}
*/