import java.util.*;
/**
 * Write a description of class StudList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudList
{
    List<Student> StudentList = new ArrayList<Student>();
        
    public void addStudentToList(Scanner scr) {
        Student myStudent = new Student();
        System.out.print("Enter first name: ");
        String firstName = scr.nextLine();
        myStudent.setFirstName( firstName );
        System.out.print("Enter last name: ");
        String lastName = scr.nextLine();
        myStudent.setLastName( lastName );
        System.out.print("Enter middle name: ");
        String middleName = scr.nextLine();
        myStudent.setMiddleName( middleName );
        System.out.print("Enter student number: ");
        int stuNumber = scr.nextInt();
        myStudent.setStuNumber( stuNumber );
        System.out.print("Enter GPA: ");
        double gpa = scr.nextDouble();
        myStudent.setGPA( gpa );
        System.out.println();
        StudentList.add( myStudent );
    }
    
    int findByName( String theName ) {
        int position = -1;
        Student currentStudent = null;
        for(int i = 0; i < StudentList.size(); i++) {
            currentStudent = StudentList.get(i);
            if(currentStudent.getLastName().equals(theName)){
                position = i;
            }
        }
        return position;
    }
    
    int findByNumber( int theNumber ) {
        int position = -1;
        Student currentStudent = null;
        for(int i = 0; i < StudentList.size(); i++) {
            currentStudent = StudentList.get(i);
            if(currentStudent.getStuNumber() == theNumber ){
                position = i;
            }
        }
        return position;
    }
    
    public void deleteStudent( Scanner scr ) {
        System.out.print("Enter last name: ");
        String lastName = scr.nextLine();
        int position = findByName( lastName );
        if ( position >= 0 ) {
            StudentList.remove(position);
        }
    }
    
    public void printStudent(Student theStudent) {
        System.out.println("First Name:     " + theStudent.getFirstName());
        System.out.println("Middle Name:    " + theStudent.getMiddleName());
        System.out.println("Last Name:      " + theStudent.getLastName());
        System.out.println("Student number: " + theStudent.getStuNumber());
        System.out.println("GPA:            " + theStudent.getGPA());
    }
    
    public void printList() {
        Student currentStudent = null;
        for(int i = 0; i < StudentList.size(); i++) {
            currentStudent = StudentList.get(i);
            printStudent( currentStudent );
        }

    }
    
    public void clearList() {
        StudentList.clear();
    }
    
    public void printStudent( Scanner scr ) {
        System.out.print("Enter last name: ");
        String lastName = scr.nextLine();
        Student currentStudent = null;
        for(int i = 0; i < StudentList.size(); i++) {
            currentStudent = StudentList.get(i);
            if(currentStudent.getLastName().equals(lastName)){
                printStudent( currentStudent );
            }
        }
    }

    public void editStudent( Scanner scr ) {
        System.out.println("To search by student number enter <number>");
        System.out.println("To search by last name enter <name>");
        String choice = scr.nextLine();
        int index = -1;
        switch( choice ) {
            case "number": System.out.print("Enter student number: ");
                int theNumber = scr.nextInt();
                // Remove the new line after the number
                String newLine = scr.nextLine();
                index = findByNumber( theNumber );
            break;
            case "name": System.out.print("Enter last name: ");
                String theName = scr.nextLine();
                index = findByName( theName );
            break;
        }
        if(index >= 0) {
            Student theStudent = StudentList.get(index);
            System.out.print("Enter new last name: ");
            String newName = scr.nextLine();
            theStudent.setLastName( newName );

            System.out.print("Enter new GPA: ");
            double newGPA = scr.nextDouble();
            theStudent.setGPA( newGPA );
        }
    }
}
