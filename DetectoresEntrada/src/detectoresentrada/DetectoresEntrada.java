
package detectoresentrada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetectoresEntrada {

    public static void main(String[] args) {
        //int numDeEntradas = Integer.parseInt(args[0]);
        
        File file = new File("numPersonas.txt");
        if(!file.exists()) try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(DetectoresEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(file, "rw");
            raf.seek(0);
            int ocupacion;
            try{
                ocupacion = raf.readInt();
            } catch(Exception e){
                ocupacion = 0;
            }
            for(int i=0; i < 10; i++) {
                ocupacion++;
            }
            raf.seek(0);
            raf.writeInt(ocupacion);
            System.out.println("Hay " + ocupacion);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DetectoresEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DetectoresEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (raf != null) try {
                raf.close();
            } catch (IOException ex) {
                Logger.getLogger(DetectoresEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
   }
    
