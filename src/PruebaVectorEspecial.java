
import java.util.Arrays;
import java.util.Scanner;

/* 1) Crear (instanciacion)
 * 2) Llenar (inicializacion)
 * 3) obtener inicio
 * 4) obtener fin
 * 5) obtener cantidad de elementos
 * 6) Mostrar todos los elementos
 * 7) Mostrar elemento del inicio
 * 8) Mostrar elemento del fin
 * 9) Aumentar tamaño del arreglo
 * 10) Dismnuir tamaño del arreglo
 * 11) Insertar elemento en posicion especifica
 * 12) Eliminar elemento de posicion especifica
 * 13) Invertir el vector
 * */

class VectorEspecial{
	
	
	
}


public class PruebaVectorEspecial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		byte opcion;
		boolean candado = false;
		
		do {
			System.out.print("Introduce una opcion:\n"
			+ "1) Crear (instanciacion)\n"
			+ "2) Llenar (inicializacion)\n"
			+ "3) obtener inicio\n"
		    + "4) obtener fin\n"
			+ "5) obtener cantidad de elementos\n"
			+ "6) Mostrar todos los elementos\n"
	     	+ "7) Mostrar elemento del inicio\n"
			+ "8) Mostrar elemento del fin\n"
			+ "9) Aumentar tamaño del arreglo\n"
			+ "10) Dismnuir tamaño del arreglo\n"
			+ "11) Insertar elemento en posicion especifica\n"
			+ "12) Eliminar elemento de posicion especifica\n"
			+ "13) Invertir el vector\n"
			+ "14) Salir\n"
			+ "---> ");
			opcion = entrada.nextByte();
			
			switch(opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				candado=true;
				break;
			}
		
		}while(candado!=true);
		
		System.out.println("\nSe termino");
	}

}
