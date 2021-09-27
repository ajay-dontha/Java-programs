class Student{
String studentId;
String name;
long mobileNumber;
int age;
public void displayStudentDetails(){
System.out.println("StudentId:"+studentId);
System.out.println("Name:"+name);
System.out.println("MobileNumber:"+mobileNumber);
System.out.println("Age:"+age);
}
}
class StudentApp{
public static void main(String args[]){
Student student=new Student();
student.studentId="15UM1A531";
student.name="Aj";
student.mobileNumber=7794042900L;
student.age=24;
student.displayStudentDetails();
}
}