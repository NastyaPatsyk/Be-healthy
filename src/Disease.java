import java.util.ArrayList;

public class Disease {
    private String name;
    private ArrayList<String> symptoms;

    public Disease(String name, ArrayList<String> symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    public float getMatch(ArrayList<String> userSympt) {
        int counter = 0;
        for(int i=0; i<userSympt.size(); i++) {
            if(symptoms.contains(userSympt.get(i))) counter++;
        }
        return (float)counter/(float)userSympt.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }
}
