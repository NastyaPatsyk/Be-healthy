import java.util.ArrayList;

public class SeriousDisease extends Disease {

    private ArrayList<String> firstAid ;
    private ArrayList<String> recommendations;

    public SeriousDisease(String name, ArrayList<String> symptoms) {
       super(name, symptoms);
    }

    public ArrayList<String> getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(ArrayList<String> firstAid) {
        this.firstAid = firstAid;
    }

    public ArrayList<String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(ArrayList<String> recommendations) {
        this.recommendations = recommendations;
    }
}
