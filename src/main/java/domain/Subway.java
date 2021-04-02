package domain;

import java.util.ArrayList;
import java.util.List;

public class Subway {

    List<Train> trains;
    Line line;

    public Subway(){
        trains = new ArrayList<Train>();
        line = new Line();
    }

}
