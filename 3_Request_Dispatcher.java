// Welcoome File List and Request Dispatcher.
/* Dekho bhai suno, basically kisi bhi website ka by default home page index.html hota h ya index.jsp but agar hmne koi file banai h home.jsp and hm is file ko as a
welcome file bnana chahte h mtlb agar koi user first time website per aaye to usee index vali file show na hokr ye vali show ho jo hmne di h home vali.
-> iske liye web.xml file m configure krke server ko btana pdega ki bhai server agar koi home page request kree to ye dena h tumeh thik h?????????????
(Apne according apni website ka home page bna skte h welcome file list ki help s) */
// To ye to hua welcome file list

//Ab dekho requet dispetcher
/*It is an interface and responsible for dispetching the request to another resource.
Suppose ek client n request ki servlet 1 per and by chance we need to send that output to another sevlet as a input to bhai ye kaam krta h dispetcher which can be done 
by forward() method.
Another method is to include() mtlb suppose kro 2 servlet h request servlet 1 per gai and output servlet 2 bhi generate kr rha h to dono ko merge krke uska reponse 
dedeta h ye*/


// Now we will see how to include the files in output.
// Complete Code
RegisterServlet.java

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
               //
               //jdbc
               //
               //saved to DB(assume krte h ki data DB m saved ho gya h and hme output chahiye ki data saved)
               // yha s hm request ko forward krdenge after saving data into DB
              RequestDispatcher rd=request.getRequestDispatcher("success");// ye URL pattern h jis servlet p req forward krni h
              rd.forward(request, response);
        }
        else
        {
            out.println("<h2> You have not accepted the conditions</h2>");
        }
       } else
        {
              out.println("<h2> You have not accepted the conditions</h2>"); 
              // agar condition null ho jati h to i want to include index.html
              //get the object of request Dispatcher.
              RequestDispatcher rd=request.getRequestDispatcher("index.html");// mtlb hme index.html include krni h
                                                                              //servlet hota to uska url pattern pass krte
              //include
              rd.include(request,response);
        }       
    }
}


---------------------------------
SuccessServlet.java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class SuccessServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("This is Success servlet");
        out.println("<h1>Successfully registered</h1>");
    }
    
}
-----------------------
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
    <servlet>
        <servlet-name>success</servlet-name>
        <servlet-class>com.myform.SuccessServlet</servlet-class>
    </servlet>
     <!-- Mapping-->
    <servlet-mapping>
        <servlet-name>register</servlet-name>
        <url-pattern>/RegisterServlet</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>success</servlet-name>
        <url-pattern>/success</url-pattern>
    </servlet-mapping>
    <session-config>
        <session-timeout>
            30
        </session-timeout>
    </session-config>
</web-app>

  
  
