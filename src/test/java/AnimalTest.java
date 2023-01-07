import com.example.Animal;
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
        try {
            Animal animalForException = new Animal();
            String kindForException = "Неизвестный вид";
            animalForException.getFood(kindForException);
        } catch (Exception exception) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}
