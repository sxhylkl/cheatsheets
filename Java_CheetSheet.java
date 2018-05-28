package eigene;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Dies ist ein Javadoc-Kommentar.
 *
 * @author John Doe
 * @version 1.0
 */
public class CheatSheet {

	/**
	 * Returns an Image object that can then be painted on the screen. The url
	 * argument must specify an absolute {@link URL}. The name Unten stehen weitere
	 * Tags
	 *
	 * @param url
	 *            an absolute URL giving the base location of the image
	 * @param name
	 *            the location of the image, relative to the url argument
	 * @return the image at the specified URL
	 * @see Image
	 */
	public static void main(String[] args) {

		/****
		 * Scanner
		 ****/
		// import java.util.Scanner;
		Scanner sc = new Scanner(System.in);
		String temp1 = sc.next();
		temp1 = sc.nextLine();
		int tempint = sc.nextInt();
		double tempdouble = sc.nextDouble();
		boolean tempbool = sc.nextBoolean();
		if (sc.hasNextDouble())
			System.out.println(temp1 + tempint + tempdouble + tempbool);
		sc.close();

		/****
		 * Random
		 ****/
		// import java.util.Random;
		Random rand = new Random(); // int 0,1,2,3,4,5,6,7,8,9
		int zufallsGanzzahl = rand.nextInt(10) + 10;
		System.out.println("Zufalls-Ganzzahl: " + zufallsGanzzahl); // von 0.0 (inkl.) bis 1.0 (exkl.) -> 0-50.99999...
		double zufallsKommazahl = rand.nextDouble() * 50 + 1;
		System.out.println("Zufalls-Kommazahl: " + zufallsKommazahl);

		/****
		 * Runden
		 ****/
		double randFloat = rand.nextDouble() * 50 + 1;
		double roundedFloat = randFloat; // auf 2 Stellen nach dem Komma runden
		roundedFloat = randFloat * 100; // komma zwei stellen nach rechts
		roundedFloat = Math.round(randFloat); // keine Nachkommastelle
		roundedFloat = randFloat / 100; // zwei Nachkommastellen (komma 2 nach links)
		System.out.println(Math.round(roundedFloat * 100) / 100.0);// Kurzversion

		boolean zufallsBoolean = rand.nextBoolean(); // Random boolean
		System.out.println(zufallsBoolean);

		/****
		 * Formatieren
		 ****/
		// import java.text.DecimalFormat;
		double guthaben = 1234.5;
		DecimalFormat df = new DecimalFormat("0.00�");

		System.out.println(df.format(guthaben));

		// String abschneiden
		String teststr = "ichbineinstring";
		System.out.println(teststr.substring(1, teststr.length() - 1));

		/****
		 * Array
		 ****
		 * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		 *
		 * Arrays.sort(array, [from, to]);
		 * 
		 * Arrays.binarySearch(array, [from, to], key);
		 * 
		 * Arrays.equals(array1, array2);
		 * 
		 * Arrays.fill(array, [from, to], value);
		 * 
		 * Arrays.copyOf(array, newlength);
		 * 
		 * Arrays.copyOfRange(array, from, to);
		 * 
		 * Arrays.asList();
		 * 
		 * Arrays.hashCode(array);
		 * 
		 * Arrays.deepHashCode(array);
		 * 
		 * Arrays.deepEquals(array1, array2);
		 * 
		 * Arrays.toString(array);
		 * 
		 * Arrays.deepToString(array);
		 * 
		 * Wrapper-Klassen verwenden!
		 */
		// import java.util.Arrays;
		String[] numbers = { "one", "two", "three" }; // Creates an array of strings that holds one to three
		String[] names = new String[10]; // Creates an array named 'names' with enough space for ten strings
		names[0] = "Smerity";
		names[1] = "Josh";
		int i = 0;
		// Any unused slots are by default null, which is like Python's None
		while (names[i] != null) {
			System.out.println(names[i]);
			i++;
		}

		// Can also use the length of an array
		for (int j = 0; j < numbers.length; j++)
			System.out.println(numbers[j]);
		System.out.println(Arrays.toString(names));

		/****
		 * ArrayList
		 ****
		 * https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
		 *
		 * list.trimToSize();
		 * 
		 * list.ensureCapacity(int);
		 * 
		 * list.size();
		 * 
		 * list.isEmpty();
		 * 
		 * list.contains(object);
		 * 
		 * list.indexOf(object); // index of first occurence
		 * 
		 * list.lastIndexOf(object); // index of last occurence
		 * 
		 * list.clone(); // return clone of list structure only
		 * 
		 * list.toArray();
		 * 
		 * list.get(index);
		 * 
		 * list.set(index, value);
		 * 
		 * list.add(object);
		 * 
		 * list.add(index, object);
		 * 
		 * list.remove(index);
		 * 
		 * list.remove(object);
		 * 
		 * list.clear();
		 * 
		 * list.addAll(collection);
		 * 
		 * list.addAll(index, collection);
		 * 
		 * list.removeRange(from, to);
		 * 
		 * list.removeAll(collection);
		 * 
		 * list.retainAll(collection); // removes from list all NOT in collection
		 * 
		 * list.listIterator([index]);
		 * 
		 * list.subList(from, to);
		 *
		 * Wrapper-Klassen verwenden!
		 */
		// import java.util.ArrayList;
		// aus Unterricht
		ArrayList<String> sAL = new ArrayList<>();
		sAL.add("Test");
		sAL.add("noch ein Test");
		sAL.set(1, "Hallo");
		sAL.remove("Test");
		sAL.set(0, null);

		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		primes.add(3);
		if (primes.contains(5) == false) {
			primes.add(5);
		}
		for (i = 0; i < primes.size(); i++)
			System.out.println(primes.get(i));
		for (Integer prime : primes)
			System.out.println(prime);
		// String
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		System.out.println(list.hashCode());
		System.out.println(list);

		/****
		 * HashMap
		 ****
		 * https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
		 * 
		 * map.size();
		 * 
		 * map.isEmpty();
		 * 
		 * map.get(key);
		 * 
		 * map.containsKey(key);
		 * 
		 * map.put(key, value);
		 * 
		 * map.putAll(Map<key, value> x);
		 * 
		 * map.remove(key);
		 * 
		 * map.clear();
		 * 
		 * map.containsValue(value);
		 * 
		 * map.clone(); // clont nur die Struktur als return
		 * 
		 * map.keySet(); // returns all keys as set
		 * 
		 * map.values(); // returns all values as collection
		 * 
		 * map.entrySet(); // returns set of key: value
		 * 
		 * Wrapper-Klassen verwenden!
		 */
		// Map map = new HashMap();
		// import java.util.HashMap;
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("Hans", 1.5);
		hm.put("Peter", 3.4);
		hm.put("Bella", 2.3);
		hm.remove("Hans");
		System.out.println(hm);
		if (hm.containsKey("Bella")) {
			System.out.println(hm.get("Bella"));
		}
		// Iteration nur über Values
		for (Double e : hm.values()) {
			System.out.println("Entry:" + e);
		}
		// Iteration über Schlüssel und Values
		for (Entry<String, Double> entry : hm.entrySet()) {
			System.out.println("Entry " + entry.getKey() + " hat eine " + entry.getValue());
		}

		Map<String, Double> map = new HashMap<>();
		map.put("Krishna", new Double(123.22));
		System.out.println(map.get("Krishna"));

		/****
		 * - Array in Hashmap
		 ***/
		Map<String, String[]> map1 = new HashMap<>();
		map1.put("Ram", new String[] { "one", "two", "three" });
		System.out.println(map1.get("Ram")[0]);

		/****
		 * - Hashmap in Hashmap
		 ****/
		HashMap<String, HashMap<String, String>> myHashmap = new HashMap<String, HashMap<String, String>>();
		if (!myHashmap.containsKey("en")) {
			myHashmap.put("en", new HashMap<String, String>());
		}
		myHashmap.get("en").put("Fritz", "Fritzenglish");
		System.out.println(myHashmap.get("en").get("name"));

		/****
		 * HashSet
		 ****
		 *https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
		 **/

	}

	public static void drawLine() {
		int count = 50;
		for (int i = 0; i < count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	/*
	 * Array Functions:
	 */
	public static int[] arrayInvert(int[] a) {
		int retA[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			retA[i] = a[a.length - i - 1];
		}
		return retA;
	}

	public static int[] arrayAppend(int[] a, int val) {
		int retA[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++)
			retA[i] = a[i];
		retA[a.length] = val;
		return retA;
	}

	public static int[] arrayRemove(int[] a, int pos) { // pos ist nullbasiert
		int retA[] = new int[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (i < pos) {
				retA[i] = a[i];
			}
			if (i > pos) {
				retA[i - 1] = a[i];
			}
		}
		return retA;
	}

	public static String arrayAnzeigen(String[] array) { // comma sep
		String output = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (output != "") {
					output += ", ";
				}
				output += array[i];
			}
		}
		return output;
	}

}

/*
 * @author name Beschreibt den Autor. Klasse, Interface
 * 
 * @version version Erzeugt einen Versionseintrag. Maximal einmal pro Klasse
 * oder Interface. Klasse, Interface
 * 
 * @since jdk-version Seit wann die Funktionalität existiert. Klasse, Interface,
 * Instanzvariable, Methode
 * 
 * @see reference Erzeugt einen Link auf ein anderes Element der Dokumentation.
 * Klasse, Interface, Instanzvariable, Methode
 * 
 * @serial Beschreibt die serialisierten Daten eines Serializable-Objekts.
 * Klasse
 * 
 * @serialField Dokumentiert ein Feld eines Serializable-Objekts. Klasse,
 * Methode
 * 
 * @param name description Parameterbeschreibung einer Methode. Methode
 * 
 * @return description Beschreibung des Rückgabewerts einer Methode. Methode
 * 
 * @exception classname description
 * 
 * @throws classname description Beschreibung einer Exception, die von dieser
 * Methode geworfen werden kann. Methode
 * 
 * @deprecated description Beschreibt eine veraltete Methode, die nicht mehr
 * verwendet werden sollte. Sollte ab Java 5.0 immer mit
 * der @Deprecated-Annotation verwendet werden. Methode
 * 
 * {@inheritDoc} Kopiert die Beschreibung aus der überschriebenen Methode.
 * Überschreibende Methode 1.4.0
 * 
 * {@link reference} Link zu einem anderen Symbol. Klasse, Interface,
 * Instanzvariable, Methode
 * 
 * {@linkPlain reference} Der Link wird in Standardtext statt in
 * Quelltextzeichensatz angezeigt. Klasse, Interface, Instanzvariable, Methode
 * 1.4.0
 * 
 * {@value} Gibt den Wert eines konstanten Feldes zurück. Statisches Feld 1.4.0
 * 
 * {@docRoot} Gibt den absoluten Pfad zum Hauptverzeichnis wieder. Package,
 * Klassen, Felder, Methoden
 * 
 * {@code} Formatiert Text buchstabengetreu mit dem Quelltextzeichensatz
 * (entsprechend <code>) und unterdrückt die Interpretierung von beinhalteten
 * HTML oder Javadoc-Tags. Klasse, Interface, Instanzvariable, Methode 5.0
 * 
 * {@literal} Kennzeichnet buchstabengetreuen Text und unterdrückt die
 * Interpretierung von beinhalteten HTML oder Javadoc-Tags. Klasse, Interface,
 * Instanzvariable, Methode 5.0
 */
