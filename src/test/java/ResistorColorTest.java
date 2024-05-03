import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ResistorColorTest {
    private ResistorColor resistorColor;

    @BeforeEach
    public void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        int expected = 0;

        int actual = resistorColor.colorCode("black");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testWhiteColorCode() {
        int expected = 9;

        int actual = resistorColor.colorCode("white");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testOrangeColorCode() {
        int expected = 3;

        int actual = resistorColor.colorCode("orange");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testColors() {
        String[] strings = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        String[] actual = resistorColor.colors();

        assertThat(actual).containsExactly(strings);
    }

    @Test
    public void testInvalidColor() {
        Class<IllegalArgumentException> expectedException = IllegalArgumentException.class;

        Executable actualException = () ->
                resistorColor.colorCode("hello");

        assertThrows(expectedException, actualException);
    }
}
