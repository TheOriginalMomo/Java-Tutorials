class FreshJuice{

/*enum- restirction on variables. enums are variables that can only have a set of values

*/


enum FreshJuiceSize{ SMALL, MEDIUM, LARGE}
FreshJuiceSize size; /*
						size- method 

					*/

}




public class FreshJuiceTest{

public static void main(String[] args) { //Main Method;Always use in Java programming

FreshJuice juice = new FreshJuice(); //creating an object from the class FreshJuice; the object is juice
juice.size= FreshJuice.FreshJuiceSize.MEDIUM; //the size of the objects in the class; 
											//the enum which has the juice sizes
System.out.println("size: " + juice.size); // print out each size
	
}




}


/*My Understanding of this exercise


class- blueprint for objects
The public class FreshjuiceTest is the same as the file name
enum is like an array with restrictions
I tested all the values in the enum and they work




*/