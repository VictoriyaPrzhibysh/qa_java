import com.example.FelineAnimal;
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
        FelineAnimal mockFelineAnimal = mock(FelineAnimal.class);
        when(mockFelineAnimal.getKittens(1)).thenReturn(3);
        Lion lion = new Lion("Самка", mockFelineAnimal);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testFood() throws Exception {
        FelineAnimal mockFelineAnimal = mock(FelineAnimal.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(mockFelineAnimal.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", mockFelineAnimal);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testLionThrowsExceptionForInvalidSex() {
        FelineAnimal mockFelineAnimal = mock(FelineAnimal.class);

        try {
            new Lion("Неизвестный пол", mockFelineAnimal);
            Assert.fail("Ожидалось исключение при неверном поле, но конструктор выполнился успешно");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    e.getMessage());
        }
    }

}
