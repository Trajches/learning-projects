package AufgabeTier;

public class Hund extends Tier {

    public Hund(String name, double gewichtInKg, int groesseInCm) {
        super(name, gewichtInKg, groesseInCm);
    }

    public void bellen() {
        System.out.println(name + " bellt.");
    }

    public void springen() {
        System.out.println(name + " springt.");
    }

    public void wachsen() {
        gewichtInKg += 1.0;
        groesseInCm += 5;
    }
}
