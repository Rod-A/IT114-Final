/**
 * 
 */
package section1;

/**
 * @author roddy
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T> {
	private T contained;
	
	public MyGenericContainerClass(T contained){
		this.contained = contained;
		
	}
	public T getContained() {
		// TODO Auto-generated method stub
		return contained;
	}
}
