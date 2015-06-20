/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cm.lal.dao;

import cm.lal.util.DbUtil;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class CourseTakesPlaceInClassroomDao {
    
    Connection conn = null;

    public CourseTakesPlaceInClassroomDao() {
        conn = DbUtil.getConnection();
    }
    
}
