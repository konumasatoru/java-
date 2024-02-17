package theme2_process;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("今の現在日時は" + now.format(formatter) + "です");
    }
}
