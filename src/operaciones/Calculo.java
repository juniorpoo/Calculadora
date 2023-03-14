package operaciones;

public class Calculo {

	public static double sumar(double num1, double num2) {
		double suma;
		suma=num1+num2;
		return suma;
	}
	
	public static double restar(double num1,double num2) {
		double resta;
		resta=num1-num2;
		return resta;
	}
	
	public static double multiplicar(double num1,double num2) {
		double multiplicacion;
		multiplicacion=num1*num2;
		return multiplicacion;
	}
	
	public static double dividir(double num1,double num2) {
		double division;
		division=num1/num2;
		return division;
		
	}
	
	public static double elevarNumeroAlCuadrado(double x) {
		double cuadrado;
		cuadrado=(Math.pow(x, 2));
		return cuadrado;
	}
	
	public static double elevarNumeroAUnaPotencia(double base, double exponente) {
		double potencia;
		potencia=(Math.pow(base, exponente));
		return potencia;
	}
	
	public static double RaizCuadradaDeUnNumero(double x) {
		double raizCuadrada;
		raizCuadrada=Math.sqrt(x);
		return raizCuadrada;
	}
	
	public static double RaizCubicaDeUnNumero(double y) {
		double raizCubica;
		raizCubica=Math.cbrt(y);
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
	
	public static double BuscarValorAbsoluto(double abs) {
		double valorAbs=(Math.abs(abs));
		System.out.println("| "+valorAbs+" |");
		return valorAbs;
		
	}
	
//	create un metodo que coja como parametro un arreglo de string,
//	y que devuelva el string q tiene mas caracteres de todos
	
	public static String devolverStringConMasCaracteres(String[] array) {
		String fraseMayor="";
		for(int i=0;i<array.length;i++) {
			String frase=array[i];
			if(frase.length()>fraseMayor.length()) {
				fraseMayor=frase;
			}
		}
		return fraseMayor;
		
	}
	
}