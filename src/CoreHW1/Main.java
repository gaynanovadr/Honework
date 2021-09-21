package CoreHW1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course("run 100 m", "swim 50m", "cycle 3km"); // Создаем препятствия вариант1
        Course[] c2 = {new Course(100), new Course(30), new Course(70)}; // Создаем препятствия вариант2
        // Какой вариант создания массива предпочтительнее?

        Team team1 = new Team("Winners", "Ivan", "Petr", "Alex", "Lena"); // Создаем команду
        Team team2 = new Team("Losers", "Anton", "Kate", "Anna", "Diana"); // Создаем команду

        team1.showInfo(); // инфо о всех участниках через метод
        System.out.println(team2); // инфо о всех через переопределенный toString

        c.doIt(team1);

        for (int i = 0; i < c2.length; i++) { // бегут по препятс
            team1.run(c2[i].getLength());
            team2.run(c2[i].getLength());
        }

        team1.showResults(); // показываем результаты
    }

}

