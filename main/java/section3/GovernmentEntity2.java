package section3;

import section2.Capital;
import section2.Governor;
import section2.HasCapital;
import section2.HasGovernor;
import section2.HasName;

public class GovernmentEntity2<T extends Capital, G extends Governor> implements HasCapital<T>, HasName, HasGovernor<G> {

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public G getGovernor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGovernorName() {
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
