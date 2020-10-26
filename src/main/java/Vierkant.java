import java.security.InvalidParameterException;

public class Vierkant implements Figuur {

    private int length = 0;
    private int width = 0;

    public Vierkant(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getOppervlakte() {
        if (length == 5) {
            throw new InvalidParameterException();
        }
        return length * width;
    }
}
