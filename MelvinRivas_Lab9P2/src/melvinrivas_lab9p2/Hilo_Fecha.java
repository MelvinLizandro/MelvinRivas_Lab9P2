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
public class Hilo_Fecha implements Runnable{
    
    private JLabel Fecha;

    public Hilo_Fecha(JLabel Fecha) {
        this.Fecha = Fecha;
    }
    
     @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
            Fecha.setText( f.format(h) );
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}
    

