package painttest;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
     
    public class PaintTest extends JPanel {
        static final int WIDTH = 1000, HEIGHT = 600;
    

    public String getName() {
        return "PaintTest";
    }
    
    public int getWidth() {
        return WIDTH;
    }
    
    public int getHeight() {
        return HEIGHT;
    }
    
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        g.setPaint(new GradientPaint(0, 0, new Color(150, 0, 0), WIDTH, HEIGHT, new Color(200, 200, 255)));
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        g.setPaint(new GradientPaint(0, 0, new Color(0, 150, 0), 20, 20, new Color(0, 150, 0, 0), true));
        g.setStroke(new BasicStroke(15));
        g.drawRect(25, 25, WIDTH - 50, HEIGHT - 50);
        
        Font font = new Font("Calibri", Font.BOLD, 10);
        Font bigfont = font.deriveFont(AffineTransform.getScaleInstance(30.0, 30.0));
        GlyphVector gv = bigfont.createGlyphVector(g.getFontRenderContext(), "JAV");
        Shape jshape = gv.getGlyphOutline(0);
        Shape ashape = gv.getGlyphOutline(1);
        Shape vshape = gv.getGlyphOutline(2);
        
        g.setStroke(new BasicStroke(5.0f));
        
        Paint shadowPaint = new Color(0, 0, 0, 100);
        AffineTransform shadowTransform = AffineTransform.getShearInstance(-1.0, 0.0);
        shadowTransform.scale(1.0, 0.5);
        
        g.translate(65, 270);
        
        g.setPaint(shadowPaint);
        g.translate(15, 20);
        
        g.fill(shadowTransform.createTransformedShape(jshape));
        g.translate(-15, 20);
        
        g.setPaint(Color.blue);
        g.fill(jshape);
        g.setPaint(Color.black);
        g.draw(jshape);
        
        g.translate(75, 0);
        g.setPaint(shadowPaint);
        g.fill(shadowTransform.createTransformedShape(ashape));
        
        g.setPaint(new Color(0, 255, 0, 125));
        g.fill(ashape);
        g.setPaint(Color.black);
        g.draw(ashape);
        
        g.translate(175, 0);
        g.setPaint(shadowPaint);
        g.fill(shadowTransform.createTransformedShape(vshape));
        
        BufferedImage tile = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics2D tg = tile.createGraphics();
        tg.setColor(Color.pink);
        tg.fillRect(0, 0, 50, 50);
        
        tg.setPaint(new GradientPaint(40, 0, Color.green, 0, 40, Color.gray));
        tg.fillOval(5, 5, 40, 40);
        
        g.setPaint (new TexturePaint(tile, new Rectangle(0, 0, 50, 50)));
        g.fill(vshape);
        g.setPaint(Color.black);
        g.draw(vshape);
        
        g.translate(160, 0);
        g.setPaint(shadowPaint);
        g.fill(shadowTransform.createTransformedShape(ashape));
        
        g.fill(ashape);
        g.setPaint(Color.black);
        g.draw(ashape);
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.addWindowListener (new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0); }});
        f.setContentPane(new PaintTest());
        f.setSize(1000, 600);
        f.setVisible(true);
    }
    }    

