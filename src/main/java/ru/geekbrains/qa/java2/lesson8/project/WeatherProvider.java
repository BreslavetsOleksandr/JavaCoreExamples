package ru.geekbrains.qa.java2.lesson8.project;

import ru.geekbrains.qa.java2.lesson8.project.entity.WeatherData;
import ru.geekbrains.qa.java2.lesson8.project.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
