package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldStationNext() {   ///Выбор следующей станции
        radio.setStationNumber(0);
        radio.stationUp();
        assertEquals(1, radio.getStationNumber());
    }

    @Test
    void shouldStationPrev() {  ///Выбор предыдущей станции
        radio.setStationNumber(5);
        radio.stationDown();
        assertEquals(4, radio.getStationNumber());
    }

    @Test
    void shouldStationUpWhenStationMax() {   ///Переход станции поле максимальной
        radio.setStationNumber(9);
        radio.stationUp();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    void shouldStationDownWhenStationMin() {  /// Переход станции после минимальной
        radio.setStationNumber(0);
        radio.stationDown();
        assertEquals(9, radio.getStationNumber());

    }

    @Test
    void shouldSetStationNumber () {     ///Выбор станции
        radio.setStationNumber(5);
        assertEquals(5, radio.getStationNumber());
}
    @Test
    void shouldVolumeUp () { ///Увелечение звука на одну единицу
        radio.setVolume(2);
        radio.volumeUp();
        assertEquals(3,radio.getVolume());
    }
    @Test
    void shouldVolumeDown () { ///Уменьшение звука на одну единицу
        radio.setVolume(4);
        radio.volumeDown();
        assertEquals(3,radio.getVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMax() { ///Увелечение звука после максимальной громкости (10)
        radio.setVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getVolume());
    }
    @Test
    void shouldVolumeUpWhenVolumeMin () { ///Уменьшение звука после минимальной громкости (0)
        radio.setVolume(0);
        radio.volumeDown();
        assertEquals(0,radio.getVolume());
    }
}
