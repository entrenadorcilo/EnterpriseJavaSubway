package domain;

import java.util.ArrayList;
import java.util.List;

public class Subway {

    List<Train> trains;
    List<Line> line;

    public Subway(){
        line = new ArrayList<Line>();
    }

}
