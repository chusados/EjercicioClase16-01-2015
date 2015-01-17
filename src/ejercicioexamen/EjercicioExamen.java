package ejercicioexamen;
public class EjercicioExamen {
    public static void main(String[] args) {
        
        new EjercicioExamen().prueba();
        
    }

    
    public void prueba(){
        
        Vehicle vehicle = new Vehicle(1800,200,Type.DIESEL);
        showAtributes(vehicle);
        Car car = new Car(true,2000, 300, Type.GASOLINE);
        showAtributes(car);
        Bus bus = new Bus(22,1600, 240, Type.GASOLINE);
        showAtributes(bus);

    }
    public void showAtributes(Vehicle vehicle){
        System.out.println(vehicle.getClass());
        System.out.println("Power: " +vehicle.getPower());
        System.out.println("CC: " + vehicle.getEngine().getCubicCapacity());
        System.out.println("Type: " + vehicle.getEngine().getType());
    }
    public void showAtributes(Car car){
        showAtributes((Vehicle)car);
        System.out.println("Air: "+ car.hasAir());
    }
    public void showAtributes(Bus bus){
        showAtributes((Vehicle)bus);
        System.out.println("Seats: "+ bus.getSeats());
    }

    
}
