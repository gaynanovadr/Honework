package CoreHW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> worldsList = new ArrayList<>(Arrays.asList("Lena", "Kate", "Jane", "James", "Eva", "Eva", "Mia", "Den", "Eva", "Nika", "Danny", "Nina", "Diana", "Lola", "Ari", "Jhon", "Sacha", "Diana"));
        HashSet<String> uniqueWorlds = new HashSet<>(worldsList);
        System.out.println(uniqueWorlds); // print unique worlds
        HashMap<String, Integer> amountOfWorldsHM = new HashMap<>(); // counting amount: key-world, value-amount

        for (int i = 0; i < worldsList.size(); i++) {
            if (amountOfWorldsHM.containsKey(worldsList.get(i))) {
                amountOfWorldsHM.put(worldsList.get(i), amountOfWorldsHM.get(worldsList.get(i)) + 1);
            } else {
                amountOfWorldsHM.put(worldsList.get(i), 1);
            }
        }
        System.out.println(amountOfWorldsHM); // print amount of worlds
        System.out.println("***********Task2**************");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "89174567");
        phoneBook.add("Smith", "891756985678");
        System.out.println(phoneBook);

    }
}
