class Student()
{
String studentName;
int studentID;
String studentAddress;

Student insertStudentDetails(String name,int id, String address )
{  
  studentName=name;
  studentID=id;
  studentAddress=address;
}

Student printstudentDetails()
{
  System.out.println("Student name:"+studentName);
  System.out.println("Student id:"+studentID);
  System.out.println("Student address:"+studentAddress);

}
}