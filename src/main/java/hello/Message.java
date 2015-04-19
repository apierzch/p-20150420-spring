package hello;

public class Message {
    private String from;

    private String to;

    private String body;

    public Message(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }
}
