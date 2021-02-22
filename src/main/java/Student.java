import java.util.ArrayList;

public class Student {
    private  int ID;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int id) {
        this.name=name;
        this.ID=id;
        this.grades= new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeTotal=0;
        for (int i=0; i<grades.size(); i++){
            gradeTotal+=grades.get(i);
        }
        return gradeTotal/grades.size();
    }
}
