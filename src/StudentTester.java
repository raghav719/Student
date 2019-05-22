/*Author: Raghav Sharma
*/
public class StudentTester {
    public static void main(String[] args)
    {
        //array of StudentDemo objects
        
        StudentDemo s1=new StudentDemo("Raghav Sharma",991544076);
        StudentDemo s2=new StudentDemo("Akshay Gh",991544077);
        StudentDemo s3= new StudentDemo("Ark",991544078);
        
        
        StudentDemo[] list=new StudentDemo[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName());
        }
        
        }
        
    }
   

