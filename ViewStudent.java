import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewStudent {

    public static void viewStudents(){

        try{

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from students");

            while(rs.next()){

                System.out.println(
                        rs.getInt("id")+" "+
                        rs.getString("name")+" "+
                        rs.getString("course")+" "+
                        rs.getString("email")
                );

            }

        }

        catch(Exception e){
            System.out.println(e);
        }

    }
}