
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
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
 * 11) Insertar elemento en posicion especifica.............  [HECHO]
 * 12) Eliminar elemento de posicion especifica.............  [HECHO]
 * 13) Invertir el vector.............  [HECHO]
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
	public void llenarVector() throws InputMismatchException{
		int edad;
		
		for(int i=(tamaño==0)?0:tamaño; i<edades.length; i++) {
			System.out.println("Ingresa edad " + (i+1) + ": ");
			edad = entrada.nextInt();
			if(edad<=0) {
				System.out.println("No puedes ingresar esa edad\n");
				i--;
			}else {
				edades[i] = edad;
				tamaño++;
			}
		}
	}
	
	// 3
	public int obtenerInicio() {
		return 0;
	}
	
	// 4
	public int obtenerFin() {
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
		System.out.println(edades[this.edades.length-1]);
	}
	
	// 9
    public void aumentarTamaño() throws InputMismatchException{
    	int aumento=0;
    	
    	while(aumento<=0) {
		    System.out.println("Introduce el tamaño extra: ");
		    aumento = entrada.nextInt();
    	
		    if(aumento>0) {
			    int edadesTemp[] = edades.clone();
		        edades = new int[edades.length+aumento];
		    
		        for(int i=0; i<edadesTemp.length; i++) {
			        edades[i] = edadesTemp[i];
		        }
		    }else {
			    System.out.println("No pueden ingresar esa cantidad de aumento");
		    }
    	}
		
	}
	
    // 10
	public void disminuirTamaño() throws InputMismatchException{
		int decremento=0;
		
		while(decremento<=0) {
		    System.out.println("Introduce el decremento: ");
		    decremento = entrada.nextInt();
		
		    if(decremento==edades.length) {
			    System.out.println("El vector debe de tener al menos un espacio");
			    edades = new int[1];
		    }else if(decremento>0) {
			    int edadesTemp[] = edades.clone();
			    edades = new int[edades.length-decremento];
			
			    for(int i=0; i<edades.length; i++) {
				    edades[i] = edadesTemp[i];
			    }
		    }else {
			    System.out.println("No pueden ingresar esa cantidad de decremento, por favor vuelve a intentarlo");
		    }
		}
		
	}
	
	// 11
	public void insertarElementoEnPosicion() throws InputMismatchException{
		byte posicion=-1;
		
		while(!(posicion>=0 && posicion<edades.length)) {
		    System.out.println("Ingresa la posicion: ");
		    posicion = entrada.nextByte();
		
		    if(posicion>=0 && posicion<edades.length) {
		    	int edad=0;
		    	
		    	while(edad<=0) {
		    		System.out.println("Ingresa edad: ");
				    edad = entrada.nextInt();
				    
				    if(edad<=0) {
				    	System.out.println("No se puede guardar esa edad");
				    }else {
				    	edades[posicion] = edad;
				    }
		    	}
		    }else {
			    System.out.println("Posicion inexistente, por favor vuelve a intentarlo");
		    }
		}
	}
	
	// 12
	public void eliminarElementoEnPosicion() throws InputMismatchException{
		byte posicion=-1;
		
		while(!(posicion>=0 && posicion<edades.length)) {
			System.out.println("Ingresa la posicion: ");
		    posicion = entrada.nextByte();
		
		    if(posicion>=0 && posicion<edades.length) {
			    edades[posicion] = 0;
		    }else {
			    System.out.println("Posicion inexistente, por favor vuelve a intentarlo");
		    }
		}
	}
	
	//13
	public void invertirVector() {
		if(edades.length>1){
		    int edadesTemp[] = edades.clone();
		    int a=0;
		
		    for(int i=edadesTemp.length-1; i>=0; i--) {
			    edades[a] = edadesTemp[i];
			    a++;
		    }
		}else {
			System.out.println("No habra efecto con un solo valor, prueba cuando tengas mas valores");
		}
	}
	
	public void limpieza() {
		System.out.println("Sera enviado al menu...\nlimpiando entradas...\nliberando memoria\n");
		entrada.nextLine();
	}
	
}


public class PruebaVectorEspecial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		VectorEspecial ve = new VectorEspecial();;
		byte opcion;
		boolean candado = false;
		
		do {
			System.out.print("Introduce una opcion:\n"
			+ "1) Crear nuevo array\n"
			+ "2) Llenar array\n"
			+ "3) Obtener inicio\n"
		    + "4) Obtener fin\n"
			+ "5) Obtener cantidad de elementos\n"
			+ "6) Mostrar todos los elementos\n"
	     	+ "7) Mostrar elemento del inicio\n"
			+ "8) Mostrar elemento del fin\n"
			+ "9) Aumentar tamaño del arreglo\n"
			+ "10) Disminuir tamaño del arreglo\n"
			+ "11) Insertar elemento en posicion especifica\n"
			+ "12) Eliminar elemento de posicion especifica\n"
			+ "13) Invertir el vector\n"
			+ "14) Salir\n"
			+ "---> ");
			
			try {
			    opcion = entrada.nextByte();
			
			    switch(opcion) {
			    case 1:
			    	int tamaño=0;
			    	
			    	while(tamaño<=0) {
			    		System.out.println("\nIntroduce tamaño del nuevo vector: ");
			    		tamaño = entrada.nextInt();
			    		if(tamaño<=0) {
			    			System.out.println("Entrada incorrecta\n");
			    		}else {
			    			ve = new VectorEspecial(tamaño);
			    		}
			    	}
			    	
				    break;
			    case 2:
			    	ve.llenarVector();
				    break;
			    case 3:
			    	System.out.println(ve.obtenerInicio());
				    break;
			    case 4:
			    	System.out.println(ve.obtenerFin());
				    break;
			    case 5:
			    	System.out.println(ve.obtenerCantidadDeElementos());
				    break;
			    case 6:
			    	ve.mostrarVector();
				    break;
			    case 7:
			    	ve.mostrarElementoInicio();
				    break;
			    case 8:
			    	ve.mostrarElementoFin();
				    break;
			    case 9:
			    	ve.aumentarTamaño();
				    break;
			    case 10:
			    	ve.disminuirTamaño();
				    break;
			    case 11:
			    	ve.insertarElementoEnPosicion();
				    break;
			    case 12:
			    	ve.eliminarElementoEnPosicion();
				    break;
			    case 13:
			    	ve.invertirVector();
				    break;
			    case 14:
				    candado=true;
				    break;
			    default:
			    	throw new InputMismatchException("Esa opcion no existe, por favor prueba de nuevo");
			    }
			}catch(InputMismatchException e) {
				System.out.println("\nEntrada invalida: <" + e + ">\n");
				entrada.nextLine();
				ve.limpieza();
			}
			System.out.println("\n-------------------------------------\n");
		}while(candado!=true);
		
		System.out.println("\nSe termino");
	}

}
