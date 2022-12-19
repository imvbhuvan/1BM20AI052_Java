import gcd.*;
import lcm.*;


class codejava{
public static void main(String args[]){

int k,j;

calcgcd a1 = new calcgcd();

k= a1.calcgcd(5,25);
System.out.println("GCD of two numbers is "+ k);

calclcm a3 = new calclcm();
j = a3.calclcm(15,20);
System.out.println("LCM of two numbers is "+ j);
}
}
