/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasinasistente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author liooficial
 */
public class gestionboton implements ActionListener  {
    public static void main(String args[]){
        
    }
     ventana ventana;

    public gestionboton(ventana ventana) {
        this.ventana = ventana;
    }
     
    
    public void actionPerformed(ActionEvent e){//hace referencia al cuadro de texto para que se pueda manipular
            double n1=0,n2=0,resltado=0;
            n1=Double.parseDouble(ventana.txt.getText());
            n2=Double.parseDouble(ventana.txt.getText());
            resltado=n1-n2;
            ventana.txt.setText(String.valueOf(resltado));
    }
}


 class gestionboton2 implements ActionListener  {
    public static void main(String args[]){
        
    }
     ventana ventana;

    public gestionboton2(ventana ventana) {
        this.ventana = ventana;
    }
     
    
    public void actionPerformed(ActionEvent e){//hace referencia al cuadro de texto para que se pueda manipular
            double n1=0,n2=0,resltado=0;
            n1=Double.parseDouble(ventana.txt.getText());
            n2=Double.parseDouble(ventana.txt.getText());
            resltado=n1+n2;
            ventana.txt.setText(String.valueOf(resltado));
    }
}
class gestionboton3 implements ActionListener  {
    public static void main(String args[]){
        
    }
     ventana ventana;

    public gestionboton3(ventana ventana) {
        this.ventana = ventana;
    }
     
    
    public void actionPerformed(ActionEvent e){//hace referencia al cuadro de texto para que se pueda manipular
            double n1=0,n2=0,resltado=0;
            n1=Double.parseDouble(ventana.txt.getText());
            n2=Double.parseDouble(ventana.txt.getText());
            resltado=n1*n2;
            ventana.txt.setText(String.valueOf(resltado));
    }
}
class gestionboton4 implements ActionListener  {
    public static void main(String args[]){
        
    }
     ventana ventana;

    public gestionboton4(ventana ventana) {
        this.ventana = ventana;
    }
     
    
    public void actionPerformed(ActionEvent e){//hace referencia al cuadro de texto para que se pueda manipular
            double n1=0,n2=0,resltado=0;
            n1=Double.parseDouble(ventana.txt.getText());
            n2=Double.parseDouble(ventana.txt.getText());
            resltado=n1/n2;
            ventana.txt.setText(String.valueOf(resltado));
    }
}