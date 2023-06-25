package org.acme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sitcom {
    public String title;
    public List<String> writers = new ArrayList<>();
    public List<String> directors = new ArrayList<>();
    public List<String> producers = new ArrayList<>();
    public List<String> actors = new ArrayList<>();
    public LocalDate startDate;
    public LocalDate endDate;
    public String broadcaster;
    public Integer NumberOfSeries;
    public Integer avgEpisodeRunningTime;
    public Integer totalEpisodes;
}
