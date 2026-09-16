import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionTestParameters {

        private final String sex;
        private final boolean expectedHasMane;


        public LionTestParameters(String sex, boolean expectedHasMane) {
            this.sex = sex;
            this.expectedHasMane = expectedHasMane;
        }


        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(
                    new Object[]{"Самец", true},
                    new Object[]{"Самка", false}
            );
        }

        @Test
        public void testHasManeBasedOnSex() throws Exception {
            Feline mockFeline = mock(Feline.class);
            Lion lion = new Lion(sex, mockFeline);


            assertEquals(this.expectedHasMane, lion.doesHaveMane());

        }
    }
