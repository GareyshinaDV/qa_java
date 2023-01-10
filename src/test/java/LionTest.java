import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodReturnsListOfPredatorMealTest() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
                Mockito.when(feline.getFood("Хищник")).
                thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());

    }

    @Test
    public void getKittensReturnsOneTest() throws Exception {
        String sex = "Самец";
        Lion lionKitten = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lionKitten.getKittens());
    }

    // Тест на возврат исключения с проверкой возвращаемого текста
    @Test
    public void getExceptionCreatingNewLion() {

        Exception thrown = Assert.assertThrows(Exception.class, () -> {
            new Lion("Гибрид", feline);
        });

        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());

    }



}
