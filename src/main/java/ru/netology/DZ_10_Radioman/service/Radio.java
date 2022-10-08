package ru.netology.DZ_10_Radioman.service;

public class Radio {

    protected int currentRadioStation; //поле - текущая станция
    protected int currentVolume; // поле - текущая громкость

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 10;
        }
    }


    public int getRadioStationNumber() {
        return currentRadioStation;
    }

    public int getVolume() {
        return currentVolume;
    }
}
