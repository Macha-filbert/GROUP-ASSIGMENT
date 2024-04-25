
package inherintance;
import java.util.*;

public class INHERINTANCE {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Helloe word---"); 
         Scanner sc =new Scanner(System.in);
        DIT di= new DIT();
        COMPUTERSTUDIES co = new COMPUTERSTUDIES();
       // co.DisplayInfo();
        //System.out.println(""); 
        //co.Leadership();
        //System.out.println("\nmention below are location preffered"); 
        //co.Location();
        //System.out.println("mention below are colored preffered"); 
        //co.Colors();

        //while(running){
        int choice;
        choice=1;
             System.out.println("MENU : \n"
                     +"1: ABOUT US\n"
                     + "2:LOCATION\n"
                     + "3:COLORS\n"
                     + "4 LEADERSHIPS\n"
                     + "5--------\n"); 
             while(choice<5){
                  System.out.println("ENTER CODE\n"); 
                  choice=sc.nextInt();
                  
                    switch(choice){
                 case 1:
          co.DisplayInfo();
        break;
        
        case 2:
             System.out.println("\nmention below are location preffered"); 
            co.Location();
          break;
            
        case 3:
            System.out.println("mention below are colored preffered"); 
            co.Colors();
            break;
            
        case 4:
            System.out.println("mention below are leadership1 preffered"); 
            
            
           co.Leadership();
            break;
           
             }     
                  
                   
            
        
    }
        
    }
    
}
