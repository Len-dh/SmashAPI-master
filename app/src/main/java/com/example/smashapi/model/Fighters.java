package com.example.smashapi.model;

import java.io.Serializable;

public class Fighters implements Serializable {

    private String name;
    private String imageToUrl;
    private String serie;
    private String firstApp;
    private String descCharac;
    private String imToUrlCh;
    private String tiersRanking;
    private String imaGif;



    public Fighters()
    {

    }

    public Fighters(String name, String imageToUrl, String serie, String firstApp, String descCharac, String imToUrlCh, String tiersRanking, String imaGif) {
        this.name = name;
        this.imageToUrl = imageToUrl;
        this.serie = serie;
        this.firstApp = firstApp;
        this.descCharac = descCharac;
        this.imToUrlCh = imToUrlCh;
        this.tiersRanking = tiersRanking;
        this.imaGif = imaGif;
    }

    public String getImaGif() {
        return imaGif;
    }

    public void setImaGif(String imaGif) {
        this.imaGif = imaGif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageToUrl() {
        return imageToUrl;
    }

    public void setImageToUrl(String imageToUrl) {
        this.imageToUrl = imageToUrl;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFirstApp() {
        return firstApp;
    }

    public void setFirstApp(String firstApp) {
        this.firstApp = firstApp;
    }

    public String getDescCharac() {
        return descCharac;
    }

    public void setDescCharac(String descCharac) {
        this.descCharac = descCharac;
    }

    public String getImToUrlCh() {
        return imToUrlCh;
    }

    public void setImToUrlCh(String imToUrlCh) {
        this.imToUrlCh = imToUrlCh;
    }

    public String getTiersRanking() {
        return tiersRanking;
    }

    public void setTiersRanking(String tiersRanking) {
        this.tiersRanking = tiersRanking;
    }
}