
public class Calcapp {
public static void main(String[] args) {
	Calculadora calc = new Calculadora ();
//	System.out.println("suma");
	System.out.println (calc.suma ("20.9", "33.44", "2.8", "77.88", "41.22"));
	
//	System.out.println("suma");
//	System.out.println (calc.suma (2,4));
	
//	System.out.println("suma");
//	System.out.println (calc.suma (2,2,2));
	
//	System.out.println("suma");
//	System.out.println (calc.suma (2.2, 2.3));
	
//	System.out.println("suma");
//	System.out.println (calc.suma (2.2, 2.3, 3.4));
	
	calc.mostrarResultado(calc.suma("4", "2", "78.6"));
	calc.mostrarResultado(calc.suma(3,4));
	calc.mostrarResultado(calc.suma(5,2,8));
	calc.mostrarResultado(calc.suma(2.2, 2.5));
	calc.mostrarResultado(calc.suma(2.2, 2.5, 4.2));
}

}
