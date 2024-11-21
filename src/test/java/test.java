import org.junit.jupiter.api.*;

public class test {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void name() {
        System.out.println("GAY");
    }

    @Test
    void nameTwo() {
        System.out.println("GAY_TWO");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }
}
