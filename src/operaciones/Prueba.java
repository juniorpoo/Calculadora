package operaciones;

public class Prueba {
	
	public static boolean verificarIgualdad(double valorObtenido, double valorEsperado) {
		boolean result;
		if(valorObtenido==valorEsperado) {
			result = true;
		}
		else {
			result=false;
		}
		return result;
	}

	public static void main(String[] args) {
	
		double result1 =Calculo.sumar(23, 59);
		double result2 =Calculo.restar(45, 23);
		double result3 =Calculo.multiplicar(34, 34);
		double result4 =Calculo.dividir(32, 5);
		double result5 =Calculo.elevarNumeroAlCuadrado(25);
		double result6 =Calculo.elevarNumeroAUnaPotencia(23, 2);
		double result7 =Calculo.RaizCuadradaDeUnNumero(25);
		double result8 =Calculo.RaizCubicaDeUnNumero(27);
		double result9= Calculo.BuscarSenoDeUnNumero(9);
		double result10 =Calculo.BuscarCosenoDeUnNumero(9);
		double result11 =Calculo.BuscarTangenteDeUnNumero(45);
		double result12 =Calculo.BuscarValorAbsoluto(-34);
		boolean result=verificarIgualdad(7,5);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
	    System.out.println(result11);
		System.out.println(result12);
		System.out.println(result);
		
	}

}
