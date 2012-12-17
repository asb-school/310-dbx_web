<%-- 
    Document   : login
    Created on : Oct 30, 2012, 3:00:00 PM
    Author     : villafan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Blue GIS</title>
    </head>
    <body>        
        <jsp:useBean id="sinfox" scope="session" class="jsf_aux.SInfo" />

        <h1>Login - Blue GIS</h1>

        <form name="login" action="login.jsp" method="POST">
            <p>Provide your credentials below to log in.</p>
            <p>ID: <input type="text" name="id" value="" size="16" /></p>
            <p>Password:<input type="password" name="password" value="" size="16" /></p>
            <input type="hidden" name="operation" value="login" />
            <input type="submit" value="Log in" name="login" />
        </form>        
        
        <hr />
        
        <form name="logout" action="login.jsp" method="POST">
            <p>Select the option below to log out.</p>
            <input type="hidden" name="operation" value="logout" />
            <input type="submit" value="Log out" name="logout" />
        </form>        
                
        <%
            String op = (String)request.getAttribute("operation");            
            //String name = request.getParameter( "username" );
            //session.setAttribute( "theName", name );        
            //session.getAttribute( "theName" )
        %>

        <%
            if(op != null && op.equals("login"))
            {
                
        %>

        <p>You selected to log in.</p>
        
        <%
            }
        %>

        <%
            if(op != null && op.equals("logout"))
            {
                
        %>

        <p>You selected to log out.</p>
        
        <%
            }
        %>
        
        
        <%
            //String name = request.getParameter( "username" );
            //session.setAttribute( "theName", name );        
            //session.getAttribute( "theName" )
        %>

        <%
            Boolean is_player_authn = (Boolean)session.getAttribute("is_player_authn");
            String req_name = (String)request.getAttribute("name");            
            //String name = request.getParameter( "username" );
            //session.setAttribute( "theName", name );        
            //session.getAttribute( "theName" )
        %>
        
        <%
            if(req_name != null && req_name.equals("admin"))
            {
                
        %>

        <p>Hello admin</p>
        
        <%
            }
        %>
        
        
        <%
            if(req_name != null && req_name.equals("user"))
            {
                
        %>

        <p>Hello user</p>
        
        
        <%
            }
        %>

        <%
            if(sinfox.getValid() == true)
            {
                
        %>

        <p>SInfo valid is true</p>
        
        <%
            }
            else
            {
        %>

            <p>SInfo valid is false</p>
            
        <%
            }
        %>
        
        
    </body>
</html>
