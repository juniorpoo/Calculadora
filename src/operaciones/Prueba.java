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
	
		double result1 =Calculo.sumar(17.5, 8);
		double result2 =Calculo.restar(45, 23);
		double result3 =Calculo.multiplicar(3, 3);
		double result4 =Calculo.dividir(32, 5);
		double result5 =Calculo.elevarNumeroAlCuadrado(25);
		double result6 =Calculo.elevarNumeroAUnaPotencia(23, 2);
		double result7 =Calculo.RaizCuadradaDeUnNumero(25);
		double result8 =Calculo.RaizCubicaDeUnNumero(27);
		double result9= Calculo.BuscarSenoDeUnNumero(9);
		double result10 =Calculo.BuscarCosenoDeUnNumero(9);
		double result11 =Calculo.BuscarTangenteDeUnNumero(45);
		double result12 =Calculo.BuscarValorAbsoluto(-34);
	/*	System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
	    System.out.println(result11);*/
		
		boolean esCorrecto1=verificarIgualdad(result1,25.5);
		boolean esCorrecto2=verificarIgualdad(result2,23);
		boolean esCorrecto3=verificarIgualdad(result3,123);
		boolean esCorrecto4=verificarIgualdad(result4,6.5);
		boolean esCorrecto5=verificarIgualdad(result5,625);
		boolean esCorrecto6=verificarIgualdad(result6,529);
		boolean esCorrecto7=verificarIgualdad(result7,7);
		boolean esCorrecto8=verificarIgualdad(result8,6);
		boolean esCorrecto9=verificarIgualdad(result9,0.15643446504023087);
		boolean esCorrecto10=verificarIgualdad(result10,0.89364357467657348);
		boolean esCorrecto11=verificarIgualdad(result11,0.9999999999999999);
		boolean esCorrecto12=verificarIgualdad(result12,34.6);
		System.out.println(esCorrecto12);
		
	}

}
