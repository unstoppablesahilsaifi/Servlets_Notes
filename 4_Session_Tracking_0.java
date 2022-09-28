/*Session tracking is a technique to maintain state(data) of an user, also known as State Management.
-> Jab bhi koi client server pe request send krta h to Http Protocol follow krta , ye protocol stateless protocol h.
suppose ek client h and ek server k, jab client ko koi page ki need hogi to ye request r1 send krega server p, server request ko accept krega, vo request servlet ko
forward ho jaygi fir is req ko servlet accept krega, process krega, dynamic response generate krega or client ko dedega.
Now, agar again client ko koi dusra page ki need hogi to dusri request send krni pdegi r2.
Jab hme pehle request bheji thi server n aisa socha tha ki ye ek new request h to mujhe home page dena chahiye per jab hm dusri request send krenge(server stateless h)
to hmara server every reuqest ko new request samjhega. to server ko ye nhi pta lg payga ki jo bnda abhi request bhej rha h ye vhi bnda h jisne pehle request ki thi.
to server 2nd request ko as a new user treat krega.*/

// Session Tracking technique
1.Coockies
2.Hidden from field
3.URL Rewriting
4.HttpSession
  
