package repository;

import domain.Wagon;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class TrainRepositoryImpl implements TrainRepository {

    @Override
    public List<Wagon> train() {
        return new LinkedList<>();
    }


}
