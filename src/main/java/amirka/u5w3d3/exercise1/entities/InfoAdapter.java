package amirka.u5w3d3.exercise1.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {
    // Info-type attribute in the adapter that wraps the class being adapted.
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getFullName() {
        return info.getName() + " " + info.getSurname();
    }


    @Override
    public int getAge() {
        LocalDate birth = info.getBirthDate()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        return Period.between(birth, LocalDate.now())
                .getYears();
    }
}
