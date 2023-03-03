package operaciones;

public class Calculo {

	public static double sumar(int num1, int num2) {
		double suma;
		suma=num1+num2;
		return suma;
	}
	
	public static double restar(int num1,int num2) {
		double resta;
		resta=num1-num2;
		return resta;
	}
	
	public static double multiplicar(int num1,int num2) {
		int multiplicacion;
		multiplicacion=num1*num2;
		return multiplicacion;
	}
	
	public static double dividir(int num1,int num2) {
		int division;
		division=num1/num2;
		return division;
		
	}
	
	public static double elevarNumeroAlCuadrado(int x) {
		int cuadrado;
		cuadrado=(int)(Math.pow(x, 2));
		return cuadrado;
	}
	
	public static double elevarNumeroAUnaPotencia(int base, int exponente) {
		int potencia;
		potencia=(int)Math.pow(base, exponente);
		return potencia;
	}
	
	public static double RaizCuadradaDeUnNumero(int x) {
		int raizCuadrada;
		raizCuadrada=(int)Math.sqrt(x);
		return raizCuadrada;
	}
	
	public static double RaizCubicaDeUnNumero(int y) {
		int raizCubica;
		raizCubica=(int)Math.cbrt(y);
		return raizCubica;
	}
	
	public static double BuscarSenoDeUnNumero(double grados) {
		double convertirRadianes=Math.toRadians(grados);
		double seno=Math.sin(convertirRadianes);
		return seno;
	}
	
	public static double BuscarCosenoDeUnNumero(double grados) {
		double convertirRadianes=Math.toRadians(grados);
		double coseno=Math.cos(convertirRadianes);
		return coseno;
	}
	
	public static double BuscarTangenteDeUnNumero(double grados) {
		double convertirRadianes=Math.toRadians(grados);
		double tangente=Math.tan(convertirRadianes);
		return tangente;
				
	}
	
	public static int BuscarValorAbsoluto(double abs) {
		int valorAbs=(int)(Math.abs(abs));
		System.out.println("| "+valorAbs+" |");
		return valorAbs;
		
	}
	
}