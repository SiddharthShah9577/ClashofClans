package com.main;

public class LegendStatistics
{
    private int legendTrophies;

    private BestSeason bestSeason;

    private CurrentSeason currentSeason;

    public void setLegendTrophies(int legendTrophies){
        this.legendTrophies = legendTrophies;
    }
    public int getLegendTrophies(){
        return this.legendTrophies;
    }
    public void setBestSeason(BestSeason bestSeason){
        this.bestSeason = bestSeason;
    }
    public BestSeason getBestSeason(){
        return this.bestSeason;
    }
    public void setCurrentSeason(CurrentSeason currentSeason){
        this.currentSeason = currentSeason;
    }
    public CurrentSeason getCurrentSeason(){
        return this.currentSeason;
    }
}
