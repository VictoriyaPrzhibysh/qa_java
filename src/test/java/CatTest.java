import com.example.Cat;
import com.example.Feline;
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
    Feline feline;

    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void testCatGetSound() throws Exception {

    assertEquals("Мяу", cat.getSound());

    }

    @Test
    public void testCatEatMeat() throws Exception {

        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = cat.getFood();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);


    }



}
