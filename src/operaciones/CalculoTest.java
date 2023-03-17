package operaciones;

public class CalculoTest {
	
	//Crear un metodo que reciba como parametro un arreglos de dobles
	//y devuelva El promedio de todos los numeros del arreglo. Nota: 
		//El retorno tambien debe ser un double.
	
	public static double devolverPromedio(double[] array) {
		double suma=0;
		double cantidadNum;
		
		for(int i=0;i<array.length;i++) {
			suma+=array[i];
		}
		cantidadNum=array.length;
		
	   return suma/cantidadNum;
	   
	   //return promedio;
		
	}
	
	//Crear un metodo que reciba un arreglo de dobles como argumento, 
	//y devuelva El menor de todos los numeros del arreglo
	
	public static double devolverNumMenor(double[] array) {
		
		   double numMenor=array[0];
		   
		     for(int i=0;i<array.length;i++) {
		    	 
				if(numMenor>array[i]) {
					
					numMenor=array[i];
				}
			}
		     
		     for(int i=array.length-1;i>=0;i--) {
		    	 var elem=array[i];
		     }
		
		
		return numMenor;
	}
	
	//Crear otro metodo igual pero que devuelva El mayor de todos los numeros del arreglo.
	
	public static double devolverNumMayor(double[] array) {
		double numMayor=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(numMayor<array[i]) {
				numMayor=array[i];
			}
		}
		
		return numMayor;
	}
	
	//Crear un metodo que reciba un arreglo de double y que devuelva
	//El penultimo Numero del arreglo.
	
	public static double devolverPenultimoNum(double[] array) {
		
		int penulIndice=array.length-2;
		
		double penNumero=array[penulIndice];
		
		return penNumero;
	}
	
	//Crear otro metodo que devuelva El antepenultimo Numero del arreglo
	
	public static double devolverAntePenultimoNum(double[] array) {
		
		int antesPenultimoIndice=array.length-3;
			double antPenNumero=array[antesPenultimoIndice];
		
		return antPenNumero;
	}
	
	//Crear otro metodo que devuelva El Numero que SE encuentra en El Centro del arreglo
	
	public static double devolverNumCentral(double[] array) {
		
		int indiceMedio=(array.length-1)/2;
		
		return array[indiceMedio];
		
		//return numCentro;
		
	}
	
	//Crear otro metodo que devuelva la cantidad de elementos que contiene 
	//El arreglo. Obvio El retorno debe ser un entero
	
	public static int devolverCantidadDeElementos(double[] array) {
		
		return  array.length;
		
	}
	
	//Crear otro metodo que devuelva la Suma de todos los numeros del arreglo. 
	//El retorno debe ser un double.
	
	public static double devolverSumaTotal(double[] array) {
		double sumaTotal=0;
		for(int i=0;i<array.length;i++) {
			 sumaTotal+=array[i];
		}
		return sumaTotal;
	}
	
	//Crear otro metodo que devuelva El MISMO arreglo pero con 
	//CADA uno de sus elementos multiplicados por 10
	
	public static double[] devolverArregloMultiplicadoPor10(double[] array) {
		for(int i=0;i<array.length;i++) {
			double elem=array[i];
			array[i]=elem*10;
		}
		return array;
		
	}
	
	//Crear otro metodo que multiple todos los elementos del arreglo y devuelva El total.
	//Se espero que El retorno sea un double ya que El arreglo es un arreglo de double.
	
	public static double devolverMutiplicacionTotal(double[] array) {
		double result=1;
		for(int i=0;i<array.length;i++) {
		   result=result*array[i];
			
		}
		return result;
		
	}

}
