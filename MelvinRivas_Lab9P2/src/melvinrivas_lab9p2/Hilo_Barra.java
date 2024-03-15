/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melvinrivas_lab9p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author l3306
 */
public class Hilo_Barra extends Thread {
    
    private JProgressBar barra;
    private JTextArea Contenido;
   private String archivo;
    Boolean corriendo= true;
    
    
    public Hilo_Barra(JProgressBar barra, JTextArea Contenido,String archivo) {
        this.barra = barra;
        this.Contenido = Contenido;
        this.archivo = archivo;
    }
    
//a
    @Override
    public void run() {
        
        while (corriendo == true) {

            barra.setValue(barra.getValue() + 1);
            if (barra.getValue() == 100) {
                   
                Contenido.setText(archivo);
                         corriendo = false;
                }
            //a
                try {
                    Thread.sleep(70);
                } catch (InterruptedException ex) {
                }
            
        }
    }
    
    
}

