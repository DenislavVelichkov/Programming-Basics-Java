<<<<<<< HEAD:src/Loops_04/VowelsSum.java
package Loops_04;
=======
package Lecture_06_Loops;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_06_Loops/VowelsSum.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol){
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
                    default:
                        break;
            }
        }
        System.out.println(sum);
    }
}
