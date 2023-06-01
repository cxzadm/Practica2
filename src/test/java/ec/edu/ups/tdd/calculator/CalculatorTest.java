package ec.edu.ups.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c=null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass");
    }
    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("setUp()");
    }
    @Test
    public void given_two_integer_addition_when_then(){
        assertEquals(6,c.addition(4,2));
        System.out.println("Test 1");
    }
    @Test
    public void given_two_integer_when_subtraction_then_ok(){
        assertEquals(2,c.subtraccion(4,2));
        System.out.println("Test 2");
    }
    @Test (expected = ArithmeticException.class)
    public void given_two_integer_when_division_then_excepcion(){
        assertEquals(3, c.division(6,0));
        System.out.println("Test 3");
    }
    @Test(timeout = 150)
    public void given_two_interger_when_multiplication_then_timeout(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(8,c.multiplicacion(4,2));
        System.out.println("Test 4");
    }
    @AfterClass
    public static void teardownClass(){
        System.out.println("teardownClass");
    }
    @After
    public void teardown(){
        System.out.println("teardown()");
        c.setAns(0);
    }

}