import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class MainTest {

    @Test
    void checkTheFormat(){
         Main testFormat = new Main();
         testFormat.parseMethod("2025-03-01T13:00:00Z");
         Main expected = new Main();
         expected.parseMethod("2025-03-01T13:00:00Z");
         assertEquals(testFormat.parseMethod("2025-03-01T13:00:00Z"),expected.parseMethod("2025-03-01T13:00:00Z"));
    }

    @Test
    void checkTheLanguage(){
        Main actual = new Main();
        Main expected = new Main();
        assertNotSame(expected.changeLanguage(), actual.parseMethod("2025-03-01T13:00:00Z"));
    }

}