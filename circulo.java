import java.text.DecimalFormat;
import java.util.Scanner;

public class circulo {
	double temp;
	double tempf;
	double radi;
	double a;
	double r = 0.13;
	double h = 2.05;
	double perimetro;
	double temp1;
	double convec;
	double Q;
	double pi = 3.14;
	
	circulo(){
		
	}

	Scanner leitor = new Scanner (System.in);

	public void conduçao() {
		a = 2*pi*r*h;
		temp1 = a*0.8*(temp-tempf);
		
	}

	
	public void convec()	{
		a = 2*pi*r*h;
		convec = a*0.78*(temp-tempf);
		
	}
		
	public void radiação() {
		a = 2*pi*r*h;
		radi = a*0.16*(temp-tempf);
		
	}
	
	public void temperatura() {
		
		Q = (temp1+convec+radi)/temp;
	

		
	}
	
	public void imprimir(){
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Temperatura após condução: " + temp1);
		
		System.out.println("Temperatua após convecção: " + convec);
		
		System.out.println("Temperatura após radiação: " + radi);
		
		System.out.format("Tempo para esfriar: " + df.format(Q) + " Horas" );
	
	}
	


	public void ler(){
	System.out.println("Informe a temperatura Inical:");
		 temp = leitor.nextDouble();
	System.out.println("Informe a temperatura Final:");
		tempf = leitor.nextDouble();
	
	}
}
