import java.util.List;

public class Task {
    public static void main(String[] args) {
        Count c = new Count("textforwords.txt");
        List<String> result = c.getResult();
        for (String wordRes : result) {
            System.out.println(wordRes);
        }
    }
}
