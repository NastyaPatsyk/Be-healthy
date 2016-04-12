import java.util.ArrayList;
import java.util.Arrays;

public class UserRequest implements StringParserable {
    String req;

    public UserRequest(String req) {
        this.req = req;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public ArrayList<String> parse(final String input) throws StringParseException {
        if(input.contains("|") || input.contains("#") || input.contains("&") || input.contains("*")) throw new StringParseException();
        if(input.contains(",")) {
            return new ArrayList<String>(Arrays.asList(input.split(",")));
        }
        if(input.contains(".")) {
            return new ArrayList<String>(Arrays.asList(input.split(".")));
        }
        return new ArrayList<String>(){{add(input);}};
    }

    public ArrayList<String> getUserSymptoms() throws StringParseException{
        return parse(req);
    }
}
