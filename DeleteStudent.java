import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void deleteStudent(int id){

        try{

            Connection con = DBConnection.getConnection();

            String query="delete from students where id=?";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Student Deleted");

        }

        catch(Exception e){
            System.out.println(e);
        }

    }
}
