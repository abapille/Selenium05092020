package Metodos;

public class Metodo {

	public Metodo() {

	}

	public static void main(String[] args) {
		int resultado = suma(3,4);
		System.out.println(resultado);
		
		
		int resultado2 = suma1(9,20,45);
		System.out.println(resultado2);
		
		int resultado3 = suma2(200,3450);
		System.out.println(resultado3);
		
		String marca = carro(1);
		System.out.println(marca);
		
	}
	public static int suma(int a, int b) {
		int c = a+b;
		return c;
	}
	public static int suma1(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}	//Metodo de sobrecarga	
	public static int suma2(int a, int b) {
		int c = a+b;
		return c;
				
	}
	public static String carro(int a) {
		String [] cars = {"volvo","BMW","Ford", "Mazda"};
		return cars [a];
		
		
		
	}
}
