package javaswingtutorial7;

/**
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adapter extends JFrame {
    
    private JLabel labelx;
    private JLabel labely;
    
    public Adapter() {
        
        setTitle("Adapter");
        
        JPanel panel = new JPanel();
        
        panel.setLayout(null);
        
        labelx = new JLabel("x: ");
        labelx.setFont(new Font("Serif", Font.BOLD, 14));
        labelx.setBounds(20, 20, 60, 25);
        labely = new JLabel("y: ");
        labely.setFont(new Font("Serif", Font.BOLD, 14));
        labely.setBounds(20, 45, 60, 25);
        
        panel.add(labelx);
        panel.add(labely);
        add(panel);
        addComponentListener(new MoveAdapter());

        setSize(310, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

}
    class MoveAdapter extends ComponentAdapter {
        public void componentMoved(ComponentEvent e) {
            int x = e.getComponent().getX();
            int y = e.getComponent().getY();
            labelx.setText("x: " + x);
            labely.setText("y: " + y);
}
}

public static void main(String[] args) {
    new Adapter();
}
}
*/
