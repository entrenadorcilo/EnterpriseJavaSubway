package domain;

import java.util.List;

public class Train {

    private boolean isInDepot;
    List<Wagon> train;

    public Train(List<Wagon> train){
        this.train = train;
    }


}
