package com.main;

public class Clan
{
    private String tag;

    private String name;

    private int clanLevel;

    private BadgeUrls badgeUrls;

    public void setTag(String tag){
        this.tag = tag;
    }
    public String getTag(){
        return this.tag;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setClanLevel(int clanLevel){
        this.clanLevel = clanLevel;
    }
    public int getClanLevel(){
        return this.clanLevel;
    }
    public void setBadgeUrls(BadgeUrls badgeUrls){
        this.badgeUrls = badgeUrls;
    }
    public BadgeUrls getBadgeUrls(){
        return this.badgeUrls;
    }
}
