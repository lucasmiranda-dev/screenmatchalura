package br.com.alura.screenmatch.models;

public class Titles {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double ratings;
    private int totalRating;
    private int lengthInMinutes;

    public int getTotalRating(){
        return totalRating;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public double getRatings() {
        return ratings;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public void displayTechnicalSheet(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração: " + lengthInMinutes +"min");
    }

    public void rating(double rate){
        ratings += rate;
        totalRating++;
    }

    double averageRating(){
        return ratings / totalRating;
    }
}
