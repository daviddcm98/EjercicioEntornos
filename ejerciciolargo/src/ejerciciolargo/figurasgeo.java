package ejerciciolargo;
import java.util.Scanner;

public class figurasgeo {
	final static double PI=3.14;
	public double figura;
	Scanner entrada=new Scanner(System.in);
	public figurasgeo(double figura) {
		
		this.figura=figura;
	}
	
	public void cuadrado() {
		int seleccion;
		double lcuadrado, areacuadrado, perimetrocuadrado;
		System.out.println("Ha seleccionado cuadrado");
		System.out.println("Pulse 1 para area");
		System.out.println("Pulse 2 para perimetro");
		seleccion=entrada.nextInt();
		switch (seleccion) {
		case 1:
			System.out.println("Ha seleccionado area");
			System.out.println("Introduzca el lado");
			lcuadrado=entrada.nextDouble();
			areacuadrado=lcuadrado*lcuadrado;
			System.out.println("El area es: " +areacuadrado);
			break;
		case 2:
			System.out.println("Ha seleccionado perimetro");
			System.out.println("Introduzca el lado");
			lcuadrado=entrada.nextDouble();
			perimetrocuadrado=lcuadrado*4;
			System.out.println("El area es: " +perimetrocuadrado);
		default:
			System.out.println("No es valido");
			break;
		}
				
	}
	public void triangulo() {
		int calculo;
		double htriangulo, btriangulo, areatriangulo, l1triangulo, l2triangulo, perimetrotriangulo;
		System.out.println("Ha seleccionado triangulo");
		System.out.println("1 - Area");
		System.out.println("2 - Perimetro");
		calculo=entrada.nextInt();
			switch(calculo){
			case 1:
			System.out.println("Introduzca la base");
			btriangulo=entrada.nextDouble();
			System.out.println("Introduzca la altura");
			htriangulo=entrada.nextDouble();
			areatriangulo=btriangulo*htriangulo/2;
			System.out.println("El area es: " +areatriangulo);
			break;

			case 2:
			System.out.println("Introduzca los lados");
			btriangulo=entrada.nextDouble();
			l1triangulo=entrada.nextDouble();
			l2triangulo=entrada.nextDouble();
			perimetrotriangulo=btriangulo+l1triangulo+l2triangulo;
			System.out.print("El perimetro es: " +perimetrotriangulo);
			}
	}
	public void circulo() {
		int calculo;
		double perimetrocirculo, areacirculo, radio;
		System.out.println("Ha seleccionado circulo");
		System.out.println("1 - Area");
		System.out.println("2 - Perimetro");
		calculo=entrada.nextInt();
			switch(calculo){
			case 1:
			System.out.println("Introduce el radio");
			radio=entrada.nextDouble();
			areacirculo=radio*radio*PI;
			System.out.println("El area es: " +areacirculo);
			break;
			
			case 2:
			System.out.println("Introduce el radio");
			radio=entrada.nextDouble();
			perimetrocirculo=radio*2*PI;
			System.out.println("El perimetro es: " +perimetrocirculo);
			break;
			default:
			System.out.println("No es valido");
			break;
			}
	}
	public void hexagono() {
		int calculo;
		double perimetrohexagono, areahexagono,lhexagono, apotema;
		System.out.println("Ha seleccionado hexagono");
		System.out.println("1 - Area");
		System.out.println("2 - Perimetro");
		calculo=entrada.nextInt();
			switch(calculo){
			case 1:
			System.out.println("Introduzca la apotema");
			apotema=entrada.nextDouble();
			System.out.println("Introduzca el lado");
			lhexagono=entrada.nextDouble();
			areahexagono=lhexagono*6*apotema/2;
			System.out.println("El area es: " +areahexagono);
			break;
				
			case 2:
			System.out.println("Introduzca el lado");
			lhexagono=entrada.nextDouble();
			perimetrohexagono=lhexagono*6;
			System.out.println("El perimetro es: " +perimetrohexagono);
			break;
			default:
			System.out.println("No es valido");
			break;
			}
	}
}
