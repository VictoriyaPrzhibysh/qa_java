import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void testGetKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens(1)).thenReturn(3);
        Lion lion = new Lion("Самка", mockFeline);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", mockFeline);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testLionThrowsExceptionForInvalidSex() {
        Feline mockFeline = mock(Feline.class);

        try {
            new Lion("Неизвестный пол", mockFeline);
            Assert.fail("Ожидалось исключение при неверном поле, но конструктор выполнился успешно");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    e.getMessage());
        }
    }

}
