import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;

@Tag("auto")
public class AutoTest {

    private Auto standaardAuto;

    @BeforeEach
    void setUp() {
        this.standaardAuto = new Auto("porsche");
    }

    @Test
    public void constructorAuto_AutoKlassen_IFClassIsAAuto() {
        // Arrange
        Class<Auto> expected = Auto.class;
        // Act
        Auto result = this.standaardAuto;

        // Assert
        assertThat(result, isA(expected));
    }

    @Test
    public void constructorAuto_AutoKlassenWIthPorsche_IfClassIsAuto() {
        // Arrange
        Class<Auto> expected = Auto.class;
        // Act
        Auto result = this.standaardAuto;

        // Assert
        assertThat(result, isA(expected));
    }

    @Test
    public void getMerkEnType_MerkPorscheEnType911_IFAutoIsAPorcheche911() {
        // Arrange
        Auto auto = this.standaardAuto;
        String expected = "Porsche 911";
        //Act
        this.standaardAuto.setType("911");
        String result = auto.getMerkEnType();

        // Assert
        assertThat(result, is(expected));
    }

    @Test
    public void setType_MerkPorscheEntype211_IfAutoIsPorsche211() {
        // Arrange
        Auto auto = this.standaardAuto;
        String expected = "Porsche 211";

        // Act
        this.standaardAuto.setType("211");
        String result = auto.getMerkEnType();
        // Assert
        assertThat(result, is(expected));
    }

    @Test
    public void getMerkEnType_MerkPandaEnType911_IFAutoIsAPanda911() {
        // Arrange
        Auto auto = new Auto("panda");
        String expected = "panda 911";
        //Act
        auto.setType("911");
        String result = auto.getMerkEnType();

        // Assert
        assertThat(result, is(expected));
    }
}
