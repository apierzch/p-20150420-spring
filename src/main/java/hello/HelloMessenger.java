package hello;

import org.springframework.stereotype.Component;

@Component
public class HelloMessenger implements Messenger {
    @Override
    public Message compose() {
        return new Message("me@invalid", "you@invalid", "Greetings from Sample Application!");
    }
}
