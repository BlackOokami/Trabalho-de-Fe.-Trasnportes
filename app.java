
import java.text.DecimalFormat;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		circulo circulo1 = new circulo();
		
		DecimalFormat df = new DecimalFormat("#,###.00");
			
		Scanner leitor = new Scanner (System.in);
			
			circulo1.ler();
			circulo1.condu�ao();
			circulo1.convec();
			circulo1.radia��o();
			circulo1.temperatura();
			circulo1.imprimir();
	
			
	}

}
