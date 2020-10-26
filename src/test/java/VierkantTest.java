import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;

import java.security.InvalidParameterException;

public class VierkantTest {

    private Vierkant standaardVierkant;

    @BeforeEach
    void setUp() {
        standaardVierkant = new Vierkant(0, 0);
    }

    @Test
    public void constructorVierkant_VierkantClass_IfisAVierkant() {
        // Arrange
        Class<Vierkant> expected = Vierkant.class;

        // Act
        Vierkant result = standaardVierkant;

        // Assert
        assertThat(result, isA(expected));

    }

    @Test
    public void getOppervlakte_0_ifAreaIs0() {
        // Arrange
        int expected = 0;
        Vierkant vierkant = standaardVierkant;

        // Act
        int result = vierkant.getOppervlakte();

        // Assert
        assertThat(result, is(expected));
    }

    @Test
    public void getOperate_4_ifLengthAndWithAre2() {
        // Arrange
        int expected = 4;
        Vierkant vierkant = new Vierkant(2,2);

        // Act
        int result = vierkant.getOppervlakte();

        // Assert
        assertThat(result, is(expected));
    }

    @Test
    @Tag("figuur")
    public void constructorVierkant_FiguurClass_IfisAVierkant() {
        // Arrange
        Class<Figuur> expected = Figuur.class;

        // Act
        Figuur result = standaardVierkant;

        // Assert
        assertThat(result, isA(expected));
    }

    @Test
    public void getOpervlakte_Exception_ifLengthIs5() {
        // Arrange
        Class<InvalidParameterException> expected = InvalidParameterException.class;
        Vierkant vierkant = new Vierkant(5,2);

        // Assert
        assertThrows(expected, () -> {
            // Act
            vierkant.getOppervlakte();
        });

    }


}
