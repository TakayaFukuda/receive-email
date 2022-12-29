package jp.co.example.receive.email;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class ReceiveEmailApplicationTest {
    @Test
    public void testApplication() {
        final String actual = "test";
        final String expected = "test";
        assertThat(actual, is(expected));
    }
}
