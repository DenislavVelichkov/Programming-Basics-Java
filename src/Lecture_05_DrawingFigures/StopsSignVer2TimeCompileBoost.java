package DrawingFigures_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StopsSignVer2TimeCompileBoost {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        String result = "";

        builder.append(repeatString(".", n + 1));
        builder.append(repeatString("_", 2 * n + 1));
        builder.append(repeatString(".", n + 1));
        builder.append("\n");

        int midLinesCount = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            builder.append(repeatString(".", n - i));
            builder.append("//");
            builder.append(repeatString("_", midLinesCount));
            midLinesCount += 2;
            builder.append("\\\\");  // oznachava 2 cherti
            builder.append(repeatString(".", n - i));
            builder.append("\n");
        }
        // print Stop
        builder.append("//");
        builder.append(repeatString("_", n * 2 - 3));
        builder.append("STOP!");
        builder.append(repeatString("_", n * 2 - 3));
        builder.append("\\\\");
        builder.append("\n");

        for (int i = 0; i < n; i++) {
            builder.append(repeatString(".", i));
            builder.append("\\\\");
            builder.append(repeatString("_", midLinesCount));
            midLinesCount -= 2;
            builder.append("//");
            builder.append(repeatString(".", i));
            builder.append("\n");
        }
        System.out.println(builder);
    }

    private static String repeatString(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}
