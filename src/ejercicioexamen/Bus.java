package ejercicioexamen;

public class Bus extends Vehicle{
    private final int seats;

    public Bus(int seats, double power, double cubicCapacity, Type type) {
        super(power, cubicCapacity, type);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
    

    

}
