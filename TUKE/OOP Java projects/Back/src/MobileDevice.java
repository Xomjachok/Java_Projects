public class MobileDevice {
    private int id;
    private double batteryLevel;
    private double x; // координата x
    private double y; // координата y

    public MobileDevice(int id, double batteryLevel, double x, double y) {
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.x = x;
        this.y = y;
    }

    // Методи для зміни координат та рівня заряду батареї
    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Додайте інші методи та властивості за потреби
}