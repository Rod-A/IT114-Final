package section2;

public interface HasGovernor<G extends Governor> {
	

	public G getGovernor();
	public String getGovernorName();
}
