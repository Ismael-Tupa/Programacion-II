package actividad;

import java.util.Vector;
public class ejercicio_2 {
	public static void main(String[] args) {

		
		Vector<String> v_1 = new Vector<String>(4);
		Vector<String> v_2 = new Vector<String>(4);
		v_1.addElement("Daiana");
		v_1.addElement("Osvaldo");
		v_1.addElement("Facundo");
		v_1.addElement("Melina");
		v_2.addElement("1234");
		v_2.addElement("4321");
		v_2.addElement("1122");
		v_2.addElement("3344");
				
		int op = 0;
		do{
			usuario p_1 = new usuario();
			
			for(int i=0; i<v_1.size(); i++){
				if((v_1.elementAt(i).equals(p_1.getuser())&&(v_2.elementAt(i).equals(p_1.getpass())))){
					op = 1;
				}
			}
			if(op == 0){
				System.out.print("Error al iniciar !!\n" +
						"Intentelo nuevamente ");
			
			}else{
				System.out.println("Inicio de secion correcto :)\n\n" +
						"Usuario: "+p_1.getuser()+ "\n"+
						"Contraseña: "+p_1.getpass());
				op = 3;
			}
		}while(op != 3);
	}
}
