/**
 * 
 */
package section2;

/**
 * @author roddy
 *
 */
public class CountryTester {
	public static void main(String[] args)
	{
	Country<Capital> us = new Country<Capital>("Capital", new Capital("Wahington"));
	Country<Capital> turkey = new Country<Capital>("Capital", new Capital("Anakara"));
	
	System.out.println(us.getName() + " " + us.getCapitalName());
	System.out.println(turkey.getName() + " " + turkey.getCapitalName() + " ");
	}
}
