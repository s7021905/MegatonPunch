import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Scoreboards {

    // DBHelperクラスを使用してcsvファイルからスコアを読み込む
    private DBHelper dbHelper = new DBHelper("database.csv");
    private Scanner scanner;

    //コンストラクタ
    public Scoreboards(Scanner scanner) {
        this.scanner = scanner;
    }
    
    // スコアボードを表示する
    public void displayScoreBoard() {
        // csvファイルからスコアの読み込み
        List<DBHelper.ScoreRecord> scores = dbHelper.readScores();
    
        // スコアの高い順（降順）にソート
        Collections.sort(scores, Comparator.comparingInt((DBHelper.ScoreRecord s) -> s.score).reversed());
    
        // スコアを表形式で表示
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-7s %-25s %-15s %-10s\n", "順位", "プレイヤー名", "スコア", "日付");
        System.out.println("-----------------------------------------------------------------------------");
        int rank = 1;
        // スコアをforループを使って表示
        for (DBHelper.ScoreRecord score : scores) {
            // 未記入の場合の処理
            String playerName = score.playerName.isEmpty() ? "（未記入）" : score.playerName;
            System.out.printf("%-7d\t %-25s\t %-15d\t %-10s\n", rank, playerName, score.score, score.date);
            rank++;
        }
    }
       
}
