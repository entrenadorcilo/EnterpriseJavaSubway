package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Subway {

    List<Train> trains;
    List<Line> line;

    public Subway(){
        line = new ArrayList<Line>();
    }

}
