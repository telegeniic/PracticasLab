package app;

public class Calculadora implements ICalculadora{

    public int a;
    public int b;

    Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int Suma(int a, int b) {
        return a+b;
    }

    @Override
    public int Resta(int a, int b) {
        return a-b;
    }

    public int Multiplicacion(int a, int b) {
        return a*b;
    }

    public int Division(int a, int b) {
        return a/b;
    }

    Calculadora(){

    }

    @Override
    public int Suma() {
        return a+b;
    }

    @Override
    public int Resta() {
        return a-b;
    }

    public int Multiplicacion() {
        return a*b;
    }

    public int Division() {
        if(b != 0)
            return a/b;
        else   
            System.out.println("El denominador no puede ser cero");
            return 0;
    }
}