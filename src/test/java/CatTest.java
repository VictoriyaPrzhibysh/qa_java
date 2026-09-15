import com.example.Cat;
import com.example.Predator;
import org.junit.Before;
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

    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(predator);
    }

    @Test
    public void testCatGetSound() throws Exception {

    assertEquals("Мяу", cat.getSound());

    }

    @Test
    public void testCatEatMeat() throws Exception {

        when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = cat.getFood();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);


    }



}
