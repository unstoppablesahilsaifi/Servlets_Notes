// Coockies
-> Coockies are the textual information which are stored in key value pair format to the client's browser during multiple requests.
  (To manage state).
// Explaination
-> Jab client server ko koi request send krta h to client every request ko as a new request treat krta h.
  When we use cookies---->>>>
  Jab koi client koi request send krega and server us client ki request ko serve krega and jab server hmara response bhej rha hoga to server response k sath kuch data 
  rakh dega here data means textual information,,,, or usi textual information ko hm coockies bolte h. fir ye coockie jaati h client ki machine m and broser m save ho
  jaati h, and jab client fir ye koi request2 send krega server per to us request k sath hmari jo coockie thi vo bhi chali jaygi or server us request s coockie ko fetch
  kar sakta h or pehchan jayga ki bhai ye vhii bnda h jisne pehle request send ki thi.
  
  
  // How to use cookies in Java
  In order to use cookies in java, there is a  Coockie class in java  present in javax.servlet.http package.
  To make coockie just create a object of  Coockie class and pass name and its value.
  
  ex- Coockie c=new Coockie("name","username");// key value pass krni hoti h
      response.addCoockie(c);// response m add krdete h.

// How to add coockie in response
To add coockie in response just use addCoockie(Coockie) method of response interface.
  
// How to fetch coockie
obvious h ki ab coockie request k sath aa rhi hogi to hme vhi s fetch krni h.
 Coockie c[]=request.getCoockie();
// isme s coockie nikalkr ek array m store kr lenge. agar kuch nhi hoga coockie to array m NULL hoga.
  
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Coockies Example
  
// Lets understand firstly use case-
Suppose there are two servlet S1 and S2 and ek home page tha index.html-> is html page m ek form tha and submit button tha and form chala jata tha S1 servlet pe
mtlb requesr r1 chali jaati thi S1 k paas with name and S1 ek response generate krta tha (Output aata tha hello sahil welcome to page 1 and go to servlet 2)
but jab hm servlet 2 pe jate the to name ko hold nhi krta tha Null show krta tha.
==>> Handle krne k liye hm res1 m name daalkr send kr denge jo client ki machine m save ho jaygi to jab r2 jaygi to cookie bhi sath jaygi then servlet will fetch
the coockie and got to know ki bhai ye vhii bnda h and output will be printed

  
  
