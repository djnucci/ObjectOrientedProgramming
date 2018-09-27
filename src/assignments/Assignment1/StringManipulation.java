package assignments.Assignment1;

public class StringManipulation {

	private String phrase;
	private String camelCasePhrase;

	/**
	 * Constructor that takes in a phrase
	 * @param phrase - String
	 */
	public StringManipulation(String phrase) {
		setPhrase(phrase);
	}

	/**
	 * Phrase setter method
	 * @param phrase - String
	 */
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	/**
	 * Phrase getter method
	 * @return the phrase
	 */
	public String getPhrase() {
		return this.phrase;
	}

	/**
	 * Returns the camel case equivalent to the entered phrase
	 * @return phrase - String
	 */
	public String getcamelCasePhrase() {
		if (camelCasePhrase.equals(null) || camelCasePhrase.equals("")) {
			removeUnderscores();
		}
		return this.camelCasePhrase;
	}

	/**
	 * populate the camelCasePhrase member
	 */
	public void removeUnderscores() {
		String[] wordList = getPhrase().split("_");

		for (int i = 1; i < wordList.length; i++) {
			char newChar = (char) ((int) (wordList[i].charAt(0)) - 32);
			char oldChar = wordList[i].charAt(0);
			if ((int) 'a' < (int) oldChar && (int) 'z' > (int) oldChar) {
				char[] splitWord = wordList[i].toCharArray();
				splitWord[0] = newChar;
				wordList[i] = "";
				for (int j = 0; j < splitWord.length; j++) {
					wordList[i] += splitWord[j];
				}
			}
		}

		camelCasePhrase = "";
		for (int i = 0; i < wordList.length; i++) {
			camelCasePhrase += wordList[i];
		}

	}
}
