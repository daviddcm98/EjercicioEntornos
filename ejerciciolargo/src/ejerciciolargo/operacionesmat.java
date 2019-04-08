package ejerciciolargo;
import java.util.Scanner;
public class operacionesmat {
	public double operacion;
	Scanner entrada=new Scanner(System.in);
 public operacionesmat() {
	this.operacion=operacion;
}
 public void masmenos() {
	 double num1, num2, num3;
	 System.out.println("Introduce 3 numeros distintos");
	 
		num1=entrada.nextDouble();
		num2=entrada.nextDouble();
		num3=entrada.nextDouble();
		if((num1>num2)&&(num1>num3)&&(num2>num3)){
		System.out.println(+num1+ " > " +num2+ " > " +num3);
		}
		else if((num1>num2)&&(num1>num3)&&(num3>num2))
		System.out.println(+num1+ " > " +num3+ " > " +num2);
		else if((num2>num1)&&(num1>num3)&&(num2>num3))
		System.out.println(+num2+ " > " +num1+ " > " +num3);
		else if((num2>num1)&&(num2>num3)&&(num3>num1))
		System.out.println(+num2+ " > " +num3+ " > " +num1);
		else if((num3>num1)&&(num1>num2)&&(num3>num2))
		System.out.println(+num3+ " > " +num1+ " > " +num2);
		else if ((num3==num1)||(num3==num2)||(num1==num2))
		System.out.println("No se admiten numeros iguales");
		else 
		System.out.println(+num3+ " > " +num2+ " > " +num1);
		
 }
public void operacionacion() {
	 double num1, num2, num3, contador=1;
	System.out.println("Introduce un numero");
	num1=entrada.nextDouble();
	System.out.println("Introduce la potencia a la que elevar el numero");
	num2=entrada.nextDouble();
	num3=num1;
		while(contador<num2){
		num3=num3*num1;
		contador++;
		}
	System.out.println("El resultado es: " +num3);
	
}
}
