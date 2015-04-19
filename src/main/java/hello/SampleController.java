package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    Messenger messenger;

    @Autowired
    public SampleController(Messenger messenger) {
        this.messenger = messenger;
    }

    @RequestMapping("/")
    public String index() {
        return messenger.compose();
    }

}

