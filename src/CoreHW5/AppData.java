package CoreHW5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void readFromFile(String file) { // method to read from CSV
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer[]> tempList = new ArrayList<>();
            header = (reader.readLine().split(";")); // reading header
            String line;
            while ((line = reader.readLine()) != null) { // reading the rest lines
                String[] strArr = line.split(";");
                Integer[] intArr = new Integer[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArr[i]);
                }
                tempList.add(intArr);// filling arraylist
            }
            data = tempList.toArray(new Integer[][]{});
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
