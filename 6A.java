import java.util.*;




class calc {
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.print("Enter first number - ");
int a= sc.nextInt(); 

System.out.print("Enter second number - ");
int b= sc.nextInt();  

int sum;
System.out.print("Enter the operator - ");
char op=sc.next().charAt(0);

switch(op){

case '+': try{
               sum=a+b;
                  System.out.println("Addition of two numbers is "+sum);
               }
           catch (java.lang.ArithmeticException ex){
                     System.out.println("one of the value is 0");         
                  }
          break;
case '-': try{
               sum=a-b;
                  System.out.println("Difference of two numbers is "+sum);
               }
           catch (java.lang.ArithmeticException ex){
                     System.out.println("one of the value is 0");         
                  }
          break;
case '*': try{
               sum=a*b;
                  System.out.println("Product of two numbers is "+sum);
               }
           catch (java.lang.ArithmeticException ex){
                     System.out.println("one of the value is 0");         
                  }
          break;
case '/': try{
               sum=a/b;
                  System.out.println("Quotient of two numbers is "+sum);
               }
           catch (java.lang.ArithmeticException ex){
                     System.out.println("one of the value is 0");         
                  }
          break;
          
default : System.out.println("Error getting the values ");

}
}
}
