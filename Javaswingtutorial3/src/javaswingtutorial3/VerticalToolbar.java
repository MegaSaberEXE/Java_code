package javaswingtutorial3;

/**
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.UIManager;

public class VerticalToolbar extends JFrame {
    
        public VerticalToolbar() {
            
        setTitle("Vertical toolbar");
        
        JToolBar toolbar = new JToolBar(JToolBar.VERTICAL);
        
        ImageIcon select = new ImageIcon(
getClass().getResource("select.gif"));
        ImageIcon freehand = new ImageIcon(
getClass().getResource("freehand.gif"));
        ImageIcon shapeed = new ImageIcon(
getClass().getResource("shapeed.gif"));
        ImageIcon pen = new ImageIcon(
getClass().getResource("pen.gif"));
        ImageIcon rectangle = new ImageIcon(
getClass().getResource("rectangle.gif"));
        ImageIcon ellipse = new ImageIcon(
getClass().getResource("ellipse.gif"));
        ImageIcon qs = new ImageIcon(
getClass().getResource("qs.gif"));
                ImageIcon text = new ImageIcon(
getClass().getResource("text.gif"));
                
        JButton selectb = new JButton(select);
        JButton freehandb = new JButton(freehand);
        JButton shapeedb = new JButton(shapeed);
        JButton penb = new JButton(pen);
        JButton rectangleb = new JButton(rectangle);
        JButton ellipseb = new JButton(ellipse);
        JButton qsb = new JButton(qs);
        JButton textb = new JButton(text);
        
        toolbar.add(selectb);
        toolbar.add(freehandb);
        toolbar.add(shapeedb);
        toolbar.add(penb);
        toolbar.add(rectangleb);
        toolbar.add(ellipseb);
        toolbar.add(qsb);
        toolbar.add(textb);
        
        add(toolbar, BorderLayout.WEST);
        setSize(250, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) {
            System.out.println("Error:" + e.getStackTrace());
        }
        new VerticalToolbar();
    }
}
*/

// example of A vertical toobar