import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)

public class LionParameterizedTest {

    private String sex;
    private boolean expected;

    public LionParameterizedTest(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getManeData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    // Параметризованный тест на создание объекта Льва с гривой или без в зависисимости от его пола

    @Test
        public void doesHaveManeTest () throws Exception {
        Lion lion = new Lion (sex, new Feline());
        assertEquals(expected, lion.doesHaveMane());
    }


}
