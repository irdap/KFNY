package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.util.Locale;

@SpringBootApplication
@EnableScheduling
public class KfnyMain {

    public static void main(final String[] args) {
        // A locale magyarra állítása közvetetten az NLS_LANG és NLS_SORT értékét is beállítja az adatbázisban,
        // így a magyar szöveg rendezése (order by) helyesen működik.
        Locale.setDefault(new Locale("hu", "HU"));
        SpringApplication.run(KfnyMain.class, args);
    }

}
