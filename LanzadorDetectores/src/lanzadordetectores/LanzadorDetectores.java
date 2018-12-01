
package lanzadordetectores;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LanzadorDetectores {

    public static void main(String[] args) {
        int numDetectoresEntrada = Integer.parseInt(args[0]);
        int numDetectoresSalida = Integer.parseInt(args[1]);
        Process proceso;
        for (int i = 0; i < numDetectoresEntrada; i++) {
            String programa = "java -jar DetectoresEntrada.jar";
            try {
                proceso = Runtime.getRuntime().exec(programa);
            } catch (IOException ex) {
                Logger.getLogger(LanzadorDetectores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (int i = 0; i < numDetectoresSalida; i++) {
            String programa = "java -jar DetectoresSalida.jar";
            try {
                proceso = Runtime.getRuntime().exec(programa);
            } catch (IOException ex) {
                Logger.getLogger(LanzadorDetectores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
