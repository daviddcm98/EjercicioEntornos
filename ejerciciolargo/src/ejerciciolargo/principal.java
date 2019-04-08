package ejerciciolargo;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int finicio=1, modo, figura, seleccion, operar;
		double num1, num2, num3, contador=1;
	
		while(finicio==1){
		System.out.println("Bienvenido usuario");
		System.out.println("1 - Figuras geometricas");
		System.out.println("2 - Operaciones matematicas");
		modo=entrada.nextInt();
			switch(modo){
			case 1:
				figurasgeo f1; 
				System.out.println("1 - Cuadrado");
				System.out.println("2 - Triangulo");
				System.out.println("3 - Circulo");
				System.out.println("4 - Hexagono");
			figura=entrada.nextInt();
			f1= new figurasgeo(figura);
			
				switch(figura){
				case 1:
				f1.cuadrado();
				break;
				case 2:
				f1.triangulo();
				break;
				case 3:
				f1.circulo();
				break;
				case 4:
				f1.hexagono();
				break;
				default:
				System.out.println("No es valido");
				break;
							}
				break;
			case 2:
			System.out.println("1-Mayor o menor");
			System.out.println("2-Elevar un numero");
			operacionesmat f2;
			f2= new operacionesmat();
			operar=entrada.nextInt();
				switch(operar){
				case 1:
				f2.masmenos();
				break;
					
				case 2:
				f2.operacionacion();
				
				break;
			default:
			System.out.println("Valor no valido");
			break;
			}
	
		}
			System.out.println("Pulse 1 si desea volver al inicio del programa,\notra tecla si desea finalizar el programa");	
			finicio=entrada.nextInt();
		}
		}
}
		

	


