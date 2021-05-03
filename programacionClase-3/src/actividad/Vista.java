package actividad;
import java.util.Scanner;
public class Vista {
	public static void mostrarPersona(Persona p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
	}
	
	public static Persona entregarPersona(){
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("ingrese un nombre");
			String nom = scanner.next();
			System.out.println("ingrese un apellido");
			String ape = scanner.next();
			
			Persona nnPersona = new Persona(nom, ape);
			return nnPersona;
		}
	}

}
