package javaswingtutorial9;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class TextPane extends JFrame {
public TextPane() {
setTitle("JTexPane");
setDefaultCloseOperation(EXIT_ON_CLOSE);
JPanel panel = new JPanel();
panel.setLayout(new BorderLayout());
panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
JScrollPane pane = new JScrollPane();
JTextPane textpane = new JTextPane();
textpane.setContentType("text/html");
textpane.setEditable(false);
String cd = System.getProperty("user.dir") + "/";
try {
textpane.setPage("File:///" + cd + "test.html");
} catch (IOException e) {
System.out.println("Exception: " + e);
}
textpane.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
pane.getViewport().add(textpane);
panel.add(pane);
add(panel);
setSize(new Dimension(380, 320));
setLocationRelativeTo(null);
setVisible(true);
}
public static void main(String[] args) {
new TextPane();
}
}

/**
 <html>
<head>
 <title>A simple html document</title>
</head>
<body>
<h2>A simple html document</h2>
<p>
<b>JTextPane</b> can display html documents.
</p>
<br>
<pre>
JScrollPane pane = new JScrollPane();
JTextPane textpane = new JTextPane();
textpane.setContentType("text/html");
textpane.setEditable(false);
</pre>
 <br>
<small>The Java Swing tutorial, 2007</small>
</body>
</html>
 */