import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestTaller4 {
    
    public TestTaller4() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testsuma() {
        int resultado = Taller4.suma(3, 2);
        int esperado = 5;
        if(esperado==5){
            System.out.println("El resultado es correcto");
        }
        else{
            System.out.println("Resultado incorrecto");
        }
        assertEquals(esperado,resultado);
             
              
    }
    
    @Test
    public void testresta() {
        int resultado = Taller4.resta(3, 2);
        int esperado = 1;
        assertEquals(esperado,resultado);
              
        }
}