import com.example.Animal;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void getFamilyTest(){
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    // Тест на возврат исключения с проверкой возвращаемого текста

    @Test
    public void getFoodReturnsException() {

        Exception thrown = Assert.assertThrows(Exception.class, () -> {
            Animal animalForException = new Animal();
            String kindForException = "Неизвестный вид";
            animalForException.getFood(kindForException);
        });

        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());

    }
}
