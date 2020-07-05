package com.main;

public class BestSeason
{
    private String id;

    private int rank;

    private int trophies;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return this.rank;
    }
    public void setTrophies(int trophies){
        this.trophies = trophies;
    }
    public int getTrophies(){
        return this.trophies;
    }
}
