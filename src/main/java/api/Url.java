package api;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {

    public static URL getURL(String aString) {
        try {
            return new URL(aString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(
                    String.format(
                            "URL %s is not correctly formatted",
                            aString));
        }
    }
}

