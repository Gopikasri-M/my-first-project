import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if(ch==1){

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                AddStudent.addStudent(name,course,email);

            }

            else if(ch==2){

                ViewStudent.viewStudents();

            }

            else if(ch==3){

                System.out.print("Enter Student ID to delete: ");
                int id=sc.nextInt();

                DeleteStudent.deleteStudent(id);

            }

            else{

                break;

            }

        }

    }

}