package dev.arturo;

import dev.arturo.models.SolarSistem;
import dev.arturo.models.enums.TypeOfPlanet;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        SolarSistem vegeta = new SolarSistem("Vegeta", 10, 5.972E24, 1.08321E12, 12742, 1_000_000_000, TypeOfPlanet.GASEOUS, false);

        SolarSistem namek = new SolarSistem("Namek", 3, 4.867E24, 9.2843E11, 12104, 1_500_000_000, TypeOfPlanet.DWARF, false);

        System.out.println(vegeta.toString());

        System.out.println(vegeta.calcPlanetDensity(vegeta));

        System.out.println(namek.toString());

        System.out.println(namek.calcPlanetDensity(namek));

    }
}
