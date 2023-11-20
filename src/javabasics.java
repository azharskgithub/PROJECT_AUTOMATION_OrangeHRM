
public class javabasics {
public static void main(String[] args) {
	
String[] str2 = {"ok","well","not ok","you","i think"};
String[] str = new String[6];
str[0]="ok1"; 
str[1]="ok2"; 
str[2]="ok3"; 
str[3]="okk"; 
str[4]="ok go"; 
str[5]="ok no"; 

//for(int i=5; i<str.length; i++) 
//{

  //  System.out.println(str[i]);


//}
//for(String s:str2) 
//{

  //  System.out.println(s);


//}
	
int[] int1 = new int[6];
int1[0]=5; 
int1[1]=4; 
int1[2]=14; 
int1[3]=125; 
int1[4]=4568; 
int1[5]=586;


for(int s:int1) 
{
if (s % 2 == 0)
{
	System.out.println(s);
}
else
{
	System.out.println(s + " is not a multiple of 2");
	break;		
			
}	

//learn split and trim





String U = "i am the best";
String[] splittedstring = U.split("the");
System.out.println(splittedstring);










}



	
	
	
	
} 

}
