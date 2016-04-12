import java.util.ArrayList;

public interface StringParserable {
    ArrayList<String> parse(String input) throws StringParseException;
}
