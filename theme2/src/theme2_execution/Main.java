package theme2_execution;
import theme2_process.Message;

public class Main {
    public static void main(String[] args) {
        Message msg1 = new Message("こんにちは！ここは日本です！");
        msg1.printMessage();

        Message msg2 = new Message("この寿司はうまい");
        msg2.printMessage();

        Message msg3 = new Message("寿司は和食です");
        msg3.printMessage();

        Message.printCurrentDateTime();
    }
}

