package hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class HelloTest {

    @Autowired
    Messenger messenger;

    @Test
    public void composesGreetings() {
        assertThat(messenger.compose().getBody()).isEqualTo("Greetings from Sample Application!");
    }
}
