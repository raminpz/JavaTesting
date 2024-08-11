package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    void testSumar() {
        // Given - Teniendo
        int numA = 2;
        int numB = 3;
        // When - Cuando
        int result = example.sumar(numA, numB);

        // Then - Entonces
        assertEquals(5, result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    void testCheckPositivo() {
        // Given
        int num = 1;
        // When
        boolean result = example.checkPositivo(num);
        // Then
        assertTrue(result);
    }
    @Test
    void testCheckPositivoError() {
        // Given
        int num = -1;
        // Then
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(num));
    }


    @Test
    void testContarLetrasA() {
        // Given
        String str = "hola como estas muchacho mal de amor";
        // When
        int result = example.contarLetrasA(str);
        // Then
        assertEquals(5, result);
        assertNotNull(result);
    }

    @Test
    void testContieneElemento(){
        // Given
        List<String> list = List.of("hola", "como", "estas", "muchacho", "mal", "de", "amor");
        String element = "muchacho";
        // When
        boolean result = example.contieneElemento(list, element);
        // Then
        assertTrue(result);
    }

    @Test
    void testRevertirCadena() {
        // Given
        String str = "hola";
        // When
        String result = example.revertirCadena(str);
        // Then
        assertEquals("aloh", result);
    }

    @Test
    void testFactorial() {
        // Given
        int num = 5;
        // When
        long result = example.factorial(num);
        // Then
        assertEquals(120, result);
    }
    @Test
    void testFactorialError() {
        // Given
        int num = -5;
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> example.factorial(num));
    }

    @Test
    void TestEsPrimo() {
        // Given
        int num = 5;
        // When
        boolean result = example.esPrimo(num);
        // Then
        assertTrue(result);

    }
    @Test
    void TestEsPrimoMenorQueUno() {
        // Given
        int num = 1;
        // When
        boolean result = example.esPrimo(num);
        // Then
        assertFalse(result);
    }
    @Test
    void TestNoEsPrimo() {
        // Given
        int num = 8;
        // When
        boolean result = example.esPrimo(num);
        // Then
        assertFalse(result);
    }
    @Test
    void TestEsPrimoMayorACuatro() {
        // Given
        int num = 7;
        // When
        boolean result = example.esPrimo(num);
        // Then
        assertTrue(result);

    }

    @Test
    void TestMensajeConRetraso() throws InterruptedException {
        // When
        String result = example.mensajeConRetraso();
        // Then
        assertEquals("Listo después de retraso", result);
    }

    @Test
    void TestConvertirAString() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // When
        List<String> result = example.convertirAString(numbers);
        // Then
        assertEquals(List.of("1", "2", "3", "4", "5"), result);
    }

    @Test
    void TestCalcularMedia() {
        // Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // When
        double result = example.calcularMedia(numbers);
        // Then
        assertEquals(3.0, result);
    }
    @Test
    void TestCalcularMediaNull() {
        // Given
        List<Integer> numbers = null;
        // When -Then
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(numbers));
        //

    }
    @Test
    void TestCalcularMediaEmpty() {
        // Given
        List<Integer> numbers = List.of();
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(numbers));

    }

    @Test
    void testConvertirListaAString() {
        // Dado una lista con varios elementos
        List<String> lista = Arrays.asList("java", "spring", "webflux");

        // Cuando se llama al método convertirListaAString
        String resultado = example.convertirListaAString(lista);

        // Entonces el resultado debería ser una cadena en mayúsculas separada por comas
        assertEquals("JAVA,SPRING,WEBFLUX", resultado);
    }
}