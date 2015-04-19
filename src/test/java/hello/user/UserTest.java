package hello.user;

import static org.assertj.core.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@Transactional
public class UserTest {

    @Autowired
    UserRepository repository;

    @Test
    public void name() {
        repository.save(new User(1L, "John", "Snow"));

        assertThat(repository.findAll()).containsExactly(new User(1L, "John", "Snow"));
    }

    @Configuration
    @EnableAutoConfiguration
    static class TestConfiguration {

    }
}
