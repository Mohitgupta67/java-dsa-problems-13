class Students {
    String Name;
    int Rollno;
    int Marks;
    char Grade;

    Students(String Name, int Rollno, int Marks, char Grade) {
        this.Name = Name;
        this.Rollno = Rollno;
        this.Marks = Marks;
        this.Grade = Grade;

    }

}

public class Oops {
    public static void main(String args[]) {
        Students s1 = new Students("Rahul", 101, 85, 'A');
        System.out.println("Name:" + s1.Name);
        System.out.println("Rollno:" + s1.Rollno);
        System.out.println("Marks:" + s1.Marks);
        System.out.println("Grade:" + s1.Grade);

        Students s2 = new Students("Abhay Chand", 50, 20, 'D');
        System.out.println("\nName" + s2.Name);
        System.out.println("Rollno:" + s2.Rollno);
        System.out.println("Marks:" + s2.Marks);
        System.out.println("Grade" + s2.Grade);

    }
}