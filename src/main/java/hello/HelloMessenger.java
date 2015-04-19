package hello;

import org.springframework.stereotype.Component;

@Component
public class HelloMessenger implements Messenger {
    @Override
    public String compose() {
        return "Greetings from Sample Application!";
    }
}
