import java.util.Locale;

public class ExercicioFixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 27;
		int cod = 5290;
		char gender = 'M';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s, whitch price is $ %.2f%n", product1, price1);
		System.out.printf("%s, whitch price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d year old, code %d and gender: %s%n", age, cod, gender);
		System.out.println();
		System.out.printf("Measue whith eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (theree decimal places): %.3f%n", measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure );
		System.out.println();
		
		

	}

}
