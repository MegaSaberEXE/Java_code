package javaswingtutorial1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


class MyLabel extends JLabel {

    public MyLabel() {
        super("", null, LEADING);
    }

    @Override
    public boolean isOpaque() {
        return true;
    }
}

public class StandardColoursEx extends JFrame {
    
    public StandardColoursEx() {
        initUI();
    }
    
    private void initUI() {
        
        Color[] stdCols = {Color.black, Color.blue, Color.cyan,
        Color.darkGray, Color.gray, Color.green, Color.lightGray,
        Color.magenta, Color.orange, Color.pink, Color.red,
        Color.white, Color.yellow};
        
        List<JLabel> labels = new ArrayList();
        
        for (Color col : stdCols) {
            
            JLabel lbl = createColouredLabel(col);
            labels.add(lbl);
        }
        
        createLayout(labels.toArray(new JLabel[labels.size()]));
        
        setTitle("Standard colours");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public JLabel createColouredLabel(Color col) {
        
        MyLabel lbl = new MyLabel();
        lbl.setMinimumSize(new Dimension(90, 40));
        lbl.setBackground(col);
        
        return lbl;
    }
    
    private void createLayout(JLabel[] labels) {
        
        JPanel pane = (JPanel) getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);
        
        pane.setToolTipText("Content pane");
        
        g1.setAutoCreateContainerGaps(true);
        g1.setAutoCreateGaps(true);
        
        g1.setHorizontalGroup(g1.createParallelGroup()
        .addGroup(g1.createSequentialGroup()
                .addComponent(labels[0])
                .addComponent(labels[1])
                .addComponent(labels[2])
                .addComponent(labels[3]))
        .addGroup(g1.createSequentialGroup()
                .addComponent(labels[4])
                .addComponent(labels[5])
                .addComponent(labels[6])
                .addComponent(labels[7]))
        .addGroup(g1.createSequentialGroup()
                .addComponent(labels[8])
                .addComponent(labels[9])
                .addComponent(labels[10])
                .addComponent(labels[11]))
                .addComponent(labels[12])
        );
        
        g1.setVerticalGroup(g1.createSequentialGroup()
        .addGroup(g1.createParallelGroup()
                .addComponent(labels[0])
                .addComponent(labels[1])
                .addComponent(labels[2])
                .addComponent(labels[3]))
        .addGroup(g1.createParallelGroup()
                .addComponent(labels[4])
                .addComponent(labels[5])
                .addComponent(labels[6])
                .addComponent(labels[7]))
        .addGroup(g1.createParallelGroup()
                .addComponent(labels[8])
                .addComponent(labels[9])
                .addComponent(labels[10])
                .addComponent(labels[11]))
                .addComponent(labels[12]) 
        );
        pack();
    }
    
    public static void main(String[] arg) {
        
        EventQueue.invokeLater(() -> {
        StandardColoursEx ex = new StandardColoursEx();
        ex.setVisible(true);
    });
    }
}

//