package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationId;
    private String getStationName;
    private List<Platform>platformList;


    public Station(String stationId, String getStationName) {
        this.stationId = stationId;
        this.getStationName = getStationName;
        this.platformList = new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getGetStationName() {
        return getStationName;
    }

    public void setGetStationName(String getStationName) {
        this.getStationName = getStationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", getStationName='" + getStationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
