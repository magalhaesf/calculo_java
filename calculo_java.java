import java.util.Scanner;

	public class calculo_java {

		public static void main(String args[]) {

			
			Scanner sc = new Scanner(System.in);

			double primeiraNota; 
			double segundaNota;

			System.out.println("Digite a primeira nota:");
			primeiraNota = sc.nextDouble();

			System.out.println("Digite a segunda nota:");
			segundaNota = sc.nextDouble();

			double resultadoNota = (primeiraNota + segundaNota );
			
			System.out.println("\nResultados:\n");
			System.out.println(resultadoNota);
			
		}
	}