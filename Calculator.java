import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a la calculadora");
        System.out.print("Ingrese el primer número: ");
        int primerNumero = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = sc.nextInt();
        
        System.out.println("\nLos resultados son:");
        int suma = add(primerNumero, segundoNumero);
        int resta = sub(primerNumero, segundoNumero);
        int multiplicacion = mul(primerNumero, segundoNumero);
        double division = div(primerNumero, segundoNumero); 
        int modulo = mod(primerNumero, segundoNumero);
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El módulo es: " + modulo);
        
        sc.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        if (b == 0) {
            System.out.println("ERROR: División entre cero no permitida");
            return 0;
        }
        return (double) a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public double div (int a, int b) {
	if(b==0){
		System.out.println("ERROR:División entre cero no permitida");
		return 0;
	}
	return (double) a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}