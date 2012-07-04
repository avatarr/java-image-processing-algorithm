/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image2d;

//import java.awt.Graphics2D;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Image2D {

    public Image2D() {
        String url = "icon.jpg";
        BufferedImage image = ImageProcessor.load_image(url);
        image = ImageProcessor.gaussianFillter(image, 5, 5, 0.86);
        image = ImageProcessor.grayscaleFillter(image);
       // image = ImageProcessor.histogram_cal(image);
        //image = ImageProcessor.threshold(image); // is method not work While the system is improved.
        Interval.counter(image);
        //ImageProcessor.printColor(image);
        JFrame frame = new JFrame("Display Image");
        ImagePanel iPanel = new ImagePanel(image);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add("Center", iPanel);
        frame.setSize(65, 134);
        //frame.setSize(image.getWidth(), image.getHeight());
        frame.setLocation(480, 200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Image2D i = new Image2D();
    }
}
