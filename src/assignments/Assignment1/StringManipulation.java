package assignments.Assignment1;

public class StringManipulation {

	private String phrase;
	private String camelCasePhrase;

	/**
	 * Constructor that takes in a phrase
	 * 
	 * @param phrase - String
	 */
	public StringManipulation(String phrase) {
		setPhrase(phrase);
	}

	/**
	 * Phrase setter method
	 * 
	 * @param phrase - String
	 */
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	/**
	 * Phrase getter method
	 * 
	 * @return the phrase
	 */
	public String getPhrase() {
		return this.phrase;
	}

	/**
	 * Returns the camel case equivalent to the entered phrase
	 * 
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
		String word = "";
		
		if (wordList.length == 1) {
			word = getPhrase();
		}

		if (wordList.length > 1) {
			// start at index 1
			for (int i = 1; i < wordList.length; i++) {
				char oldChar = wordList[i].charAt(0);
				// if the first character is a lower case letter, make it capital
				if ((int) 'a' < (int) oldChar && (int) 'z' > (int) oldChar) {
					char[] splitWord = wordList[i].toCharArray();
					char newChar = (char) ((int) (wordList[i].charAt(0)) - 32);
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
		else {
			char oldChar = word.charAt(0);
			if ((int) 'a' < (int) oldChar && (int) 'z' > (int) oldChar) {
				char[] splitWord = word.toCharArray();
				char newChar = (char) ((int) (word.charAt(0)) - 32);
				splitWord[0] = newChar;
				word = "";
				for (int j = 0; j < splitWord.length; j++) {
					word += splitWord[j];
				}
			}
			camelCasePhrase = word;
		}
	}
}
