package guitest;

/**
import java.awt.EventQueue;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
  
   // Launch the application.
   
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MyFrame frame = new MyFrame();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
  
   // Create the frame.
   
  public MyFrame() {
    setBounds(100, 100, 450, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
*/

// Listing 20-2: WindowBuilder (eclispe) creates a minimal GUI applicatio