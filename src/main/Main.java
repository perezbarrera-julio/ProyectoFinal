package main;

import java.awt.EventQueue;
import Vistas.Principal;

import bbdd.conexion;

public class Main {
	
	public static void main(String[] args) {
	
    conexion.Conectar();
		
   
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
	}
}