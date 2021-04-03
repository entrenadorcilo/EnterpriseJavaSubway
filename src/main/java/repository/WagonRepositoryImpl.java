package repository;

import domain.Wagon;
import org.springframework.stereotype.Repository;

@Repository
public class WagonRepositoryImpl implements WagonRepository {

    @Override
    public void addWagon(Wagon wagon) {
        wagon = new Wagon();
    }
}
