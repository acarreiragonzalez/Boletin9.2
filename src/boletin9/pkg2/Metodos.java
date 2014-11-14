
package boletin9.pkg2;

import javax.swing.JOptionPane;

public class Metodos {
    int num1, num2,suma=0;
    double producto=1;
    
    

    
    public void suma(){
        for (int i = 9; i < 90; i++) {
            
            
           suma= i+suma;
            JOptionPane.showMessageDialog(null, "A suma comprendida entre 10 e 90 " +suma);
            
             producto =i*producto;
            
            JOptionPane.showMessageDialog(null, "O producto vai sendo " +producto);
        }
}
    
   
    
    
}
