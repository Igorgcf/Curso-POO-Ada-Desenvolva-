package Class07;

public class Main {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total de contadores: " + Counter.getTotal());
        System.out.println("ID do contador 1: " + c1.getId());
        System.out.println("ID do contador 2: " + c2.getId());
        System.out.println("ID do contador 3: " + c3.getId());
    }
}
