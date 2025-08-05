package Class07;

public class Counter {

    private static int total = 0; // Variável de classe
    private int id;

    public Counter() {
        total++;
        id = total;
    }
    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }
}
