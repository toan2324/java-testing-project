import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testCoSoChan() {
        assertEquals(6, Main.tinhTongChan(4));
    }

    @Test
    void testKhongCoSoChan() {
        assertEquals(0, Main.tinhTongChan(1));
    }
}
