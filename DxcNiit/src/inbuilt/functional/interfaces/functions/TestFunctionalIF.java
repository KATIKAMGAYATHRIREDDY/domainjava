package inbuilt.functional.interfaces.functions;
import java.util.function.*;
public class TestFunctionalIF {
public static void main(String[] args) {
	Function<Integer,Integer> f = i->i*i;
	System.out.println(f.apply(4));
	Function<String,Integer> f2=s->s.length();
	System.out.println("length of gayathri is "+f2.apply("gayathri"));
	Function<String,String> f3 = s -> s.toUpperCase();
	System.out.println(f3.apply("gayathri"));
}
}
