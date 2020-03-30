
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Iterator;
public class LinkedHashMap1 {

	static String returnval2 = "";

	static String returnval3 = "";

	// create a table and add some values

	public static void main(String args[]) {

		LinkedHashMap<Integer, String> movieList = new LinkedHashMap<Integer, String>();

		/// put values in table
		movieList.put(1, " The Color Purpule, 1985");
		movieList.put(2, " Coming to America, 1992");
		movieList.put(3, " Friday, 1992");
		movieList.put(4, " Get Out, 2017");
		movieList.put(5, " Boomerang, 1992");
		movieList.put(6, " Glory, 1989");
		movieList.put(7, " New Jack City, 1991");
		movieList.put(8, " Poetic Justice, 1993");
		movieList.put(9, " Brown Sugar, 2002");
		movieList.put(10, " The Five Heartbeats, 1991");
		movieList.put(11, " Dope, 2015");
		movieList.put(12, " Bad Boys, 1995 ");
		movieList.put(13, " Black Panther, 2018");
		movieList.put(14, " Training Day, 2001");
		movieList.put(15, " 12 Years a Slave, 2013");
		movieList.put(16, " Set it Off, 1996");
		movieList.put(17, " Sorry to Bother You, 2018");
		movieList.put(18, " Waiting to Exhale, 1995");

		// Checking the size of my hash table
		System.out.println("The size of the Ashly's movie list table is " + movieList.size());
		System.out.println();

		System.out.println("Ashly's original top movie list: " + movieList);
		// display favorite movie
		String returnval = movieList.put(7, " New Jack City, 1991");

		System.out.println();

		System.out.println("Ashly's" + " favorite movie is: " + returnval);

		System.out.println();

		String returnval1 = movieList.put(17, " Sorry to Bother You, 2018");

		System.out.println("Ashly's" + " least favorite movie on her list is:" + returnval1);

		System.out.println();

		System.out.println("Is the movie 'The Help' present? " + movieList.containsValue("The Help, 2011"));

		System.out.println();

		returnval2 = movieList.put(19, " Set it Off, 1996");
		returnval3 = movieList.put(20, " Cooley High, 1975");

		// Will display new movie list
		System.out.println("Ashly's new movie list after item add: " + movieList);

		System.out.println();

		// Checking the size of my hash table
		System.out.println("The size of the Ashly's movie list table is " + movieList.size());
		System.out.println();

		// removes movies
		returnval1 = movieList.remove(12);
		returnval1 = movieList.remove(18);
		returnval1 = movieList.remove(8);
		returnval1 = movieList.remove(16);
		returnval1 = movieList.remove(6);

		// Will display new movie list
		System.out.println("Ashly's updated movie list after deteled items: " + movieList);

		System.out.println();

		// Checking the size of my hash table
		System.out.println("The size of the Ashly's movie list table is " + movieList.size());

		System.out.println();

		// Checking for movie
		System.out.println("Is the movie 'Boomerang, 1992' present? " + movieList.containsKey(5));
		System.out.println();

		// if else statements to search for certain movies
		if (movieList.containsValue(" Friday")) {
			System.out.println("Ashly's list contains the movie Friday, 1992");
			System.out.println();
		} else {
			System.out.println("Ashly's list does not contain the movie Friday, 1992");
			System.out.println();
		}

		if (movieList.containsValue(" Dope, 2015"))

		{
			System.out.println("Ashly's list contains the movie Dope, 2015");
			System.out.println();
		} else {
			System.out.println("Ashly's list does not contain the movie Dope, 2015");
			System.out.println();
		}

		if (movieList.containsValue(" Eve's Bayou, 1997"))

		{
			System.out.println("Ashly's list contains the movie Eve's Bayou, 1997");

		} else {
			System.out.println("Ashly's list does not contain the movie Eve's Bayou, 1997");
			System.out.println();
		}

		System.out.println("Ashly's most current movie list:");
		System.out.println();

		// Get a set of the entries
		Set set = movieList.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {

			Map.Entry me = (Map.Entry) i.next();

			System.out.print(me.getKey() + ": ");

			System.out.println(me.getValue());

		}
	}
}
//The end
