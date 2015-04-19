package hello;

public class HelloMessenger implements Messenger {
    @Override
    public String compose() {
        return "Greetings from Sample Application!";
    }
}
