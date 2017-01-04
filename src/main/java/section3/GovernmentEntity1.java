/**
 * 
 */
package section3;

import section2.Capital;
import section2.HasCapital;
import section2.HasName;

/**
 * @author roddy
 *
 */
public class GovernmentEntity1<T extends Capital> implements HasCapital<T>, HasName {

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public T getCaptial() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}

}
