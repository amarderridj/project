package Java;

public class Grades_student extends INPUT {

	public static void main(String[] args) {
		

		int marks;
		marks = INPUT.input();
		if((marks>=90)&&(marks<=100)) {System.out.println("the grade of the student is A");}
		else if ((marks>=80)&&(marks<=89)) {System.out.println("the grade of the student is B");}
		else if ((marks>=70)&&(marks<=79)) {System.out.println("the grade of the student is C");}

	}

}
