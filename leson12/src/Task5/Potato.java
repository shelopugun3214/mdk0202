package Task5;

import java.util.Objects;

public class Potato implements Comparable<Potato> {

    public final int id;

    public final int weight;

    public final int length;

    public final int girth;

    public Potato(int id, int weight, int length, int girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }

    @Override
    public int compareTo(Potato o) {
        return Integer.compare(this.calculateAlpha(this), o.calculateAlpha(o));
    }

    public int calculateAlpha(Potato o) {
        return (int) (o.weight * 0.5 + o.length * 0.65 + o.girth * 0.80);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return id == potato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Potato{" +
                "id=" + id +
                ", weight=" + weight +
                ", length=" + length +
                ", girth=" + girth +
                '}';
    }
}