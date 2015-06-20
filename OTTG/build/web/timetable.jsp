<%-- 
    Document   : dashboard
    Created on : Jun 18, 2015, 4:24:09 AM
    Author     : Arnold
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link type="text/css" href="css/ionic.min.css" rel="stylesheet"/>
        <link type="text/css" href="css/ottgstyle.css" rel="stylesheet"/><!---->
        <link type="text/css" href="css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>

        <div class="container">
            <div class="row" >
                <div class="Absolute-Center is-Responsive  card ">
                    <h1 style="color:white;">Administrator</h1>
                    <div class="col-sm-12 col-md-10 col-md-offset-1">

                        <form >
                            <div class="form-group input-group">
                                <div class="form-group">

                                    <h:commandButton class="btn btn-primary btn-block" type="edit" value="Create Timetable" action="index"></h:commandButton>
                                    <h:commandButton class="btn btn-primary btn-block" type="edit" value="View Timetable" action="index"></h:commandButton>
                                    <h:commandButton class="btn btn-primary btn-block" type="edit" value="Drop Timetable" action="index"></h:commandButton>
                                </div>
                            </div>
                        </form>  

                    </div
                </div>    
            </div>
        </div>
    </div>
</body>
</html>
