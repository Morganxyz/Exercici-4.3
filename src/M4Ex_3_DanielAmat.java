import java.util.Scanner;

public class M4Ex_3_DanielAmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables:
		int edat = 0;
		boolean titolB = false;
		boolean aturB = false;
		String titol = "";
		String atur = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quina edat tens?: ");
		edat = entrada.nextInt();
	
		System.out.println("Disposes d´un títol universitari?: ");
		titol = entrada.next();
		titolB = (titol.equalsIgnoreCase("si")) ? true: false;
		
		System.out.println("Estas a l´atur?:");
		atur = entrada.next();
		aturB = (atur.equalsIgnoreCase("si")) ? true :false;
		
		if ((aturB && edat >= 16) || (titolB && (edat >=18))) {
			System.out.println("Beca atorgada, felicitats!");
		}  else {
			System.out.println("Ho sentim, no et podem atorgar la Beca, mes sort a la vida! Pau i amor!");
		}
		
	}

}
