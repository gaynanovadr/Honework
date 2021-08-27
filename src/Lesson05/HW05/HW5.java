package Lesson05.HW05;

public class HW5 {
    public static void main(String[] args) {

        Employer firstEmployer = new Employer("Lena", "QA Engineer", "gfdgf@me.com", 891734567, 35, 45000 ); // task2

        firstEmployer.showInfo(); //task3

        Employer [] emplArray = new Employer[5]; //task4
        emplArray [0] = new Employer("Petrov", "tester", "hghj@gmail.com", 34567, 45, 56000);
        emplArray [1] = new Employer ("Ivanov", "intern", "ivanov@gmail.com", 3455657, 23, 39000);
        emplArray [2] = new Employer ("Purin", "boss", "purrinv@gmail.com", 367777, 66, 398000);
        emplArray [3] = new Employer ("Medeved", "lead eng", "medvefd@gmail.com", 345656557, 39, 99000);
        emplArray [4] = new Employer ("Branov", "senior dev", "branov@mail.ru", 891734557, 38, 169000);

        for (int i=0; i < emplArray.length; i++) { //task5
            if (emplArray [i].getAge() > 40) {
                emplArray [i].showInfo();
            }
        }
        System.out.println(emplArray[1].getEmail());
        emplArray[1].setSalary(1000000);
        System.out.println(emplArray[1].getSalary());

    }
}
