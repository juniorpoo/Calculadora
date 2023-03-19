package operaciones;

public class Identify {
	/*Crear un metodo que tome dos parametros, (lista, valorBuscado)
	El parametro lista es UN arreglo de Numero enteros, y valorBuscado es 
	un Numero entero. El metodo va a retornar un Numero que indique cuantas veces
	valorBuscado se repite en El arreglo Lista*/
	
	public static int devolverLasVecesDeNumRepetido(int []lista, int valorBuscado) {
		
		int cantidad=0;
		for(int i=0;i<lista.length;i++) {
			if(valorBuscado==lista[i]) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	/*Otro metodo igual pero que retorne las posiciones del arreglo donde SE encuentra
	valorBuscado.Es decir ese metodo va a devolver los indices del valorBuscado. 
	Ya esta implicito que ese metodo debe devolver un arreglo*/
	
	public static int[] devolverPosicionesDelValor(int[]lista, int valorBuscado) {
		int counter=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==valorBuscado) {
				counter++;
			}
		}
		int []arregloIndice=new int[counter];
		int indice=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==valorBuscado) {
				arregloIndice[indice]=i;
				indice++;
			}
		}
		
		return arregloIndice;
	}
	
	//Otro metodo igual pero retorne El Numero que ESTA antes del valorBuscado en la lista
	
	public static int devolverNumPrevio(int []lista, int valorBuscado) {
		
		int numPrevio=0;
		for(int i=0;i<lista.length;i++) {
			if(valorBuscado==lista[i]) {
				if(i!=0) {
					numPrevio=lista[i-1];
				}
				
			}
		}
		return numPrevio;
	}

}
