package pac;

import pac.school.TTC;
import pac.school.student.*;

public class SchoolTest {
    public static void main(String[] args) {
        TTC ttc = new TTC();
        ttc.addStudent(new Jouhousyori("林佑真"));
        ttc.addStudent(new Kentikukantoku("黒崎一護"));
        ttc.meal();
    }
}