/**
 * @author Daniel Nucci - 100655384
 * @version October 13th, 2018
 */

package assignments.Assignment1;

public class MyMain_string {

	public static void main(String[] args) {
		StringManipulation phrase1 = new StringManipulation("count");
		phrase1.removeUnderscores();
		StringManipulation phrase2 = new StringManipulation("number_of_students");
		phrase2.removeUnderscores();
		StringManipulation phrase3 = new StringManipulation("max_grade_in_class");
		phrase3.removeUnderscores();

		System.out.println(phrase1.getcamelCasePhrase());
		System.out.println(phrase2.getcamelCasePhrase());
		System.out.println(phrase3.getcamelCasePhrase());
	}

}
