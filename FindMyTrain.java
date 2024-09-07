package FindMyTrain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrain {
    public static void main(String[] args) {

        TrainService trainService = new TrainService();

        //add new station
        Station station1 = new Station("ST01","Agra");
        Station station2 = new Station("ST02","Jaipur");
        Station station3 = new Station("ST03","Sikar");
        Station station4 = new Station("ST04","Churu");

        //add new train
        Train train1 = new Train("TR01","Express Train","Express");
        Train train2 = new Train("TR02","Rajdhani Train","Rajdhani");
        Train train3 = new Train("TR03","Dehli Train","Dehli");
        Train train4 = new Train("TR04","Dolly Train","Dolly");

        //add platform
        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);
        Platform platform3 = new Platform(3);
        Platform platform4 = new Platform(4);

        platform1.setTrain(train1);
        platform2.setTrain(train2);
        platform3.setTrain(train3);
        platform4.setTrain(train4);


        List<Platform>platformList = new ArrayList<Platform>();
        platformList.add(platform1);
        platformList.add(platform2);
        platformList.add(platform3);
        platformList.add(platform4);

        station1.setPlatformList(platformList);
        Schedule schedule1 = new Schedule(train1,station1, LocalDateTime.now(),LocalDateTime.now(),platform1);
        Schedule schedule2 = new Schedule(train2,station2, LocalDateTime.now(),LocalDateTime.now(),platform2);

        trainService.addTrain(train1);
        trainService.addTrain(train2);
        trainService.addTrain(train3);
        trainService.addTrain(train4);

        trainService.addStation(station1);
        trainService.addStation(station2);
        trainService.addStation(station3);
        trainService.addStation(station4);

        trainService.addSchedule(schedule1);
        trainService.addSchedule(schedule2);


        //find train between id
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source !");
        String source = scanner.nextLine();

        System.out.println("Enter the destination !");
        String destination = scanner.nextLine();

        List<Schedule> byTrains = trainService.findByTrains(source, destination);
        System.out.println("Your train between "+source+" to "+destination);
        System.out.println(byTrains.get(0));

    }
}
