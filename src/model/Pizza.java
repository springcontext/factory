package model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String crust;

    private List<String> garnish;

    Pizza() {
        this.garnish = new ArrayList<>();
    }

    Pizza(String crust, List<String> garnish) {
        this.crust = crust;
        this.garnish = garnish;
    }

    public String getCrust() {
        return crust;
    }

    public List<String> getGarnish() {
        return garnish;
    }

    void addGarnish(String garnish) {
        this.garnish.add(garnish);
    }

    void setCrust(String crust) {
        this.crust = crust;
    }

    void setGarnish(List<String> garnish) {
        this.garnish = garnish;
    }

    @Override
    public String toString() {
        String result = "{";

        result += "\"crust\": \"" + crust + "\",";

        if (garnish != null && !garnish.isEmpty()) {

            result += "\"garnish\": [";

            for (String g : garnish) {
                result += "\"" + g + "\",";
            }

            result = Pizza.removeLastCharacter(result);

            result += "]";
        } else {
            result = Pizza.removeLastCharacter(result);
        }
        result += "}";

        return result;
    }

    private static String removeLastCharacter(String str) {
        str = str.substring(0, str.length() -1);
        return str;
    }
}
