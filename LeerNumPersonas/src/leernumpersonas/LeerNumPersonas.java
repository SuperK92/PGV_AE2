
package leernumpersonas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LeerNumPersonas {
    public static void main(String[] args) {
        File file = new File("numPersonas.txt");
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(file, "r");
            raf.seek(0);
            int ocupacion = raf.readInt();
            System.out.println("Hay " + ocupacion);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerNumPersonas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerNumPersonas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (raf != null) try {
                raf.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerNumPersonas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
