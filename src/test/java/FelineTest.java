import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

@Test
    public void getFamilyTest(){
    Feline feline = new Feline();
    Assert.assertEquals("Кошачьи", feline.getFamily());

}

@Test
    public void getKittensWithArgumentsTest(){
    Feline felineThreeKitten = new Feline();
    int kittensCount = 3;
    Assert.assertEquals(3, felineThreeKitten.getKittens(kittensCount));
}

// Использовала Spy, так как зависимости находится внутри тестируемого класса
@Spy
Feline feline;

@Test
    public void eatMeatReturnsPredatorMealTest() throws Exception {
    Mockito.when(feline.getFood("Хищник")).
            thenReturn(List.of("Животные", "Птицы", "Рыба"));
    Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());

}

@Test
    public void getKittensWithoutArgumentsTest(){
    Mockito.when(feline.getKittens(1)).
            thenReturn(1);
        Assert.assertEquals(1, feline.getKittens());
    }


}
