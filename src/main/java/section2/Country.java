/**
 * 
 */
package section2;

/**
 * @author roddy
 *
 */
public class Country<C extends Capital> implements HasCapital<C>, HasName {

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 */
	private String name;
	private C capital;
	
	public Country(String name, C capital)
	{
		this.name = name;
		this.capital = capital;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public C getCaptial() {
		// TODO Auto-generated method stub
		return capital;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;

}
	}
