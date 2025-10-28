package ma.enset.s5.hamzaelghazouani.events;

import java.util.Date;

public record PageEvent(String name, String user, Date date, long duration) {

}
