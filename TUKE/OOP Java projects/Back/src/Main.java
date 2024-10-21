pa
public class Main {
    public static void main(String[] args) {
        //Blockchain blockchain = new Blockchain();
       // for (int i = 0; i < 10; i++)
        //{
            //blockchain.addBlock(new System.Block(i, System.currentTimeMillis(), "Transaction " + i, ""));
        //}

//        blockchain.addBlock(new System.Block(2, System.currentTimeMillis(), "Transaction 2", ""));
        //blockchain.printBlockchain();

        Device device1 = new Device("Смартфон", "Мобільний");
        Device device2 = new Device("Ноутбук", "Персональний");
        Device device3 = new Device("Роутер", "Мережевий");

        // Встановлення зв'язків між пристроями у ланцюгу
        device1.setNextDevice(device2);
        device2.setPreviousDevice(device1);
        device2.setNextDevice(device3);
        device3.setPreviousDevice(device2);

        // Вивід інформації про пристрої
        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);

        // Передача даних вперед через ланцюг
        device1.sendDataForward("Дані від Смартфона");
        device2.sendDataForward("Дані від Ноутбука");

        // Передача даних назад через ланцюг
        device3.sendDataBackward("Дані від Роутера");
        device2.sendDataBackward("Дані від Ноутбука");
        device1.getBlockchain().printBlockchain();
        device2.getBlockchain().printBlockchain();
        device3.getBlockchain().printBlockchain();

//        SwingUtilities.invokeLater(() -> {
//            System.BlockchainVisualizer visualizer = new System.BlockchainVisualizer();
//            visualizer.setVisible(true);
//        });

    }
}