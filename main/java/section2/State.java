/**
 * 
 */
package section2;

/**
 * @author roddy
 *
 */
public class State<C extends Capital, G extends Governor > implements HasCapital<C>, HasGovernor<G>, HasName {

	/* (non-Javadoc)
	 * @see section2.HasName#getName()
	 */
	String name;
	C capital;
	G governor;
	
	public State(C capital, G governor, String name)
	{
		this.name = name;
		this.capital = capital;
		this.governor = governor;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public String getGovernorName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}
	public G getGovernor() {
		// TODO Auto-generated method stub
		return governor;
	}
	public C getCaptial() {
		// TODO Auto-generated method stub
		return capital;
	}

}
