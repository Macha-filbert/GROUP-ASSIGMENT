
package conditional_statement.using.pkgwhile.loop;

import java.util.*;

public class CONDITIONAL_STATEMENTUSINGWHILELOOP {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        boolean running=true;
         Conditionals Co=new Conditionals();
         Operational  Op =new  Operational();
         while(running){
             System.out.println("PLEASE ENTER \n"
                     +"1 for addition\n"
                     + "2 for substraction\n"
                     + "3 for multiplication\n"
                     + "4 for division\n"
                     + "5 to check whether number is even or odd\n"); 
             int choice;
             choice=sc.nextInt();
             switch(choice){
                 case 1:
          System.out.println("please enter a number a\n");  
          Op.a=sc.nextInt();
          System.out.println("please enter a number b\n");
          Op.b=sc.nextInt();
        Op.addition();
        break;
        
        case 2:
            System.out.println("please enter a number a\n");  
          Op.a=sc.nextInt();
          System.out.println("please enter a number b\n");
          Op.b=sc.nextInt();
            Op.substraction();
            break;
            
        case 3:
            System.out.println("please enter a number a\n");  
          Op.a=sc.nextInt();
          System.out.println("please enter a number b\n");
          Op.b=sc.nextInt();
            Op. product();
            break;
            
        case 4:
            System.out.println("please enter a number a\n");  
          Op.a=sc.nextInt();
          System.out.println("please enter a number b\n");
          Op.b=sc.nextInt();
            Op.division();
            break;
            
        case 5:
            System.out.println("please enter a number to check\n");  
          Co.c=sc.nextInt();
          
            Co.iseven();
            
            break;
             }

         }
        
    }
    
}
