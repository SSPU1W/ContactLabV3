import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
public class Phone extends JPanel {
    private int x = 100;
    private int y = 100;
    private BufferedImage strawberryImg;

 
    public Phone() {
        //Instantiate the image object in the constructor
        try {
            strawberryImg = ImageIO.read(new File("strawberry.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
		
    }
 
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800, 600);
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw the image
        g.drawImage(strawberryImg, 570, 200, null);
    }
 
 
 
 
}