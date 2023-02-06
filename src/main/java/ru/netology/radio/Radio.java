package ru.netology.radio;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
    }

    public void setAmountRadioStation(int maxRadioStation) {
        if (1 > maxRadioStation) {
            return;
        }
        this.maxStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public int getMaxRadioStation() {
        return maxStation;
    }

    public int getMinRadioStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (maxStation <= currentStation) {
            setCurrentRadioStation(minStation);
        } else {
            setCurrentRadioStation(currentStation + 1);
        }
    }

    public void prevRadioStation() {
        if (currentStation <= minStation) {
            setCurrentRadioStation(maxStation);
        } else {
            setCurrentRadioStation(currentStation - 1);
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}