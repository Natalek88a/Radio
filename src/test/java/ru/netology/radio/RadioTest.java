package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    int expectedRad;
    int expectedVol;

    @Test
    public void shouldSetAmountRadioStation() {

        radio.setAmountRadioStation(10);

        Assertions.assertEquals(10, radio.getMaxRadioStation());
    }

    @Test
    public void shouldSetAmountNullRadioStation() {

        expectedVol = radio.getMaxRadioStation();
        radio.setAmountRadioStation(-3);

        Assertions.assertEquals(expectedVol, radio.getMaxRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {

        radio.setCurrentRadioStation(5);

        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMax() {

        radio.setCurrentRadioStation(11);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMin() {

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMedium() {

        expectedRad = radio.getMinRadioStation();
        radio.setCurrentRadioStation(expectedRad);

        Assertions.assertEquals(expectedRad, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMedium1() {
        expectedRad = radio.getMaxRadioStation();
        radio.setCurrentRadioStation(expectedRad);
        Assertions.assertEquals(expectedRad, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextStation() {

        radio.setCurrentRadioStation(9);
        expectedRad = radio.getMinRadioStation();
        radio.nextStation();
        Assertions.assertEquals(expectedRad, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {

        radio.setCurrentRadioStation(0);
        expectedRad = radio.getMaxRadioStation();
        radio.prevRadioStation();

        Assertions.assertEquals(expectedRad, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextOneRadioStation() {
        Radio radi = new Radio();

        radio.setCurrentRadioStation(7);
        radio.nextStation();

        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevOneRadioStation() {
        radio.setCurrentRadioStation(4);
        radio.prevRadioStation();

        Assertions.assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume1() {

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinVolume() {
        expectedVol = radio.getMinVolume();
        radio.setCurrentVolume(0);
        Assertions.assertEquals(expectedVol, radio.getCurrentVolume());
    }

    @Test
    public void shouldMaxVolume() {

        expectedVol = radio.getMaxVolume();
        radio.setCurrentVolume(100);

        Assertions.assertEquals(expectedVol, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(20);
        radio.increaseVolume();

        Assertions.assertEquals(21, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {

        radio.setCurrentVolume(76);
        radio.reduceVolume();

        Assertions.assertEquals(75, radio.getCurrentVolume());
    }
    @Test
    public void shouldMaxOneVolume() {

        expectedVol = radio.getMaxVolume();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(expectedVol, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinOneVolume() {

        expectedVol = radio.getMinVolume();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(expectedVol, radio.getCurrentVolume());
    }
}


