import com.edsoncruz.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void testSoma(){
        int valor1 = 1;
        int valor2 = 2;
        int resultado = Calculadora.soma(valor1,valor2);
        assertEquals(3, resultado,0.01);
    }
    @Test
    public void testSubtrai(){
        int valor1 = 6;
        int valor2 = 3;
        int resultado = Calculadora.subtrai(valor1,valor2);
        assertEquals(3, resultado,0.01);
    }
    @Test
    public void testMultiplica(){
        int valor1 = 8;
        int valor2 = 5;
        int resultado = Calculadora.multiplica(valor1,valor2);
        assertEquals(40, resultado,0.01);
    }
    @Test
    public void testDivide(){
        int valor1 = 10;
        int valor2 = 2;
        int resultado = Calculadora.divide(valor1,valor2);
        assertEquals(5, resultado,0.01);
    }
}