package javaswingtutorial7;

/**
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class AboutDialog extends JDialog {
    public AboutDialog() {
        
        setTitle("About Notes");
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 10)));
        ImageIcon icon = new ImageIcon("C:\\Users\\MegaSaber\\Documents\\NetBeansProjects\\JavaSwingtutorial7\\src\\javaswingtutorial7\\notes.png");
        
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        add(label);
        
        add(Box.createRigidArea(new Dimension(0, 10)));
        
        JLabel name = new JLabel("Notes, 1.23");
        name.setFont(new Font("Serif", Font.BOLD, 13));
        name.setAlignmentX(0.5f);
        add(name);
        
        add(Box.createRigidArea(new Dimension(0, 50)));
        
        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });
        
        close.setAlignmentX(0.5f);
        add(close);
        
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
        
    }
}
public class SimpleDialog extends JFrame {
    public SimpleDialog() {
        
        setTitle("Simple Dialog");
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenu help = new JMenu("Help");
        help.setMnemonic(KeyEvent.VK_H);
        
        JMenuItem about = new JMenuItem("About");
        help.add(about);
        
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AboutDialog ad = new AboutDialog();
                ad.setVisible(true);
            }
        });
        
        menubar.add(file);
        menubar.add(help);
        setJMenuBar(menubar);
        
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleDialog();
    }
}
*/