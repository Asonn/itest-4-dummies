import org.junit.jupiter.api.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;


@Tag("lont")
public class LontTest {

    private Lont standaardLont;

    @BeforeEach
    void setUp() {
        this.standaardLont = new Lont();
    }

    @Test
    public void constructorLont_ClassLont_IfALont() {
        // Arrange
        Class<Lont> expected = Lont.class;

        //Act
        Lont result = standaardLont;

        // Assert
        assertThat(result, isA(expected));
    }

    @Test
    public void isAan_True_IfIsAan() {
        // Arrange
        boolean expected = true;

        // Act
        standaardLont.steekAan();
        boolean result = standaardLont.isAan();

        // Assert
        assertThat(result, is(expected));
    }


    @Test
    public void steekAan_True_IfCalledIsAan() {
        // Arrange
        boolean expected = true;

        // Arrange
       standaardLont.steekAan();
       boolean result = standaardLont.isAan();

        // Assert
        assertThat(result, is(expected));
    }

    @Test
    public void doof_False_IfIsUit() {
        // Arrange
        boolean expected = false;

        // Act
        standaardLont.doof();
        boolean result = standaardLont.isAan();

        // Assert
        assertThat(result, is(expected));
    }

}
