package beans.xml.spel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@NoArgsConstructor
@Getter
@Setter
public class CityHolder {
    private City city;
    private Collection<City> cities;
    private Collection<String> names;
}
