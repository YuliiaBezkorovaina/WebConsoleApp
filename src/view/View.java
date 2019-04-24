package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("language",
                //new Locale("ua", "UA"));
                new Locale("en", "USA"));
                //new Locale("ru", "RU"));
    }
}
