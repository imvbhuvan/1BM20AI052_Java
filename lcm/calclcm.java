package lcm;
import gcd.*;

public class calclcm{

public int calclcm(int x, int y){

calcgcd a2 = new calcgcd();
int j = a2.calcgcd(x,y);
return (x/j) * y;


}

}
