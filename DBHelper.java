import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private String filePath;
    private char delimiter;

    static class ScoreRecord {
        String playerName;
        int score;

        ScoreRecord(String playerName, int score) {
            this.playerName = playerName;
            this.score = score;
        }
    }

    public DBHelper(String filePath, char delimiter) {
        this.filePath = filePath;
        this.delimiter = delimiter;
    }

    public void writeScore(String playerName, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(playerName + delimiter + score);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<ScoreRecord> readScores() {
        List<ScoreRecord> scores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(String.valueOf(delimiter));
                if (parts.length == 2) {
                    String playerName = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    scores.add(new ScoreRecord(playerName, score));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return scores;
    }

    public void initializeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // ファイルを初期化（内容をクリア）
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearScores() {
        initializeFile();
    }
}