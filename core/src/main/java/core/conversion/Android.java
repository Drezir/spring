package core.conversion;

import org.springframework.format.Formatter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 17.09.2018
 **/
public class Android {

    private final float version;

    public Android(float version) {
        this.version = version;
    }

    public float getVersion() {
        return version;
    }


    public static final class AndroidEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            setValue(new Android(Float.parseFloat(text)));
        }
    }

    public static final class AndroidFormatter implements Formatter<Android> {

        @Override
        public Android parse(String s, Locale locale) throws ParseException {
            return new Android(Float.parseFloat(s));
        }

        @Override
        public String print(Android android, Locale locale) {
            return String.format("Android %f", android.getVersion());
        }
    }
}
