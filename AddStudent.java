import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudent {

    public static void addStudent(String name,String course,String email){

        try{

            Connection con = DBConnection.getConnection();

            String query="insert into students(name,course,email) values(?,?,?)";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,name);
            ps.setString(2,course);
            ps.setString(3,email);

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        }

        catch(Exception e){
            System.out.println(e);
        }

    }
}