package javaswingtutorial112;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Textures extends JPanel {
public void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g2d = (Graphics2D) g;
g2d.setColor(new Color(212, 212, 212));
g2d.drawRect(10, 15, 90, 60);
g2d.drawRect(130, 15, 90, 60);
g2d.drawRect(250, 15, 90, 60);
g2d.drawRect(10, 105, 90, 60);
g2d.drawRect(130, 105, 90, 60);
g2d.drawRect(250, 105, 90, 60);
BufferedImage bimage1 = null;
BufferedImage bimage2 = null;
BufferedImage bimage3 = null;
BufferedImage bimage4 = null;
BufferedImage bimage5 = null;
BufferedImage bimage6 = null;
URL url1 = ClassLoader.getSystemResource("texture1.png");
URL url2 = ClassLoader.getSystemResource("texture2.png");
URL url3 = ClassLoader.getSystemResource("texture3.png");
URL url4 = ClassLoader.getSystemResource("texture4.png");
URL url5 = ClassLoader.getSystemResource("texture5.png");
URL url6 = ClassLoader.getSystemResource("texture6.png");
try {
bimage1 = ImageIO.read(url1);
bimage2 = ImageIO.read(url2);
bimage3 = ImageIO.read(url3);
bimage4 = ImageIO.read(url4);
bimage5 = ImageIO.read(url5);
bimage6 = ImageIO.read(url6);
} catch (IOException ioe) {
ioe.printStackTrace();
}
Rectangle rect1 = new Rectangle(0, 0,
bimage1.getWidth(), bimage1.getHeight());
Rectangle rect2 = new Rectangle(0, 0,
bimage2.getWidth(), bimage2.getHeight());
Rectangle rect3 = new Rectangle(0, 0,
bimage3.getWidth(), bimage3.getHeight());
Rectangle rect4 = new Rectangle(0, 0,
        bimage4.getWidth(), bimage4.getHeight());
Rectangle rect5 = new Rectangle(0, 0,
bimage5.getWidth(), bimage5.getHeight());
Rectangle rect6 = new Rectangle(0, 0,
bimage6.getWidth(), bimage6.getHeight());
TexturePaint texture1 = new TexturePaint(bimage1, rect1);
TexturePaint texture2 = new TexturePaint(bimage2, rect2);
TexturePaint texture3 = new TexturePaint(bimage3, rect3);
TexturePaint texture4 = new TexturePaint(bimage4, rect4);
TexturePaint texture5 = new TexturePaint(bimage5, rect5);
TexturePaint texture6 = new TexturePaint(bimage6, rect6);
g2d.setPaint(texture1);
g2d.fillRect(10, 15, 90, 60);
g2d.setPaint(texture2);
g2d.fillRect(130, 15, 90, 60);
g2d.setPaint(texture3);
g2d.fillRect(250, 15, 90, 60);
g2d.setPaint(texture4);
g2d.fillRect(10, 105, 90, 60);
g2d.setPaint(texture5);
g2d.fillRect(130, 105, 90, 60);
g2d.setPaint(texture6);
g2d.fillRect(250, 105, 90, 60);
}
public static void main(String[] args) {
Textures rects = new Textures();
JFrame frame = new JFrame("Textures");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(rects);
frame.setSize(360, 210);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
}