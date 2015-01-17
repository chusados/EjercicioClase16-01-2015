package ejercicioexamen;

public class Engine {
    private final double cubicCapacity;
    private final Type type;

    public Engine(double cubicCapacity, Type type) {
        this.cubicCapacity = cubicCapacity;
        this.type = type;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public Type getType() {
        return type;
    }  
    
}
