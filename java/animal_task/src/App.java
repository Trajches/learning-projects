package AufgabeTier;

public class App {

    public static void main(String[] args) {

        Hund meinHund = new Hund("Rex", 5.0, 50);

        printStatus(meinHund);

        meinHund.bellen();
        meinHund.springen();
        meinHund.wachsen();

        printStatus(meinHund);
    }

    private static void printStatus(Hund hund) {
        System.out.println("Name: " + hund.getName());
        System.out.println("Gewicht: " + hund.getGewichtInKg() + " kg");
        System.out.println("Größe: " + hund.getGroesseInCm() + " cm");
        System.out.println("-----------------------");
    }
}
