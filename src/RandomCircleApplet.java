import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class RandomCircleApplet extends Applet{
    public void paint(Graphics page) {
      final int NUM_BOXES = 100, THICKNESS = 5, MAX_SIDE = 50;
      final int MAX_X = 350, MAX_Y = 250;
      int x, y, width, height;
      setBackground (Color.black);
      Random generator = new Random();
      for (int count = 0; count < NUM_BOXES; count++)
      {
         x = generator.nextInt (MAX_X) + 1;
         y = generator.nextInt (MAX_Y) + 1;
         width = generator.nextInt (MAX_SIDE) + 20;
         height = generator.nextInt (MAX_SIDE) + 20;
         page.fillOval(x, y, width, height);
         page.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
      }
    }
}