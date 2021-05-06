package actividad;
import java.util.Scanner;
public class ejercicio_1 {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			String dato[] = new String[4]; 
			
			for(int i=0 ; i<dato.length ; i++){
				System.out.println("Ingrese una oracion");
				dato[i]=entrada.nextLine();
			}
			vector array = new vector();
			array.mostrarV(dato);
		}
	}
}
