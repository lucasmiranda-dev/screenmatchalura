package br.com.alura.screenmatch.calculation;
import br.com.alura.screenmatch.models.Titles;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void incluides(Titles title){
     this.totalTime += title.getLengthInMinutes();
    }
}
