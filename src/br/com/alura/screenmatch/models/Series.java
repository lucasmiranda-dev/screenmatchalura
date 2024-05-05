package br.com.alura.screenmatch.models;

public class Series extends Titles {
    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private int  episodeDurationInMinutes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodeDurationInMinutes() {
        return episodeDurationInMinutes;
    }

    public void setEpisodeDurationInMinutes(int episodeDurationInMinutes) {
        this.episodeDurationInMinutes = episodeDurationInMinutes;
    }

    @Override
    public int getLengthInMinutes() {
        return seasons * episodesPerSeason * episodeDurationInMinutes;
    }
}
