import org.junit.jupiter.api.Test;

import dev.arturo.models.SolarSistem;
import dev.arturo.models.enums.TypeOfPlanet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 

public class SolarSistemTest {

    SolarSistem planet = new SolarSistem("Earth", 21, 20.0, 10.0, 21, 32, TypeOfPlanet.TERRESTRIAL, true);

    @Test
    void testCalcPlanetDensity() {
        assertThat(planet.calcPlanetDensity(planet), is(2.0));
    }
}
