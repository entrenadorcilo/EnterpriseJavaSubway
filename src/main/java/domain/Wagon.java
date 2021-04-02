package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wagon {
    private String id;
    private int currCapacity;
    private int capacity;

    public Wagon(int currCapacity){
        this.currCapacity = currCapacity;
        this.capacity = 150;
    }

    public Wagon(){
        this.capacity = 150;
    }



}

