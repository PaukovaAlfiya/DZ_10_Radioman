package ru.netology.DZ_10_Radioman.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioTest() {
        Radio radio = new Radio(10, 100);

        Assertions.assertEquals(9, radio.maxRadioStation);
        Assertions.assertEquals(100, radio.maxVolume);
    }

    @Test
    public void shouleSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadioStation_50() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(50);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadioStationMinus50() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-50);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadio_0_Station() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadio_1_Station() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadio_8_Station() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadioMinusOneStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextStation_9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevStation_9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevStation_0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevStation_1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouleSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolume100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetVolume_101() {
        Radio radio = new Radio();
        radio.setVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSet_0_Volume() {
        Radio radio = new Radio();
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadio_1_Volume() {
        Radio radio = new Radio();
        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadio_9_Volume() {
        Radio radio = new Radio();
        radio.setVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadio_101_Volume() {
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadioMinusOneVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(6);

        radio.nextVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextVolume_10() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.nextVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextVolume_100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextVolume_0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextVolume_1() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.nextVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextVolume_9() {
        Radio radio = new Radio();
        radio.setVolume(9);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchToPrevVolume_10() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.prevVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevVolume_0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevVolume_1() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevVolume_25() {
        Radio radio = new Radio();
        radio.setVolume(25);

        radio.prevVolume();

        int expected = 24;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevVolume_11() {
        Radio radio = new Radio();
        radio.setVolume(11);

        radio.prevVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

