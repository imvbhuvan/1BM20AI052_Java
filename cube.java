import square.*;
import cube.*;
import  java.lang.Math.random;

abstract class opj{

int number;
abstract void random();

}

class  cusq extends opj{



void random(){

r=new random();

number = r.nextInt(100);

sqr a = new sqr();
int a1 = a.sqr(number);
System.out.println("the number is "+number);
System.out.println("the number is "+a1);



}

}

}


package square;

public class sqr{

public int sqr(int y){

return y*y;

}


}


package cube;

public class cubee{

public int cubee(int x)

return x*x*x;

}
