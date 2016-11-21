import java.util.Scanner;
/**
 * Write a description of class StudListRunnner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudListRunnner
{
    public static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("To add student type in <add>.");
        System.out.println("To delete student type in <delete>.");
        System.out.println("To edit student type in <edit>.");
        System.out.println("To print a student type in <print>.");
        System.out.println("To clear the student list type in <clear>.");
        System.out.println("To print the student list type in <list>.");
        System.out.println("To quit type in <quit>.");
        System.out.print("Enter your choice: ");
    }
    
    public static void main(String[] args) {
        boolean loop = true;
        StudList studentList = new StudList();
        while(loop) {
            printMenu();
            Scanner scr = new Scanner(System.in);
            String key = scr.nextLine();
            switch (key) {
                case "add": System.out.println("Add student \n");
                    studentList.addStudentToList( scr );
                    break;
                case "delete": System.out.println("Delete student \n");
                    studentList.deleteStudent( scr );
                    break;
                case "list": System.out.println("Printing student list... \n");
                    studentList.printList();
                    break;
                case "clear": System.out.println("Clearing student list... \n");
                    studentList.clearList();
                    break;
                case "print": System.out.println("Printing student... \n");
                    studentList.printStudent( scr );
                    break;
                case "edit": System.out.println("Edit student \n");
                    studentList.editStudent( scr );
                    break;
                case "quit": System.out.println("quit");
                    loop = false;
                    break;
                
            }
        }
    }
}
