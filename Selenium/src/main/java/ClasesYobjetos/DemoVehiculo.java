package ClasesYobjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
	Vehiculo minivan = new Vehiculo();
	

	int rango;
	//Asignando valores a los campos de mini van
	 minivan.pasajeros = 9;
	 minivan.capacidad = 15;
	 minivan.kmh = 20;
	 
	 //Calcular el rango
	 rango = minivan.capacidad * minivan.kmh;
	 System.out.println("La minivan puede llevar " + minivan.pasajeros + 
			 " pasajeros con un rango de " + rango + " kilometros");
	
	}

}
