/**
 * 
 */
package section2;

/**
 * @author roddy
 *
 */
public class Governor implements HasName {

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 * 
	 */
	private String name;
	
	public Governor(String name)
	{
		this.name = name;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
