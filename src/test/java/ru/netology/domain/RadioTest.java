package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {



    @Test
    void shouldStationNext() {   ///Выбор следующей станции
        Radio radio = new Radio(0, 10);
        radio.stationUp();
        assertEquals(1, radio.getStationNumber());
    }

    @Test
    void shouldStationPrev() {  ///Выбор предыдущей станции
        Radio radio = new Radio(5, 10);
        radio.stationDown();
        assertEquals(4, radio.getStationNumber());
    }

    @Test
    void shouldStationUpWhenStationMax() {   ///Переход станции поле максимальной
        Radio radio = new Radio(10, 10);
        radio.stationUp();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    void shouldStationDownWhenStationMin() {  /// Переход станции после минимальной
        Radio radio = new Radio (0,10);
        radio.stationDown();
        assertEquals(10, radio.getStationNumber());

    }

    @Test
    void shouldSetStationNumber () {     ///Выбор станции
        Radio radio = new Radio(5,5);
        assertEquals(5, radio.getStationNumber());
}
    @Test
    void shouldVolumeUp () { ///Увелечение звука на одну единицу
        Radio radio = new Radio(2,50);
        radio.volumeUp();
        assertEquals(51,radio.getVolume());
    }
    @Test
    void shouldVolumeDown () { ///Уменьшение звука на одну единицу
        Radio radio = new Radio(2,50);
        radio.volumeDown();
        assertEquals(49,radio.getVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMax() { ///Увелечение звука после максимальной громкости (10)
        Radio radio = new Radio(2,100);
        radio.volumeUp();
        assertEquals(100, radio.getVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMin () { ///Уменьшение звука после минимальной громкости (0)
        Radio radio = new Radio(2,0);
        radio.volumeDown();
        assertEquals(0,radio.getVolume());
    }
}
