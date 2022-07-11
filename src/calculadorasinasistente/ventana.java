/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasinasistente;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author liooficial
 */
public class ventana extends Frame {
     public static void main(String args[]){
        
    }
    public Button btsuma,btresta,btmulti,btdiv;
    public TextField txt,txt1,txt2;
    Color color=new Color(58,163,137);

    
    public ventana(String titulo, int x, int y, int ancho, int alto){
    super(titulo);
    
        this.setBounds(x, y, ancho, alto);
        
        this.setLayout(null);//layaout gestores de contenido(se deja en nulo si se quieren trabajar sobre coordenadas)
        
        txt = new TextField();
        txt.setBounds(80, 125, 150,30);//coordenas a partir del lado izquierdo de la pantalla
        this.add(txt);
        txt1 = new TextField();
        txt1.setBounds(80, 165, 150,30);//coordenas a partir del lado izquierdo de la pantalla
        this.add(txt1);
        txt2 = new TextField();
        txt2.setBounds(80, 200, 150,30);//coordenas a partir del lado izquierdo de la pantalla
        this.add(txt2);
        
        btsuma =new Button("+");
        btsuma.setBounds(270, 70, 50, 30);
        btsuma.setForeground(Color.WHITE);
        btsuma.setBackground(color);
        gestionboton g1 =new gestionboton(this);
        btsuma.addActionListener(g1);
        this.add(btsuma);
        btsuma =new Button("-");
        btsuma.setBounds(200, 70, 50, 30);
        btsuma.setForeground(Color.WHITE);
        btsuma.setBackground(color);
        gestionboton2 g2 =new gestionboton2(this);
        btsuma.addActionListener(g2);
        this.add(btsuma);
        btsuma =new Button("+");
        btsuma.setBounds(120, 70, 50, 30);
        btsuma.setForeground(Color.WHITE);
        btsuma.setBackground(color);
        gestionboton3 g3 =new gestionboton3(this);
        btsuma.addActionListener(g3);
        this.add(btsuma);
        btsuma =new Button("+");
        btsuma.setBounds(50, 70, 50, 30);
        btsuma.setForeground(Color.WHITE);
        btsuma.setBackground(color);
        gestionboton4 g4 =new gestionboton4(this);
        btsuma.addActionListener(g4);
        this.add(btsuma);
                
        
       
         JLabel num1 =new JLabel("numero 1");
        num1.setBounds(10, 125, 70, 30);
         this.add(num1);
         JLabel num2 =new JLabel("numero 2");
        num2.setBounds(10, 165, 70, 30);
         this.add(num2);
        
         JLabel resul =new JLabel("resultado");
        resul.setBounds(10, 200, 70, 30);
         this.add(resul);
        
        gestionventana gv = new gestionventana(this);//AUTOREFERENCIA(THIS)
        this.addWindowListener(gv);
        
        this.setVisible(true);
          
    }
}