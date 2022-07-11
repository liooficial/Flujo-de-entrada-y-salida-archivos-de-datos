/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasinasistente;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author liooficial
 */
public class crearventana extends Frame {
       public static void main(String args[]){
      Color color=new Color(0,255,255);
      ventana y = new ventana("calculadora", 100,100, 400, 400);
      y.setBackground(color);
    }
}
