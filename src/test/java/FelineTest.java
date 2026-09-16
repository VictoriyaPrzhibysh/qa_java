import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testFelineGetFamily() throws Exception {

        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void testFelineEatMeat() throws Exception {

        List<String> resultEatMeat = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, resultEatMeat);

    }

    @Test
    public void testFelineGetKittensDefault() throws Exception {

        assertEquals(1, feline.getKittens());

    }

    @Test
    public void testFelineGetKittensArgumentFour() throws Exception {

        assertEquals(4, feline.getKittens(4));
    }
    
}
