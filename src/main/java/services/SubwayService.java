package services;

import config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.TrainRepository;

@Component
public class SubwayService {
    private TrainRepository trainRepository;
    @Autowired
    public void setTrainRepository(TrainRepository trainRepository){
        this.trainRepository = trainRepository;
    }

    private ApplicationConfig applicationConfig;
    @Autowired
    public void setApplicationConfig(ApplicationConfig applicationConfig){
        this.applicationConfig = applicationConfig;
    }
}
