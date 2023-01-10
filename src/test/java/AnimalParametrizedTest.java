import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {


    private String kindOfAnimal;
    private List<String> expectedList;


    public AnimalParametrizedTest(String kindOfAnimal, List<String> expectedList){
        this.kindOfAnimal=kindOfAnimal;
        this.expectedList=expectedList;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    // Параметризованный тест на возврат списка еды в зависимости от вида животных

    @Test
    public void getFoodReturnsListOfFoodTest () throws Exception {
        Animal animal = new Animal();
        assertEquals(expectedList, animal.getFood(kindOfAnimal));
    }

}
