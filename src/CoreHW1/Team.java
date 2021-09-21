package CoreHW1;

import java.util.Arrays;

public class Team implements Runnable {

    private String title;
    private String[] arrTeam = new String[4];
    private String first;
    private String second;
    private String third;
    private String fourth;

    public Team(String title, String first, String second, String third, String fourth) {
        this.title = title;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.first = first;
        this.arrTeam[0] = first;
        this.arrTeam[1] = second;
        this.arrTeam[2] = third;
        this.arrTeam[3] = fourth;
    }
    public void run(int length) { // метод бега из интерфейса
        System.out.println("Team '" + title + "' runs " + length + " meters.");
    }
    void showResults() {
        System.out.println("Team '"+ title + "' finished!");
    }
    void showInfo() {
        System.out.println("Team " + title + ": " + first + ", " + second + ", " + third + ", " + fourth);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Team " +
                "title='" + title + '\'' +
                ", members of Team = " + Arrays.toString(arrTeam);
    }
}
