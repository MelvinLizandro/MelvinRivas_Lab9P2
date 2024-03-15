/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melvinrivas_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author l3306
 */
public class Hilo_Barra extends Thread {
    
    private JProgressBar barra;
    Boolean corriendo= true;

    public Hilo_Barra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(corriendo){
            
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000){
                    corriendo=false;
                }                 
           
            
            try {
                Thread.sleep(70);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
