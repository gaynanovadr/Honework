package CoreHW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private final HashMap<String, String> phoneBookHM = new HashMap<>();

    public void add(String name, String phone) {
        phoneBookHM.put(name, phone);
    }

    public List<String> get(String name) {
        ArrayList<String> phones = new ArrayList();
        phoneBookHM.get(name);
        return phones;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookHM=" + phoneBookHM +
                '}';
    }
}
