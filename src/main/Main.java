package main;

import java.awt.EventQueue;
import java.security.Principal;
import bbdd.conexion;

public class Main {
	
	public static void main(String[] args) {
	/* Conexion con la BBDD */
    conexion.conectar();
		
    /* LLamada a la vista principal */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
	}
}