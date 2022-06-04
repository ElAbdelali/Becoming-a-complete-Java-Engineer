package jidExamples;

public class IRUtil {
	public static int getFrequencyCount(String term, String doc) {
		term = term.toLowerCase();
		doc = term.toLowerCase();

		int frequencyCount = 0;

		int index = doc.indexOf(term);

		while (index >= 0) {
			frequencyCount++;
			doc = doc.substring(index + term.length());
			index = doc.indexOf(term);
		}
		return frequencyCount;

	}

	public static double termFrequency(String term, String doc) {
		int frequencyCount = getFrequencyCount(term, doc);
		int totalTermCount = doc.split(" ").length;

		System.out.println("\nFinding term frequency for " + term);
		System.out.println(frequencyCount);
		System.out.println(totalTermCount);

		return (double) frequencyCount / totalTermCount;
	}

	public static void main(String[] args) {

		String doc = "I love pokemon cards";

		System.out.println(termFrequency("pokemon", doc));
		System.out.println(termFrequency("cards", doc));

	}

}
