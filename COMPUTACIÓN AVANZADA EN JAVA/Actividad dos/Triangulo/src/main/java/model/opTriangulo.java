package model;
import java.lang.Exception;

public class opTriangulo {
	private String xAltura;
    private String xBase;
    private double Altura;
    private double Base;
    private double Area;
    private double Perimetro;

    public opTriangulo(String saltura, String sbase) {
    	try {
    		xAltura = saltura;
    		xBase = sbase;
	        this.setAltura(Double.parseDouble(saltura));
	        this.setBase(Double.parseDouble(sbase));
    	}
    	catch (Exception ex) { }
    	finally { }
    }

    public String getsAltura(){
        return xAltura;
    }
    public void setsAltura(String saltura){
        xAltura = saltura;
    }
    
    public String getsBase(){
        return xBase;
    }
    public void setsBase(String sbase){
        xBase = sbase;
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
    
    public double Area(){
        return Area = (getBase() * getAltura()) / 2;
    }
    public double Perimetro(){
        return Perimetro = getBase() * 3;
    }
    
    public double getArea(){
        return Area;
    }
    public double getPerimetro(){
        return Perimetro;
    }
}