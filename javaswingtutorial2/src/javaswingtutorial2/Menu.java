package javaswingtutorial2;


/**
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame {
    
    public Menu() {
        
        setTitle("Menu");
        
        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("C:\\Users\\MegaSaber\\Documents\\NetBeansProjects\\javaswingtutorial2\\src\\javaswingtutorial2\\Weeaboo_republic_logo.png");
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_K);
        
        JMenuItem fileClose = new JMenuItem("Close", icon);
        fileClose.setMnemonic(KeyEvent.VK_C);
        fileClose.setToolTipText("Exit application");
        fileClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        
        file.add(fileClose);
        menubar.add(file);
        
        setJMenuBar(menubar);
        
        setSize(250,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Menu();
    }
}
*/

// example of toolbar menu