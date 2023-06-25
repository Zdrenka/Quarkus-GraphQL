package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class SitcomService {
    List<Sitcom> sitcoms = new ArrayList<>();
    public SitcomService() {
        Sitcom sitcom = new Sitcom();
        sitcom.title = "Stath Lets Flats";
        sitcom.broadcaster = "Channel 4";
        sitcom.actors.addAll(Arrays.asList("Jamie Demetriou - (Stath Charalambos)",
                "Natasia Demetriou - (Sophie Charalambos)",
                "Christos Stergioglou - (Vasos Charalambos)",
                "Katy Wix - (Carole Collins)",
                "Al Roberts - (Al Clark)",
                "Kiell Smith-Bynoe - (Dean Townsend)"));
        sitcom.directors.addAll(Arrays.asList("Tom Kingsley"));
        sitcom.writers.addAll(Arrays.asList("Jamie Demetriou", "Robert Popper"));
        sitcom.NumberOfSeries = 3;
        sitcom.startDate = LocalDate.of(2018, Month.JUNE, 27);
        sitcom.endDate = LocalDate.of(2021, Month.NOVEMBER, 30);
        sitcom.totalEpisodes = 18;
        sitcom.avgEpisodeRunningTime = 22;

        sitcoms.add(sitcom);
    }

    public List<Sitcom> getAllSitcoms() {
        return sitcoms;
    }

    public List<Sitcom> getSitcomByActor(String actor) {
        return sitcoms.stream().filter(sitcom -> sitcom.actors.contains(actor)).collect(Collectors.toList());
    }
}
