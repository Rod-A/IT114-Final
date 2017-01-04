package section2;

public class Statetester {
	
	public static void main(String[] args)
	{
	State<Capital, Governor> nj = new State<Capital, Governor>(new Capital("Trenton"), new Governor("Christie"), "New Jersey");
	
	System.out.println(nj.name + " " + nj.getCapitalName() + " " + nj.getGovernorName());
}
}