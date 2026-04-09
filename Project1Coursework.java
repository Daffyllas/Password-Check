
package project1coursework;
import java.util.Scanner;

public class Project1Coursework {

   
    public static void main(String[] args) {
        
        Scanner eisodos = new Scanner(System.in);
        String password;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%&*";
        
        System.out.println("====== Password Check ======");
        System.out.println("Insert your password for quality check.Insert 'END' to stop the process");
        System.out.println("");
       
        
        System.out.println("=========== REQUIREMENTS ============");
        System.out.println("--- 1) Minimum 8 characters. ---");
        System.out.println("--- 2) At least one Uppercase. ---");
        System.out.println("--- 3) At least one Lowercase. ---");
        System.out.println("--- 4) At least one number. ---");
        System.out.println("--- 5) At least one special character (!@#$%&*) ---");
        
        
        while (true)
        {
            System.out.println("Insert your password ");
            password = eisodos.next();
            
            
            if (password.equals("END"))
                    {
                        break;
                    }
            
            
        
        
        for (int i = 0; i < password.length(); i++)
        {
            char inputChar = password.charAt(i);
        
        if (Character.isUpperCase(inputChar))
        {
            hasUpper = true;
        }
         else if (Character.isLowerCase(inputChar))
        {
        
            hasLower = true;
        }
        else if (Character.isDigit(inputChar))
        {
            hasNumber = true;
        }
        
        else if (specialChars.indexOf(inputChar) >= 0)
        {
            hasSpecialChar = true;
        }
        }
        if (password.length()>= 8 && hasUpper && hasLower && hasNumber && hasSpecialChar)
                
                {
                System.out.println("Your password is valid");
                break;
                
                }
        
        else 
        {
        System.out.println("Your password is invalid");
        System.out.println("Faults : ");
        if (password.length()>= 8){System.out.println("Your password lenght is lower than 8 ");}
        if (!hasUpper){System.out.println("No upper case in your password");}
        if (!hasLower){System.out.println("No lower case in your password");}
        if (!hasNumber){System.out.println("No number in your password");}
        if (!hasSpecialChar){System.out.println("No special character in your password");}
        }
        
        
        
        }
    }
    
}
