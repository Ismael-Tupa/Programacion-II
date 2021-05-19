package actividad;

public class vector {
	
	private String salida;
	public void mostrarV(String []a){
		for (int i=0; i<a.length ; i++){
			System.out.println(a[i]);
		}
		
	}
	public String getBE(String x,String []a){
		
		for (int i=0; i<a.length ; i++){
			if(a[i].equalsIgnoreCase(x)){
				salida = x;
			}
		}
		return salida;
	}
}
