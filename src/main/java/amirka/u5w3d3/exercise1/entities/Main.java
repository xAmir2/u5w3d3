package amirka.u5w3d3.exercise1.entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 1, 1);

        Date date = Date.from(birthDate.atStartOfDay(ZoneId.systemDefault())
                .toInstant());

        Info info = new Info("Mario", "Rossi", date);
        DataSource adpt = new InfoAdapter(info);

        UserData user = new UserData();
        user.getData(adpt);


        System.out.println(user);
    }
}
