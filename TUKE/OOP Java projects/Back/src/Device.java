import java.util.Date;

public class Device {
    private String name;
    private String type;
    private BaseStation baseStation;
    private Device previousDevice; // Попередній пристрій у ланцюгу
    private Device nextDevice; // Наступний пристрій у ланцюгу
    private Blockchain blockchain;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
        this.blockchain = new Blockchain();
    }

    // Геттери і сеттери для полів name, type, baseStation, previousDevice та nextDevice

    public String toString() {
        String info = "Device Name: " + name + ", Type: " + type;
        if (baseStation != null) {
            info += ", Connected to Base Station: " + baseStation.getName();
        } else {
            info += ", Not Connected to Any Base Station";
        }
        if (previousDevice != null) {
            info += ", Previous Device: " + previousDevice.getName();
        } else {
            info += ", No Previous Device";
        }
        if (nextDevice != null) {
            info += ", Next Device: " + nextDevice.getName();
        } else {
            info += ", No Next Device";
        }
        return info;
    }
    public void sendDataForward(String data) {
        if (nextDevice != null) {
            nextDevice.receiveData(data);
            blockchain.addBlock(new Block(blockchain.getChain().size() + 1, new Date().getTime(), data, blockchain.getLatestBlock().getHash()));
        } else {
            System.out.println(name + " не має наступного пристрою в ланцюзі.");
        }
    }

    public void sendDataBackward(String data) {
        if (previousDevice != null) {
            previousDevice.receiveData(data);
            blockchain.addBlock(new Block(blockchain.getChain().size() + 1, new Date().getTime(), data, blockchain.getLatestBlock().getHash()));
        } else {
            System.out.println(name + " не має попереднього пристрою в ланцюзі.");
        }
    }

    public void receiveData(String data) {
        System.out.println(name + " отримав дані: '" + data + "'");
    }

    public void setPreviousDevice(Device previousDevice) {
        this.previousDevice = previousDevice;
    }

    public void setNextDevice(Device nextDevice) {
        this.nextDevice = nextDevice;
    }

    public String getName() {
        return name;
    }
    public Blockchain getBlockchain() {
        return blockchain;
    }
}