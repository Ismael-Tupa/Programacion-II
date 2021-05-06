package actividad;
import java.util.Scanner;

public class usuario {
	Scanner entrada = new Scanner(System.in);
	private String user, pass;
	public usuario() {
		System.out.println("Ingrese Usuario");
		this.user = entrada.nextLine();
		System.out.println("Ingrese Contraseña");
		this.pass = entrada.nextLine();
	}
	public void setuser(String a){
		this.user = a;
	}
	public void setpass(String a){
		this.pass = a;
	}
	public String getuser(){
		return this.user;
	}
	public String getpass(){
		return this.pass;
	}

}
