
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/* 1) Crear (instanciacion)............  [HECHO]
 * 2) Llenar (inicializacion)............  [HECHO]
 * 3) obtener inicio............  [HECHO]
 * 4) obtener fin............  [HECHO]
 * 5) obtener cantidad de elementos............  [HECHO]
 * 6) Mostrar todos los elementos.............  [HECHO]
 * 7) Mostrar elemento del inicio.............  [HECHO]
 * 8) Mostrar elemento del fin.............  [HECHO]
 * 9) Aumentar tamaño del arreglo.............  [HECHO]
 * 10) Dismnuir tamaño del arreglo.............  [HECHO]
 * 11) Insertar elemento en posicion especifica
 * 12) Eliminar elemento de posicion especifica
 * 13) Invertir el vector
 * */

class VectorEspecial{
	
	// declaracion
	private int edades[];
	private int tamaño;
	Scanner entrada = new Scanner(System.in);
	
	public VectorEspecial() {}
	// 1
	public VectorEspecial(int tamaño) {
		// creacion
		this.edades = new int[tamaño];
	}
	
	// 2
	public void llenarVector() {
		for(int i=(tamaño==0)?0:tamaño; i<edades.length; i++) {
			System.out.println("Ingresa edad " + (i+1) + ": ");
			edades[i] = entrada.nextInt();
			tamaño++;
		}
	}
	
	// 3
	public int obtenerFin() {
		return 0;
	}
	
	// 4
	public int obtenerInicio() {
		return edades.length-1;
	}
	
	// 5
	public int obtenerCantidadDeElementos() {
		return edades.length;
	}
	
	// 6
	public void mostrarVector() {
		System.out.println(Arrays.toString(edades));
	}
	
	// 7
	public void mostrarElementoInicio() {
		System.out.println(edades[0]);
	}
	
	// 8
	public void mostrarElementoFin() {
		System.out.println(edades[this.tamaño-1]);
	}
	
	// 9
    public void aumentarTamaño() throws IOException{
		System.out.println("Introduce el tamaño extra: ");
		byte aumento = entrada.nextByte();
    	
		if(aumento>0) {
			int edadesTemp[] = edades.clone();
		    edades = new int[edades.length+aumento];
		    
		    for(int i=0; i<edadesTemp.length; i++) {
			    edades[i] = edadesTemp[i];
		    }
		}else {
			throw new IOException("Ya se acabo el juego, no se poner ninguna marca");
		}
		
	}
	
    // 10
	public void disminuirTamaño(int decremento) {
		
		if(decremento>0) {
			int edadesTemp[] = edades.clone();
			edades = new int[edades.length-decremento];
			
			for(int i=0; i<edades.length; i++) {
				edades[i] = edadesTemp[i];
			}
		}else if(decremento==edades.length) {
			edades = new int[0];
		}
		
	}
	
}


public class PruebaVectorEspecial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		VectorEspecial ve = new VectorEspecial();
		byte opcion;
		boolean candado = false;
		
		do {
			System.out.print("Introduce una opcion:\n"
			+ "1) Crear nuevo array\n"
			+ "2) Llenar array\n"
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
			default:
				System.out.println("\nNo existe esa opcion, por favor vuelve a intentarlo");
			}
		
		}while(candado!=true);
		
		System.out.println("\nSe termino");
	}

}
