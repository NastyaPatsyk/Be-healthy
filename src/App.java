import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static ArrayList<SeriousDisease> seriousDiseasesExample = new ArrayList<SeriousDisease>() {{
       add(new SeriousDisease("грип", new ArrayList<String>(){{
           add("лихоманка") ;
           add("головний біль");
           add("жар");
           add("слабкість");
       }}));
        add(new SeriousDisease("туберкульоз", new ArrayList<String>(){{
            add("зниження ваги") ;
            add("слабкість");
            add("кашель");
            add("висока темпереатура");
        }}));
    }};

    public static ArrayList<MildDisease> mildDiseasesExample = new ArrayList<MildDisease>() {{
        add(new MildDisease("кровотеча з носа", new ArrayList<String>(){{
            add("кровотеча з носа") ;
        }}));
        add(new MildDisease("головний біль", new ArrayList<String>(){{
            add("головний біль") ;
        }}));
    }};

    UserRequest req;
    ArrayList<SeriousDisease> seriousDiseases;
    ArrayList<MildDisease> mildDiseases;

    private void connectToDB() {}
    private void convertResults(){}

    public App(String userInput){
        req = new UserRequest(userInput);
    }

    public ArrayList<SeriousDisease> getSeriousDisease(){
        ArrayList<String> userSymptoms;
        ArrayList<SeriousDisease> result = new ArrayList<SeriousDisease>();
        connectToDB();
        try {
            userSymptoms = req.getUserSymptoms();
            for(int i=0 ; i<seriousDiseasesExample.size() ; i++) {
                if(seriousDiseasesExample.get(i).getMatch(userSymptoms) != 0.0) {
                    result.add(seriousDiseasesExample.get(i));
                }
            }
        } catch (StringParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public ArrayList<MildDisease> getMildDisease(){
        return null;
    }

}
