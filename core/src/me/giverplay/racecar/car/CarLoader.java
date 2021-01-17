package me.giverplay.racecar.car;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

public final class CarLoader
{
  public final CarInfo fireRacer = loadCar("fireracer");

  public CarInfo loadCar(String carName) {
    CarInfo car = new CarInfo();

    FileHandle file = Gdx.files.internal("cars/" + carName  + "/car-info.json");
    JsonReader reader = new JsonReader();
    JsonValue json = reader.parse(file);

    car.name = json.getString("name");
    car.width = json.getFloat("width");
    car.height = json.getFloat("height");
    car.speed = json.getFloat("speed");

    return car;
  }
}
