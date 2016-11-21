
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    String firstName = "";
    String middleName = "";
    String lastName = "";
    int stuNumber;
    double gpa;
    
    public void setFirstName( String newFirstName ) {
        firstName = newFirstName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setLastName( String newLastName ) {
        lastName = newLastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setMiddleName( String newMiddleName ) {
        middleName = newMiddleName;
    }
    
    public String getMiddleName() {
        return middleName;
    }

    public void setStuNumber( int newStuNumber ) {
        stuNumber = newStuNumber;
    }
    
    public int getStuNumber() {
        return stuNumber;
    }

    public void setGPA( double newGPA ) {
        gpa = newGPA;
    }

    public double getGPA() {
        return gpa;
    }
}
