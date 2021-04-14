
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
 
public class Imagen {
    //Ancho máximo
    public static int MAX_WIDTH=800;
    //Alto máximo
    public static int MAX_HEIGHT=800;
 
   
 
    public static void main(String[] args) throws IOException  {
    	Scanner teclado=new Scanner(System.in);
    	String nombre;
    	String ruta;
    	System.out.println("Introduce la ruta de tu imagen");
    	ruta=teclado.next();
    	System.out.println("Introduce el nombre de la imagen");
    	nombre=teclado.next();
    	cargarImagen(ruta+nombre);
    	
    	
    }
    public static BufferedImage cargarImagen(String ruta) {
    	BufferedImage imagen=null;
    	try {
    		imagen = ImageIO.read(new File(ruta));
    	
    	}catch(Exception e){
    		System.out.println("No encuentra la imagen");
    	}
    	
    	return imagen;
    }
 
    public static BufferedImage redimensiona(BufferedImage Image, int ancho, int alto) {
        int a = Image.getWidth(); 
        int an = Image.getHeight(); 
    	BufferedImage imagen=new BufferedImage(ancho, alto, Image.getType());
    	
    	return imagen;
    }
    public static void saveImage(BufferedImage Image, String ruta) {
        try {
            String format = (".png");
            File file =new File(ruta);
            file.getParentFile().mkdirs();
            ImageIO.write(Image, format, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 

   
}