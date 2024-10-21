import java.util.List;
import java.util.ArrayList;
class Blockchain {
    private static Blockchain instance;
    private List<Block> chain;

    // Конструктор для створення ланцюга блоків
    public Blockchain() {
        this.chain = new ArrayList<>();
        // Додати генезис-блок
        addBlock(new Block(0, System.currentTimeMillis(), "Genesis Block", "0"));
    }

    // Метод для додавання нового блоку до ланцюга
    public void addBlock(Block newBlock) {
        newBlock.setPreviousHash(getLatestBlockHash());
        chain.add(newBlock);
    }

    // Метод для отримання хеша останнього блоку в ланцюзі
    private String getLatestBlockHash() {
        if (!chain.isEmpty()) {
            return getLatestBlock().getHash();
        } else {
            return "0";
        }
    }

    // Метод для отримання останнього блоку в ланцюзі
    protected Block getLatestBlock() {
        return chain.get(chain.size() - 1);
    }

    public void printBlockchain() {
        for (Block block : chain) {
            System.out.println("Block #" + block.getIndex());
            System.out.println("Timestamp: " + block.getTimestamp());
            System.out.println("Data: " + block.getData());
            System.out.println("Previous Hash: " + block.getPreviousHash());
            System.out.println("Hash: " + block.getHash());
            System.out.println();
        }
    }
    public static synchronized Blockchain getInstance() {
        if (instance == null) {
            instance = new Blockchain();
        }
        return instance;
    }



    public List<Block> getChain() {
        return chain;
    }
    // Інші методи для взаємодії з блокчейном, такі як перевірка валідності ланцюга, тощо.
}
