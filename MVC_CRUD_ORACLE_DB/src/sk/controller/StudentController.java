package sk.controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sk.bean.Student;
import sk.connection.DBConn;

/**
 *
 * @author Sreekandan K
 */
public class StudentController {
    public static List<Student> getAllRecords()
    {
        List<Student> list=new ArrayList<Student>();
        try
        {
            Connection con=DBConn.getConnection();
            String sql="select*from stud_tab";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet result=ps.executeQuery();
            while(result.next())
            {
                Student st=new Student();
                st.setRno(result.getInt("rno"));
                st.setSname(result.getString("s_name"));
                st.setDept(result.getString("dept"));
                list.add(st);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception at StudentController.getAllRecords()"+e.getMessage());
        }
        return list;
    }
    public static int insert(Student st)
    {
        int status=0;
        try
        {
            Connection con=DBConn.getConnection();
            String sql="insert into stud_tab(rno,s_name,dept)values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,st.getRno());
            ps.setString(2,st.getSname());
            ps.setString(3,st.getDept());
            status=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("Exception at StudentController.insert()"+e.getMessage());
        }
        return status;
    }
    public static Student getRecordByRno(int r)
    {
        Student st=null;
        try
        {
            Connection con=DBConn.getConnection();
            String sql="select*from stud_tab where rno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,r);
            ResultSet result=ps.executeQuery();
            while(result.next())
            {
                st=new Student();
                st.setRno(result.getInt("rno"));
                st.setSname(result.getString("s_name"));
                st.setDept(result.getString("dept"));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception at StudentController.getRecordByRno()"+e.getMessage());
        }
        return st;
    }
    public static int update(Student st)
    {
        int status=0;
        try
        {
            Connection con=DBConn.getConnection();
            String sql="update stud_tab set s_name=?,dept=? where rno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,st.getSname());
            ps.setString(2,st.getDept());
            ps.setInt(3,st.getRno());
            status=ps.executeUpdate();
        }
        catch(Exception e)
        {
             System.out.println("Exception at StudentController.getupdate()"+e.getMessage()); 
        }
        return status;
    }
    public static int delete(int r)
    {
        int status=0;
        try
        {
            Connection con=DBConn.getConnection();
            String sql="delete from stud_tab where rno=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,r);
            status=ps.executeUpdate();
        }
        catch(Exception e)
        {   
             System.out.println("Exception at StudentController.getdelete()"+e.getMessage()); 
        }
        return status;
    }   
}