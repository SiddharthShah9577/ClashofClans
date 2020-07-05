package com.main;

public class Troops
{
    private String name;

    private int level;

    private int maxLevel;

    private String village;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return this.level;
    }
    public void setMaxLevel(int maxLevel){
        this.maxLevel = maxLevel;
    }
    public int getMaxLevel(){
        return this.maxLevel;
    }
    public void setVillage(String village){
        this.village = village;
    }
    public String getVillage(){
        return this.village;
    }
}