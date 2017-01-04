/**
 * 
 */
package section1;

/**
 * @author roddy
 *
 */
public class MyGenericContainerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGenericContainerInterface<String> c4String = new MyGenericContainerClass<String>("Ilker");
		MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass<Integer>(1234);
		
		System.out.println(c4String.getContained());
		System.out.println(c4Integer.getContained());
		
	}

}
