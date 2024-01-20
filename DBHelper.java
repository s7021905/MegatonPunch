import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private String filePath;

    public DBHelper(String filePath) {
        this.filePath = filePath;
    }

    static class ScoreRecord {
        int id;
        String playerName;
        int score;
        String date;

        ScoreRecord(int id, String playerName, int score, String date) {
            this.id = id;
            this.playerName = playerName;
            this.score = score;
            this.date = date;
        }
    }

    public List<ScoreRecord> readScores() {
        List<ScoreRecord> scores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String playerName = parts[1].trim();
                    int score = Integer.parseInt(parts[2].trim());
                    String date = parts[3].trim();
                    scores.add(new ScoreRecord(id, playerName, score, date));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return scores;
    }

    public void writeScore(int id, String playerName, int score) {
        // 現在の日付を取得
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(id + "," + playerName + "," + score + "," + currentDate);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
