import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    Predator predator;


    @Test
    public void testCat() throws Exception {
    Cat cat = new Cat(predator);

    when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    List<String> food = cat.getFood();

    assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    assertEquals("Мяу", cat.getSound());

    }



}
