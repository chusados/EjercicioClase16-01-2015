package ejercicioexamen;

public class Car extends Vehicle{
    private boolean hasAir;

    public Car(boolean hasAir, double power, double cubicCapacity, Type type) {
        super(power, cubicCapacity, type);
        this.hasAir = hasAir;
    }

    public boolean hasAir() {
        return hasAir;
    }

    public void setHasAir(boolean hasAir) {
        this.hasAir = hasAir;
    }

}
