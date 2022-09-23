// Submit form to servlet in Java
Index.html

<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Form Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            .container{
                width: 30%;
                border: 1px solid black;
                margin:auto;
                padding:20px;
                font-size:20px
            }
            #myform table tr td input{
                font-size:20px
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>My Form</h1>
            <form id="myform" action="RegisterServlet" method="post"> // action m dete h servlet ka URL pattern jis servlet pe hme form submit krna h, method s btate h
                <table>                                               // ki kis method s form submit hoga like POST kyuki data hm post kr rhe h 
                    <tr>
                        <td>Enter your name</td>
                        <td> <input type="text" name="user_name" placeholder="Enter here"/></td>
                    </tr>
                    <tr>
                        <td>Enter your password</td>
                        <td> <input type="password" name="user_password" placeholder="Enter here"/></td>
                    </tr>
                    <tr>
                        <td>Enter your email</td>
                        <td> <input type="email" name="user_email" placeholder="Enter here"/></td>
                    </tr>
                    <tr>
                        <td>Select Gender</td>
                        <td> <input type="radio" name="user_gender" value="male">Male &nbsp;&nbsp; <input type="radio" name="user_gender" value="female">Female</td>
                    </tr>
                    <tr>
                        <td>
                            Select Your course
                        </td>
                        <td>
                            <select name="user_course">
                                <option value="Java">Java</option>
                                <option value="Python">Python</option>
                                <option value="JS">JS</option>
                                <option value="Node">Node</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">
                            <input type="checkbox" value="checked" name="condition"/>
                        </td>
                        <td>
                            Agree term and conditions
                        </td>
                    </tr>
                    <tr>
                        <td>
                            
                        </td>
                        <td>
                            <button type="submit">Register</button>
                            <button type="reset">Reset</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
web.xml

<?xml version="1.0" encoding="UTF-8"?>

<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	 xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	 version="3.1">
      <!-- Servlet declaration-->
    <servlet>
        <servlet-name>register</servlet-name>
        <servlet-class>com.myform.RegisterServlet</servlet-class>
    </servlet>
     <!-- Mapping-->
    <servlet-mapping>
        <servlet-name>register</servlet-name>
        <url-pattern>/RegisterServlet</url-pattern>
    </servlet-mapping>
    <session-config>
        <session-timeout>
            30
        </session-timeout>
    </session-config>
</web-app>

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Servlet code RegisterServlet.java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myform;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;



public class RegisterServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>Welcome to register Servlet</h1>");
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String cond=request.getParameter("condition");
        
       out.println(cond);
       if(cond!=null)
       {
        
        if(cond.equals("checked"))
        {
           out.println("<h2>Name: " + name + "<h2>"); 
            out.println("<h2>Password: " + password + "<h2>"); 
             out.println("<h2>Email: " + email + "<h2>"); 
              out.println("<h2>Gender: " + gender + "<h2>");
               out.println("<h2>Course: " + course + "<h2>"); 
        }
        else
        {
            out.println("<h2> You have not accepted the conditions</h2>");
        }
       } else
        {
              out.println("<h2> You have not accepted the conditions</h2>");  
                }
    }
}


