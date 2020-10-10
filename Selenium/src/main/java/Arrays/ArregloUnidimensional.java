package Arrays;

public class ArregloUnidimensional {

	public ArregloUnidimensional() {
	
	}

	public static void main(String[] args) {
		
		//Son declaraciones validas
		int intArray[];
		int[] intArray2;
		
		//Tipos de datos
		byte arraybyte[];
		short shotarray[];
		char charArray[];
		
		//Declaracion de arrays de strings
		String[] arr;
		
		//Asignar memoria para 5 strngs
		arr = new String[5];
		
		//Iniciar el priner elemento.
		arr[0] = "rojo";
		arr[1] = "azul";
		arr[2] = "morado";
		arr[3] = "verde";
		arr[4] = "blanco";
		
		//accediendo al elemento del array
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + ":" + arr[i]);
			
		}
		
			

	}

}
