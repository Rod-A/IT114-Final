/**
 * 
 */
package section2;

/**
 * @author roddy
 *
 */
public interface HasCapital<C extends Capital> {
	
	public C getCaptial();
	public String getCapitalName();
}
