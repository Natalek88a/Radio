package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;




    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentStation + 1);
        }
    }
    public void prevRadioStation() {
        if (currentStation <= 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentStation - 1);
        }
    }
    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
