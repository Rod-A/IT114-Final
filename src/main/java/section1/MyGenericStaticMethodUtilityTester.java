/**
 * 
 */
package section1;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.List;

/**
 * @author roddy
 *
 */
public class MyGenericStaticMethodUtilityTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "element_1";
		Integer i1 = 1234;
		List<String> strings = new ArrayList<String>();
		List<Integer> integers = new ArrayList<Integer>();
		//strings.add(s1);
		Integer i = MyGenericStaticMethodUtility.add2Collection(i1, integers);
		String s = MyGenericStaticMethodUtility.add2Collection(s1, strings);
		System.out.println("added String " + s + " " + strings.size());
		System.out.println("added Integer " + i + " " + integers.size());
	}

}
