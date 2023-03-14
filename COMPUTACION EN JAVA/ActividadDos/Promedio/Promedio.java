package Promedio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Promedio {
	
	private static	BufferedReader dataCaptur = new BufferedReader(new InputStreamReader(System.in));
	
	public static void CalculaNota() {
	String sAlumno = "";
	Double[] dNotas = null;	
	Double dbPromedio = 0.0;
	
	try {
		System.out.print("Captura nombre de estudiante");
		sAlumno = dataCaptur.readLine().toString().trim().toUpperCase();
		dNotas = ObtenNotas(5,0);
		dbPromedio = GeneraPromedio(dNotas);
		ImprimirPantalla(sAlumno, dNotas, dbPromedio, CalificacionFinal(dbPromedio));
	}
	
	catch (Exception ex) {
		
		
	}
		
	}
	
	private static Double[] ObtenNotas(int nTamArreglo, int nRenglonCont) {
		Double[] dResultado = new Double[nTamArreglo];
		try {
			do {
				dResultado[nRenglonCont] = ObtenNotas(nRenglonCont);
				nRenglonCont ++;
			}while (nRenglonCont <= (nTamArreglo -1));
		}
		catch(Exception ex) {}
		finally {}
		return dResultado;
	}
	private static Double ObtenNotas(int nRenglonCont) {
		Double dResultado = 0.0;
		try {
			System.out.print("Calificacion: " + (nRenglonCont + 1 ) + ": ");
			dResultado = Double.parseDouble(dataCaptur.readLine());
			if (dResultado < 0 || dResultado > 100) throw new IOException("Calificacion Erronea.");
			dResultado = Math.round(dResultado * 100.00) / 100.00;	
		}
		catch (IOException | NumberFormatException ex) {
			System.out.print("La informacion registrada no es un numero, ingresa una calificacion valida.");
			dResultado = ObtenNotas(nRenglonCont);
		}
		finally {}
		return dResultado;
	}
	private static Double GeneraPromedio(Double[] dNotas) {
		double dResultado = 0.0;
		Integer nConteo = 0;
		try {
			for (nConteo = 0; nConteo < dNotas.length; nConteo++)
			{
				dResultado = dResultado + dNotas[nConteo];
			}
			    dResultado = Math.round((dResultado / dNotas.length) * 100.00 / 100.00);
		}
		catch (Exception ex) {
			
		}
		return dResultado;
	}
	
	private static String  CalificacionFinal (Double dbPromedio) {
		String sResult = "A";
		
		if (dbPromedio  <= 50.00) sResult = "F";
		else if (dbPromedio >= 51.00 && dbPromedio <= 60.99) sResult = "E";
		else if (dbPromedio >= 61.00 && dbPromedio <= 70.99) sResult = "D";
		else if (dbPromedio >= 71.00 && dbPromedio <= 80.99) sResult = "C";
		else if (dbPromedio >= 81.00 && dbPromedio <= 90.99) sResult = "B";
		else if (dbPromedio >= 91.00 && dbPromedio <= 100.99) sResult = "A";
		else sResult = "F";
		
		return sResult;
		
	}
	
	public static void ImprimirPantalla(String sAlumno, Double[] dNotas, Double dbPromedio, String sCalificacion) {
		Integer nConteo = 0;
		System.out.println("");
		System.out.println("");
		System.out.println("Nombre del alumno: " + sAlumno);
		for (nConteo = 0; nConteo < dNotas.length; nConteo++)
		{
			System.out.println("Calificacion: " + (nConteo + 1) + ": " + dNotas[nConteo]);	
		}
		System.out.println("Promedio: " + dbPromedio);
        System.out.println("Calificación: " + sCalificacion);
		
	}
	
}
