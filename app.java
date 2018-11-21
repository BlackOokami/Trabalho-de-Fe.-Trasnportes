
import java.text.DecimalFormat;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		circulo circulo1 = new circulo();
		
		DecimalFormat df = new DecimalFormat("#,###.00");
			
		Scanner leitor = new Scanner (System.in);
			
			circulo1.ler();
			circulo1.conduçao();
			circulo1.convec();
			circulo1.radiação();
			circulo1.temperatura();
			circulo1.imprimir();
	
			
	}

}
