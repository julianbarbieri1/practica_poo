package practica_poo;

public class Main {
    public static void main(String[] args) {
        Auto honda = new Auto("HRV", "RED", 1992);
        honda.setGearBox(4);
        Auto ford = new Auto("F100", "BLUE", 2002);
        ford.setGearBox(6);
        Auto chevrolet = new Auto("CRUZE", "BLACK", 2022);
        chevrolet.setGearBox(9);

        //*************

        System.out.println("honda");
        System.out.println(honda.getModel());
        System.out.println(honda.getColor());
        System.out.println(honda.getYear());
        honda.start();
        honda.running();
        honda.stop();
        honda.getGearBox();
        System.out.println("----------------");
        System.out.println("ford");
        System.out.println(ford.getModel());
        System.out.println(ford.getColor());
        System.out.println(ford.getYear());
        ford.start();
        ford.running();
        ford.stop();
        ford.getGearBox();
        System.out.println("----------------");
        System.out.println("Chevrolet");
        System.out.println(chevrolet.getModel());
        System.out.println(chevrolet.getColor());
        System.out.println(chevrolet.getYear());
        chevrolet.start();
        chevrolet.running();
        chevrolet.stop();
        chevrolet.getGearBox();

    }
}
