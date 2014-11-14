
package boletin9.pkg2;

import javax.swing.JOptionPane;

public class Metodos {
    int num1, num2,suma;
    int producto;
    
    public double darValor(){
    String resposta=JOptionPane.showInputDialog("dame o valor do numero 1  ");
            
    double valor=Double.parseDouble(resposta);
            
    return valor;}
    
    public double darValor2(){
    String resposta=JOptionPane.showInputDialog("dame o valor do numero  ");
            
    double valor=Double.parseDouble(resposta);
            
    return valor;}
    
    public void suma(){
        for (int i = 9; i < 90; i++) {
            int contador = i;
            
           suma= contador+suma++;
            JOptionPane.showMessageDialog(null, "A suma comprendida entre 10 e 90 " +suma);
            
             producto = 1+contador*producto++;
            
            JOptionPane.showMessageDialog(null, "O producto vai sendo " +producto);
        }
}
    
   
    
    
}
