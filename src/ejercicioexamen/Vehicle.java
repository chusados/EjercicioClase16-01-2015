package ejercicioexamen;

public class Vehicle {
    private final double power;
    private final Engine engine;

    /*
    Constructor cuando no es una composición,
    nos pasarían Engine por parámetro
    
    public Vehicle(double power,  Engine engine){
        this.power = power;
        this.engine = engine;
    }
    */
    public Vehicle(double power, double cubicCapacity, Type type) {
        this.power = power;
        this.engine = new Engine(cubicCapacity,type);
    }

    public double getPower() {
        return power;
    }

    public Engine getEngine() {
        return engine;
    }
    
    

}
