package javaswingtutorial1;

/**
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class QuitButtonEx extends JFrame {
    
    public QuitButtonEx() {
        initUI();
    }
    
    private void initUI() {
        
        JButton quitButton = new JButton("Quit");
        
        quitButton.addActionListener((ActionEvent event) -> {
        System.exit(0);
    });
        
        createLayout(quitButton);
        
        setTitle("Quit button");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void createLayout(JComponent... arg) {
        
        Container pane = getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);
        
        g1.setAutoCreateContainerGaps(true);
        
        g1.setHorizontalGroup(g1.createSequentialGroup().addComponent(arg[0]));
        g1.setVerticalGroup(g1.createSequentialGroup().addComponent(arg[0]));
    }
    
    public static void main(String[] arg) {
        
        EventQueue.invokeLater(() -> {
            QuitButtonEx ex = new QuitButtonEx();
            ex.setVisible(true);
        }); 
    }
}
*/

// JButton example