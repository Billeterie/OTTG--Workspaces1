///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package cm.lal.dao;
//
//import cm.lal.model.Dean;
//import cm.lal.util.DbUtil;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// *
// * @author user
// */
//public class DeanDao {
//    Connection conn = null;
//
//    public DeanDao() {
//        conn = DbUtil.getConnection();
//    }
//    public void addDean(Dean dean) throws SQLException {
//        PreparedStatement prep = conn.prepareStatement(
//                "insert into dean values (?,?,?,?,?)");
//        // insert parameter values starting with 1
//        prep.setString(1, dean.getFormerPosition());
//        prep.setInt(2, dean.getAccesslevel());
//        prep.setInt(3, dean.getDuration());
//        prep.setInt(4, dean.getFacultyIdfaculty().getIdfaculty());
//        // create a corresponding user for the dean
//        UserDao userDao = new UserDao();
//        userDao.addUser(dean.getUser());
//        // confused about which comes first.. creating the dean or the associated user
//        int returnValue = prep.executeUpdate();
//        if (returnValue != 0) {
//            System.out.println("success with " + returnValue + " rows affected");
//        } else {
//            System.out.println("success with no return values from SQL");
//        }
//    }
//
//    public void deleteDean(int IDdean) throws SQLException {
//        String userQuery = "delete from user where iduser=?";
//        String deanString = "delete from dean where user_iduser=?";
//        PreparedStatement prep1 = conn.prepareStatement(userQuery);
//        PreparedStatement prep2 = conn.prepareStatement(null)
//        prep1.setInt(1, IDdean);
//        int returnValue = prep.executeUpdate();
//        if (returnValue != 0) {
//            System.out.println("success with " + returnValue + " rows affected");
//        } else {
//            System.out.println("success with no return values from SQL");
//        }
//    }
//
//    public void updateCourse(Course course) throws SQLException {
//        PreparedStatement prep = conn.prepareStatement(
//                "update course set course_name=? where "
//                + "course_code=?");
//
//        prep.setString(1, course.getCourseName());
//        prep.setString(2, course.getCourseCode());
//        int returnValue = prep.executeUpdate();
//        if (returnValue != 0) {
//            System.out.println("success with " + returnValue + " rows affected");
//        } else {
//            System.out.println("success with no return values from SQL");
//        }
//    }
//
//    public Course getCourseById(String idCourse) {
//        Course course = new Course();
//        String queryString = "select * from course where course_code=" + idCourse;
//        try {
//            Statement statement = conn.createStatement();
//            ResultSet rs = statement.executeQuery(queryString);
//            if (rs.next()) {
//                course.setCourseCode(rs.getString("course_code"));
//                course.setCourseName(rs.getString("course_name"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return course;
//    }
//    
//    public List<Course> getAllClassrooms() {
//        List<Course> courses = new ArrayList();
//        try {
//            Statement statement = conn.createStatement();
//            ResultSet rs = statement.executeQuery("select * from course");
//            while (rs.next()) {
//                Course course = new Course();
//                course.setCourseCode(rs.getString("course_code"));
//                course.setCourseName(rs.getString("course_name"));
//                courses.add(course);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return courses;
//    }
//    
//}
