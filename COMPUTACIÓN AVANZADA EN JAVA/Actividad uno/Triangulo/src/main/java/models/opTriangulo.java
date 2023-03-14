package models;
import java.lang.Exception;

public class opTriangulo {
	private String xAltura;
    private String xBase;
    private double Altura;
    private double Base;
    private double Area;
    private double Perimetro;

    public opTriangulo(String xaltura, String xbase) {
    	try {
    		xAltura = xaltura;
    		xBase = xbase;
	        this.setAltura(Double.parseDouble(xaltura));
	        this.setBase(Double.parseDouble(xbase));
    	}
    	catch (Exception ex) { }
    	finally { }
    }
   
    public double getAltura(){
        return Altura;
    }
    public void setAltura(double altura){
        Altura = altura;
    }
    
    public double getBase(){
        return Base;
    }
    public void setBase(double base){
        Base = base;
    }
    
    public void calculaArea(){
        Area = (getBase() * getAltura()) / 2;
    }
    public void calculaPerimetro(){
        Perimetro = getBase() * 3;
    }
    
    public double getArea(){
        return Area;
    }
    public double getPerimetro(){
        return Perimetro;
    }
}