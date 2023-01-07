import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexTest {

    @Test
    public void getPlaceReturnsZooTest() throws Exception {
        LionAlex alexLiving = new LionAlex();
        Assert.assertEquals("Нью-Йоркский зоопарк", alexLiving.getPlaceOfLiving());

    }

    @Test
    public void getFriendsListTest() throws Exception {
        LionAlex alexFriends = new LionAlex();
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alexFriends.getFriends());

    }

    @Test
    public void getKittensReturnsZeroTest() throws Exception {
        LionAlex alexKittens = new LionAlex();
        Assert.assertEquals(0, alexKittens.getKittens());

    }
}
