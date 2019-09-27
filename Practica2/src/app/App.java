package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a ,b , operacion, res;

        Scanner data = new Scanner(System.in);

        System.out.println("Introduzca el primer valor");
        a = data.nextInt();
        System.out.println("Introduzca el segundo valor");
        b = data.nextInt();

        System.out.println("Introduzca la operacion a realizar");
        System.out.println("1) Suma\n2) Resta\n3) Multiplicacion\n4) Division");
        operacion = data.nextInt();

        Calculadora calc = new Calculadora(a, b);

        switch (operacion) {
            case 1:
                res = calc.Suma();
                break;
            case 2:
                res = calc.Resta();
                break;
            case 3:
                res = calc.Multiplicacion();
                break;
            case 4:
                res = calc.Division();
                break;
            default:
                System.out.println("Opcion no valida");
                res = 0;
                break;
        }

        System.out.println("El resultado de la operacion es: " + res);

        


        data.close();
    }
}