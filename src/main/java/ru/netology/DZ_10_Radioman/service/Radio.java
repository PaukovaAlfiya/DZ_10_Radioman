package ru.netology.DZ_10_Radioman.service;

public class Radio {

    protected int currentRadioStation; //поле - текущая станция
    protected int currentVolume; // поле - текущая громкость
    protected int maxRadioStation;
    protected int maxVolume;

    public Radio() {
        this.maxRadioStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int stationCount, int volumeCount) {
        this.maxRadioStation = stationCount - 1;
        this.maxVolume = volumeCount;
    }

    public int getRadioStationNumber() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
