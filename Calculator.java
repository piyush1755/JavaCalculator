import java.util.Scanner;

public class Calculator {

    public static int getInteger(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static void clac(char ch){

         switch (ch) {
            
            case '*':
             int num1 =getInteger();
            int num2 = getInteger();
            System.out.println("Multiply : "+ num1 * num2);
             break;

              case '+':
               int num3 =getInteger();
            int num4 = getInteger();
            System.out.println("Add : " + num3 + num4);
             break;

              case '-':
               int num5 =getInteger();
            int num6 = getInteger();
            System.out.println("Sub : " + (num5 - num6));
             break;

              case '/':
               int num7 =getInteger();
            int num8 = getInteger();
            if(num8 ==0){
                System.out.println("Divided by zero error");
            }else{

                System.out.println("Divide : " + num7/num8 );
             break;
            }
             case '%':
               int num9 =getInteger();
            int num10 = getInteger();
            System.out.println("Modolus : " + num9%num10);
             break;
        
             default:
             System.out.println("Unknown opeartor");
           
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        do{

        System.out.println("Chosse an opreation : (*, +, _, %, /)");
        System.out.println("-->>");
        
        String sh = sc.next();
        char ch = sh.charAt(0);
        clac(ch);

        int time =0;
        int retry =5;
        boolean exit = false;
        for( time =0; time<=retry; time++){

            System.out.println("Do you want to continue?? (y/n)");
        String exitInput = sc.next();
        char ch1 = exitInput.charAt(0);

        if(ch1 == 'n'){
            exit = true;
            break;
        }else if(ch1 == 'y'){
            break;
        }else{
             System.out.println("Please chosse a correct option.");
        }
    }

    if(exit){
        break;
    }

    if(time>=retry){
        System.out.println("Limit Exceedes");
        break;
    }

        

        }while(true);

       

        
    }
    
}
