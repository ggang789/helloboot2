package tobyspring.helloboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@HellobootTest
public class HelloRepositoryTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        assertThat(helloRepository.findHello("JR")).isNull();
    }

    @Test
    void increaseCount() {
        assertThat(helloRepository.countOf("JR")).isEqualTo(0);

        helloRepository.increaseCount("JR");
        assertThat(helloRepository.countOf("JR")).isEqualTo(1);

        helloRepository.increaseCount("JR");
        assertThat(helloRepository.countOf("JR")).isEqualTo(2);
    }
}
