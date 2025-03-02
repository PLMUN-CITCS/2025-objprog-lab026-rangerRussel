class Student{
  private  String name;
  private  int Id;
  private double gpa;
  
 private static int studentCount = 0;
 
 public Student(String name, int Id, double gpa){ // constructor
   this.name = name;
   this.Id = Id;
   this.gpa = gpa;
   
   studentCount++;
 }
 
 public void displayStudentInfo(){
   System.out.println("StudentID: " + Id + ", Name: " + name + ", GPA: " + gpa);
 }
 
 public static void displayStudentCount(){
   System.out.println("Total student: " + studentCount);
 }
} 
 
 public class StudentDemo{
    public static void main(String[] args){
    
    Student student1 = new Student("Alice", 101, 3.8);
    Student student2 = new Student("Bob", 102, 3.5);
    Student student3 = new Student("Charlie", 103, 3.9);
    
    student1.displayStudentInfo();
    student2.displayStudentInfo();
    student3.displayStudentInfo();
    
    Student.displayStudentCount();
    
   }
   
 }
 
