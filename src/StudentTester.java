public class StudentTester {
    public static void main(String[] args)
    {
        //char[] pillbox=new char[7];
        //array of StudentDemo objects
        
        StudentDemo s1=new StudentDemo("Raghav Sharma");
        StudentDemo s2=new StudentDemo("Akshay Gh");
        StudentDemo s3= new StudentDemo("Ark");
        
        
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
   

