package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetAmountRadioStation() {
        Radio radioman = new Radio(40);

        radioman.setCurrentRadioStation(20);
        Assertions.assertEquals(20, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetAmountRadioStation1() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(5);


        Assertions.assertEquals(5, radioman.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();

        Assertions.assertEquals(0, radioman.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation2() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation3() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(10);

        Assertions.assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation4() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(0);

        Assertions.assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radioman = new Radio();
        radioman.setCurrentRadioStation(6);
        radioman.nextRadioStation();

        Assertions.assertEquals(7, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNPrevRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(5);
        radioman.prevRadioStation();

        Assertions.assertEquals(4, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(50);
        radioman.increaseVolume();

        Assertions.assertEquals(51, radioman.getCurrentVolume());
    }

    @Test
    public void shouldSetReduceVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(81);
        radioman.reduceVolume();


        Assertions.assertEquals(80, radioman.getCurrentVolume());
    }
    @Test
    public void shouldSetCurrentVolume1() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(0);
        radioman.reduceVolume();

        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }
    @Test
    public void shouldSetCurrentVolume2() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(100);
        radioman.increaseVolume();

        Assertions.assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void shouldSetAmountVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(90);


        Assertions.assertEquals(90, radioman.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume3() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(-1);

        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }
    @Test
    public void shouldSetCurrentVolume4() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(0);


        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }
    @Test
    public void shouldSetCurrentVolume5() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(101);

        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }

}







