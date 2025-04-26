package test.com.model;
import java.util.Objects;

public class AllocatedNumber {
    private final String color;
    private final int number;

    public AllocatedNumber(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AllocatedNumber)) {
            return false;
        }
        AllocatedNumber allocatedNumber = (AllocatedNumber) o;
        return Objects.equals(color, allocatedNumber.color) && number == allocatedNumber.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, number);
    }

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", number='" + getNumber() + "'" +
            "}";
    }
}
