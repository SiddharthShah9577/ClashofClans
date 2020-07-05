package com.main;

import java.util.ArrayList;
import java.util.List;
public class Root
{
    private String tag;

    private String name;

    private int townHallLevel;

    private int townHallWeaponLevel;

    private int expLevel;

    private int trophies;

    private int bestTrophies;

    private int warStars;

    private int attackWins;

    private int defenseWins;

    private int builderHallLevel;

    private int versusTrophies;

    private int bestVersusTrophies;

    private int versusBattleWins;

    private String role;

    private int donations;

    private int donationsReceived;

    private Clan clan;

    private League league;

    private LegendStatistics legendStatistics;

    private List<Achievements> achievements;

    private int versusBattleWinCount;

    private List<Labels> labels;

    private List<Troops> troops;

    private List<Heroes> heroes;

    private List<Spells> spells;

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
    public void setTownHallLevel(int townHallLevel){
        this.townHallLevel = townHallLevel;
    }
    public int getTownHallLevel(){
        return this.townHallLevel;
    }
    public void setTownHallWeaponLevel(int townHallWeaponLevel){
        this.townHallWeaponLevel = townHallWeaponLevel;
    }
    public int getTownHallWeaponLevel(){
        return this.townHallWeaponLevel;
    }
    public void setExpLevel(int expLevel){
        this.expLevel = expLevel;
    }
    public int getExpLevel(){
        return this.expLevel;
    }
    public void setTrophies(int trophies){
        this.trophies = trophies;
    }
    public int getTrophies(){
        return this.trophies;
    }
    public void setBestTrophies(int bestTrophies){
        this.bestTrophies = bestTrophies;
    }
    public int getBestTrophies(){
        return this.bestTrophies;
    }
    public void setWarStars(int warStars){
        this.warStars = warStars;
    }
    public int getWarStars(){
        return this.warStars;
    }
    public void setAttackWins(int attackWins){
        this.attackWins = attackWins;
    }
    public int getAttackWins(){
        return this.attackWins;
    }
    public void setDefenseWins(int defenseWins){
        this.defenseWins = defenseWins;
    }
    public int getDefenseWins(){
        return this.defenseWins;
    }
    public void setBuilderHallLevel(int builderHallLevel){
        this.builderHallLevel = builderHallLevel;
    }
    public int getBuilderHallLevel(){
        return this.builderHallLevel;
    }
    public void setVersusTrophies(int versusTrophies){
        this.versusTrophies = versusTrophies;
    }
    public int getVersusTrophies(){
        return this.versusTrophies;
    }
    public void setBestVersusTrophies(int bestVersusTrophies){
        this.bestVersusTrophies = bestVersusTrophies;
    }
    public int getBestVersusTrophies(){
        return this.bestVersusTrophies;
    }
    public void setVersusBattleWins(int versusBattleWins){
        this.versusBattleWins = versusBattleWins;
    }
    public int getVersusBattleWins(){
        return this.versusBattleWins;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public void setDonations(int donations){
        this.donations = donations;
    }
    public int getDonations(){
        return this.donations;
    }
    public void setDonationsReceived(int donationsReceived){
        this.donationsReceived = donationsReceived;
    }
    public int getDonationsReceived(){
        return this.donationsReceived;
    }
    public void setClan(Clan clan){
        this.clan = clan;
    }
    public Clan getClan(){
        return this.clan;
    }
    public void setLeague(League league){
        this.league = league;
    }
    public League getLeague(){
        return this.league;
    }
    public void setLegendStatistics(LegendStatistics legendStatistics){
        this.legendStatistics = legendStatistics;
    }
    public LegendStatistics getLegendStatistics(){
        return this.legendStatistics;
    }
    public void setAchievements(List<Achievements> achievements){
        this.achievements = achievements;
    }
    public List<Achievements> getAchievements(){
        return this.achievements;
    }
    public void setVersusBattleWinCount(int versusBattleWinCount){
        this.versusBattleWinCount = versusBattleWinCount;
    }
    public int getVersusBattleWinCount(){
        return this.versusBattleWinCount;
    }
    public void setLabels(List<Labels> labels){
        this.labels = labels;
    }
    public List<Labels> getLabels(){
        return this.labels;
    }
    public void setTroops(List<Troops> troops){
        this.troops = troops;
    }
    public List<Troops> getTroops(){
        return this.troops;
    }
    public void setHeroes(List<Heroes> heroes){
        this.heroes = heroes;
    }
    public List<Heroes> getHeroes(){
        return this.heroes;
    }
    public void setSpells(List<Spells> spells){
        this.spells = spells;
    }
    public List<Spells> getSpells(){
        return this.spells;
    }
}

