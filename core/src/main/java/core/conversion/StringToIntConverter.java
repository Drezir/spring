package core.conversion;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Adam Ostrozlik
 * @version 1.0
 * @since 17.09.2018
 **/
public class StringToIntConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String s) {
        return Integer.parseInt(s);
    }
}
