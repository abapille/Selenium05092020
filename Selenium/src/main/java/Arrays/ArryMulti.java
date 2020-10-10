package Arrays;

public class ArryMulti {

	public ArryMulti() {
	}
	public static void main(String[] args) {
		//Declarar e inicializar un array 2D
		int arr [][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		//La primera posicion es el array y la segunda es la posicion dentro del array
		System.out.println(arr[2][1]);
		System.out.println(arr[0][0]);
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		
		System.out.println();
		}
		
		
		
	}
		
		
		
	}

