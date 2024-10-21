import javax.swing.*;
import java.awt.*;
import java.util.List;

class BlockchainVisualizer extends JFrame {
    private JTextArea blockchainTextArea;

    public BlockchainVisualizer() {
        setTitle("Blockchain Visualizer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        blockchainTextArea = new JTextArea();
        blockchainTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(blockchainTextArea);
        add(scrollPane, BorderLayout.CENTER);

        updateBlockchainText();
    }

    public void updateBlockchainText() {
        blockchainTextArea.setText(getBlockchainInfo());
    }

    private String getBlockchainInfo() {
        StringBuilder info = new StringBuilder();
        List<Block> blockchain = Blockchain.getInstance().getChain();

        for (Block block : blockchain) {
            info.append("Блок #").append(block.getIndex()).append("\n");
            info.append("Час: ").append(block.getTimestamp()).append("\n");
            info.append("Дані: ").append(block.getData()).append("\n");
            info.append("Попередній Хеш: ").append(block.getPreviousHash()).append("\n");
            info.append("Хеш: ").append(block.getHash()).append("\n\n");
        }

        return info.toString();
    }

}