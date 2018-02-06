import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] unused){
    }
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void wordCount (String input) {
        int count = 0;
        int indexstart = 0;
        while (indexstart < urlToString(input).length()) {
            indexstart = urlToString(input). indexOf("Prince", indexstart);
            if (indexstart != -1) {
                count ++;
                indexstart += 1;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
