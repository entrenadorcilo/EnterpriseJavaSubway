package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wagon {
    private int currCapacity;
    private int capacity;

    public Wagon(int currCapacity){
        this.currCapacity = currCapacity;
        this.capacity = 100;
    }

    public Wagon(){
        this.capacity = 100;
    }



}

