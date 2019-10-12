package app;

/*
clase para agregar datos que en el arreglo
*/

public class App {
    public static void main(String[] args) throws Exception {
        Man alberto = new Man();

        Man[] juanes = new Man[5];
        int[] i = new int[15];
        String[] s = new String[10];

        for (int j = 0; j < 5; j++) {
            juanes[j] = new Man();
            juanes[j].setNombre("carlos " + Integer.toString(j));
            juanes[j].setEdad("23 " + Integer.toString(j));
        }

        //Man[] r = ImprimeArreglo(juanes);
        ImpArreglo(ImprimeArreglo(juanes));
    }

    public static Man[] ImprimeArreglo(Man[] m) {
        return m;
    }

    public static void ImpArreglo(Man[] m) {
        for (Man n : m) {
            String msj = n.getNombre() + " " + n.getEdad();
            Imprimir(msj);
        }
    }

    public static void Imprimir(Object imp){
        System.out.println(imp);
    }
}