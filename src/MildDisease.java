import java.util.ArrayList;

public class MildDisease extends Disease {

    private ArrayList<String> advices;

    public  MildDisease(String name, ArrayList<String> symptoms) {
        super(name, symptoms);
    }

    public ArrayList<String> getAdvices() {
        return advices;
    }

    public void setAdvices(ArrayList<String> advices) {
        this.advices = advices;
    }
}
