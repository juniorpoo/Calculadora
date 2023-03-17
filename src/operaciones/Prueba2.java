package operaciones;
import java.util.*;
public class Prueba2 {

	public static void main(String[] args) {
		
		double []array= {12.4,67.2,76.9,5.4,32.8,51.6,100,876.5,867.3,76};
		double []arreglo= {1,2,3,4,5,6,7,8,9,10};
		double result1=CalculoTest.devolverPromedio(array);
		double result2=CalculoTest.devolverNumMenor(array);
		double result3=CalculoTest.devolverNumMayor(array);
		double result4=CalculoTest.devolverPenultimoNum(array);
		double result5=CalculoTest.devolverAntePenultimoNum(array);
		int result6=CalculoTest.devolverCantidadDeElementos(array);
		double result7=CalculoTest.devolverSumaTotal(array);
		double[] result8=CalculoTest.devolverArregloMultiplicadoPor10(array);
		double result9=CalculoTest.devolverMutiplicacionTotal(arreglo);
		System.out.println(result9);



	}

}
