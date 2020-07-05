package com.main;

public class Achievements
{
    private String name;

    private int stars;

    private int value;

    private int target;

    private String info;

    private String completionInfo;

    private String village;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setStars(int stars){
        this.stars = stars;
    }
    public int getStars(){
        return this.stars;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public void setTarget(int target){
        this.target = target;
    }
    public int getTarget(){
        return this.target;
    }
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }
    public void setCompletionInfo(String completionInfo){
        this.completionInfo = completionInfo;
    }
    public String getCompletionInfo(){
        return this.completionInfo;
    }
    public void setVillage(String village){
        this.village = village;
    }
    public String getVillage(){
        return this.village;
    }
}