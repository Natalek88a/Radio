package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();


        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();
        int expected = 9;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextOneRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(7);
        radioman.nextStation();
        int expected = 8;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevOneRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);
        radio.prevRadioStation();
        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.reduceVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

