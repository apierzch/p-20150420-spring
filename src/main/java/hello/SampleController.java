package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping()
public class SampleController {

    Messenger messenger;

    @Autowired
    public SampleController(Messenger messenger) {
        this.messenger = messenger;
    }

    @RequestMapping("/")
    public @ResponseBody Message index() {
        return messenger.compose();
    }

}

