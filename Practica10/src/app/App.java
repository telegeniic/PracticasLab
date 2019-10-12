package app;

public class App {
    public static void main(String[] args) throws Exception {
        Man alberto = new Man();

        Man[] juanes = new Man[5];
        int[] i = new int[15];
        String[] s = new String[10];

        for (int j = 0; j < 5; j++) {
            juanes[j] = new Man();
            juanes[j].setNombre("carlos" + j);
            juanes[j].setEdad("23");
            System.out.println(juanes[j].getEdad());
        }
    }
}