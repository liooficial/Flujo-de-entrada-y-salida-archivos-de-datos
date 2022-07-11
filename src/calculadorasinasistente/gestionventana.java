/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasinasistente;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
/**
 *
 * @author liooficial
 */
public class gestionventana extends WindowAdapter {
    private Frame ventana;

    public gestionventana(Frame ventana) {
        this.ventana = ventana;
    }
     public void windowClosing(WindowEvent we) {
       System.exit(0);
    }
}

