package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classification;

public class Episodes implements Classification {
    private int number;
    private String name;
    private Series series;

    public int getVisualizationTotal() {
        return visualizationTotal;
    }

    public void setVisualizationTotal(int visualizationTotal) {
        this.visualizationTotal = visualizationTotal;
    }

    private int visualizationTotal;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if(visualizationTotal > 100){
            return 4;
        }
        else {
            return 2;
        }
    }
}
