import domain.Wagon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {

    static Wagon wagon;

    @Test
    public void javaTest(){
        wagon = new Wagon(100);
        List<Wagon> train = new ArrayList<Wagon>();
        train.add(wagon);
    }
}
