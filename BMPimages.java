/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bmpimages;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Kudlac
 */
public class BMPimages {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) throws IOException {
        File file = new File("image2.bmp");
        BufferedImage img = ImageIO.read(file);
        int height = img.getHeight();
        int width = img.getWidth();
        int[] pixels = img.getRGB(0, 0, img.getWidth(), img.getHeight(), null, 0, img.getWidth());
        System.out.println(pixels.length);
        Raster raster = img.getRaster(); 
        Byte[] bits = new Byte[pixels.length];
        System.out.println(Integer.toBinaryString(pixels[1]));   
        System.out.println(Integer.toBinaryString(193));
        System.out.println(Integer.toBinaryString(198));
        System.out.println(Integer.toBinaryString(217));
        System.out.println("rozmery: "+height+" x "+width);
    }
}
