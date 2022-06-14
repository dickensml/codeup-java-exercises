package vehicle;


public class Vehicle {

    private String vehicleName;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public static void main(String[] args) {
        System.out.println();
    }

    public void makeNoise(){
        System.out.println("Vroom vroom");
    }
}
