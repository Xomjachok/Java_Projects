//public class BaseStation {
//    private String name;
//
//    public BaseStation(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}

public class BaseStation {
    private String name;
    private int id;
    private double x; // координата x
    private double y; // координата y
    private double transmissionPower;

    public BaseStation(String name, int id, double x, double y, double transmissionPower) {
        this.name = name;
        this.id = id;
        this.x = x;
        this.y = y;
        this.transmissionPower = transmissionPower;
    }

    // Методи для зміни координат та потужності передачі
    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public void setTransmissionPower(double transmissionPower) {
        this.transmissionPower = transmissionPower;
    }

    public String getName() {
        return name;
    }

    // Додайте інші методи та властивості за потреби
}