/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melvinrivas_lab9p2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author l3306
 */
public class Hilo_Hora implements Runnable {
    
    private JLabel Hora;
   
    public Hilo_Hora(JLabel Hora) {
        this.Hora = Hora;
    }

 @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            Hora.setText( f.format(h) );
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}


