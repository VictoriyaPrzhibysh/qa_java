import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void testFeline() throws Exception {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());

        List<String> resultEatMeat = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, resultEatMeat);

        assertEquals(1, feline.getKittens());

        assertEquals(4, feline.getKittens(4));
    }






}
