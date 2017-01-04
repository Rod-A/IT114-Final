/**
 * 
 */
package section1;

import java.util.Collection;

/**
 * @author roddy
 *
 */
public class MyGenericStaticMethodUtility {
	public static <T> T add2Collection(T e, Collection<T> _collection)
	{
		_collection.add(e);
		return e;
		
	}
}
