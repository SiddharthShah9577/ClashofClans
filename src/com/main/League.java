package com.main;

public class League
{
    private int id;

    private String name;

    private IconUrls iconUrls;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setIconUrls(IconUrls iconUrls){
        this.iconUrls = iconUrls;
    }
    public IconUrls getIconUrls(){
        return this.iconUrls;
    }
}