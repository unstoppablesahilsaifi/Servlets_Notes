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
