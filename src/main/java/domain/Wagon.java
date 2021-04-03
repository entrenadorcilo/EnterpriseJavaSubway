package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wagon {
    private int currCapacity;

    public Wagon(int currCapacity){
        this.currCapacity = currCapacity;
    }

    public Wagon(){
        this.currCapacity = 0;
    }



}

