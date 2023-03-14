package Promedio;

import java.io.*;

public class Main {

	private static BufferedReader datoCaptura = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
    	System.out.println("   ****** Calificaciones   ******   ");
        Promedio.CalculaNota();
        System.out.println("   *****   Finalizar programa  *****   ");
        System.out.print("Presione ENTER para continuar.");
        try {
			datoCaptura.readLine().toString().trim().toUpperCase();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
    
}
