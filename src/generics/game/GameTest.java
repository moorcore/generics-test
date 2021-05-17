package generics.game;

public class GameTest {
    public static void main(String[] args) {
        Schoolchild schoolchild1 = new Schoolchild("Peter", 13);
        Schoolchild schoolchild2 = new Schoolchild("Tom", 12);
        Schoolchild schoolchild3 = new Schoolchild("Mary", 11);
        Schoolchild schoolchild4 = new Schoolchild("Ashe", 14);

        Student student1 = new Student("Andy", 17);
        Student student2 = new Student("Chris", 19);

        Employee employee1 = new Employee("Mark", 27);
        Employee employee2 = new Employee("Eddy", 33);

        Team<Schoolchild> schoolTeam = new Team<>("SchoolGuys");
        schoolTeam.addNewParticipant(schoolchild1);
        schoolTeam.addNewParticipant(schoolchild2);

        Team<Schoolchild> schoolTeam2 = new Team<>("BadGirls");
        schoolTeam2.addNewParticipant(schoolchild3);
        schoolTeam2.addNewParticipant(schoolchild4);

        Team<Student> studentTeam = new Team<>("CoolStudents");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("OldButGold");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolTeam.playWith(schoolTeam2);


    }
}
