package ru.netology.radio;

public class Radio {

    private int currentStation;
    private final int maxStation;
    private int currentVolume;


    public Radio() {
        this.maxStation = 9;

    }


    public Radio(int amountRadioStation) {
        this.maxStation = amountRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }

        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
