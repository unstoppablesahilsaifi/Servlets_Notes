/* Servlet is a simple java program that runs on the server and capable of handling the request and generating dynamic response.
  Client(Chrome, Edge)-------------------------------------------> Server
                      <------------------------------------------
  Suppose browser pe hmne search kiya javatpoint.com to ye client ki side s ek request jaygi server pe(Mtlb home page access hoga) lekin website to dynamic h.
  To jaise hi server pe request jaygi to server pe java program hoga jo request ko accept krega or jdbc k through database s baat krke response generate krdega
  in the form of HTML kyuki browser ko html hi samjh m aati h.
  */

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Installing Apache tomcat
Servlet ko install and deploy krne s pehle hme ek server ko install krna pdega
// To Downlaod Tomcat server-  https://tomcat.apache.org/download-90.cgi
Port number is 9494 kyuki jo port number hm yha per assign krenge us port number per isi system per koi or server install nhi hona chahiye.
Apache install krte time role m comma lgakr manager-script add krna hota h.
To check ki server run ho rha h ya nhi, apne browser per localhost:9494 krke enter krdo to tomcat ka interface aa jayga means run ho rha h.
  
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Configure Apache server with Netbeans
URL- https://www.youtube.com/watch?v=hbzL22lJpp8&list=PL0zysOflRCel5BSXoslpfDawe8FyyOSZb&index=3

// Test Project
--> If the below error comes...........
/*In-place deployment at C:\Users\lostl\OneDrive\Documents\NetBeansProjects\Project3\build\web
Deployment is in progress... 
deploy?config=file%3A%2FC%3A%2FUsers%2Flostl%2FAppData%2FLocal%2FTemp%2Fcontext7180600714574256491.xml&path=/Project3
FAIL - Failed to deploy application at context path [/Project3] C:\Users\lostl\OneDrive\Documents\NetBeansProjects\Project3\nbproject\build-impl.xml:1058:
The module has not been deployed. See the server log for details. BUILD FAILED (total time: 0 seconds) */
 
Solution--> 
Check out the Windows Services (Services App) and stop the Apache Tomcat if running, then from Netbeans menu select Run->Run Project.
Netbean will start Tomcat and deploy your web app onto the Tomcat server.
  
 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  
// Creating servlet using implement Servlet
Java m ek package h javax.servlet or iske andar s interface h jiska naam h Servlet
to is interface k andar 5 methods h.
1. public abstract void init(javax.servlet.ServletConfig)
2. public ServletConfig getServletConfig(); // to get the object of servlet
3. public void service(javax.servlet.ServletRequest,javax.servlet.ServletResponse);
4. public abstract java.lang.String getServletInfo(); // to know the information of Servlet
5. public abstract void destroy();
// 1,3,5 are the Life Cycle Method


Ab hme ek user defined class bnani pdegi or is interface ko implement krke iske methods ko override krna pdega.
jaise-> class MyServlet implements Servlet
        {
        //Override the methods
        }
then hme mapping krni hogi or server ko ye batana hoga ki hmne ke servet bnaya h or us servlet ko execute kaise krna h with the help of URL pattern
// Mapping krni hoti h web.xml file m or is file ka naam hota h deployment descriptor
 
  
//Web pages k andar HTML,CSS and JavaScript ki file rakhi jaati h and sourse package k andar java ki file rakhi jaati h.
javax.servlet.*; isko import krna pdega

// Code
package com.servlets;
import javax.servlet.*;

/**
 *
 * @author admin
 */
public class FirstServlet implements Servlet {
    ServletConfig conf;
    public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("Creating object:...........");
    }
    public void service(ServletRequest req, ServletResponse resp)throws ServletException,IOException
    {
       System.out.prinln("servicing.....")
            
    }
    public void destroy()
    {
        System.out.println("going to destroy....");
    }
    //Non Life Cycle Method
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    public String getServletInfo()
    {
        return "This is created by Sahil Saifi";
    }
}

// Code(Servlet) execute krne k liye hme mapping krni h  ek xml file bnani pdegi
WEB-INF k andar web.xml file bnti h 
