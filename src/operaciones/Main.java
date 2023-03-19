package operaciones;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int []array= {0,3,5,3,1,7,8,3,9,3};
		int result=Identify.devolverLasVecesDeNumRepetido(array, 2);
		//System.out.println(result);
	    int []arreglo=Identify.devolverPosicionesDelValor(array, 3);
		System.out.println(Arrays.toString(arreglo));
		int result2=Identify.devolverNumPrevio(array, 4);
		//System.out.println(result2);

	}

}
