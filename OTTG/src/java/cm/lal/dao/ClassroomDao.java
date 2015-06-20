/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.lal.dao;

import cm.lal.model.Classroom;
import cm.lal.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ClassroomDao {

    private Connection conn = null;

    public ClassroomDao() {
        conn = DbUtil.getConnection();
    }

    public void addClassroom(Classroom classroom) throws SQLException {
        PreparedStatement prep = conn.prepareStatement(
                "insert into classroom(idclassroom,room_location,capacity) "
                + " values (?,?,?)");
        // insert parameter values starting with 1
        prep.setString(1, classroom.getIdclassroom());
        prep.setString(2, classroom.getRoomLocation());
        prep.setInt(3, classroom.getCapacity());
        int returnValue = prep.executeUpdate();
        if (returnValue != 0) {
            System.out.println("success with " + returnValue + " rows affected");
        } else {
            System.out.println("success with no return values from SQL");
        }
    }

    public void deleteClassroom(String classID) throws SQLException {
        PreparedStatement prep = conn.prepareStatement(
                "delete from classroom where idclassroom=?");

        prep.setString(1, classID);
        int returnValue = prep.executeUpdate();
        if (returnValue != 0) {
            System.out.println("success with " + returnValue + " rows affected");
        } else {
            System.out.println("success with no return values from SQL");
        }
    }

    public void updateClassroom(Classroom classroom) throws SQLException {
        PreparedStatement prep = conn.prepareStatement(
                "update classroom set room_location=?, capacity=? where "
                + "idclassroom=?");

        prep.setString(1, classroom.getRoomLocation());
        prep.setInt(2, classroom.getCapacity());
        prep.setString(3, classroom.getIdclassroom());
        int returnValue = prep.executeUpdate();
        if (returnValue != 0) {
            System.out.println("success with " + returnValue + " rows affected");
        } else {
            System.out.println("success with no return values from SQL");
        }
    }

    public Classroom getClassroomById(int idclass) {
        Classroom classroom = new Classroom();
        String queryString = "select * from classroom where idclassroom=" + idclass;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString);
            if (rs.next()) {
                classroom.setIdclassroom(rs.getString("idclassroom"));
                classroom.setRoomLocation(rs.getString("room_location"));
                classroom.setCapacity(rs.getInt("capacity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classroom;
    }
    
    public List<Classroom> getAllClassrooms() {
        List<Classroom> classes = new ArrayList();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from classroom");
            while (rs.next()) {
                Classroom classroom = new Classroom();
                classroom.setIdclassroom(rs.getString("idclassroom"));
                classroom.setRoomLocation(rs.getString("room_location"));
                classroom.setCapacity(rs.getInt("capacity"));
                classes.add(classroom);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classes;
    }
}
