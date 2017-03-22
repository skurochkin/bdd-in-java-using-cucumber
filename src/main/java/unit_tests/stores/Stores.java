package unit_tests.stores;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slavkurochkin on 3/22/17.
 */
public class Stores {
    private int location;

    public void setLocation(int location) {
        this.location = location;
    }

    public void sell(String product) {
    }

    public List<String> getProduct() {
        List<String> result = new ArrayList<String>();
        result.add("Computer Cords");
        return result;
    }
}
