package beans.xml.instruments;

import beans.api.Instrument;
import beans.api.Performer;
import beans.xml.annotations.SaxophoneInstrument;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
public class Instrumentalist implements Performer {

    @Value("#{systemProperties.myFavoriteSong}")
    private String song;
    @Autowired
    //@Qualifier("saxophone")
    @SaxophoneInstrument // custom qualifier to prevent more beans from matching wiring
    private Instrument instrument;


    @Override
    public void perform() {
        System.out.println("Playing " + song);
        instrument.play();
    }
}
