package me.giverplay.racecar.car.cars;

import com.badlogic.gdx.graphics.g2d.Batch;
import me.giverplay.racecar.car.Car;
import me.giverplay.racecar.car.CarInfo;
import me.giverplay.racecar.road.Road;

public class FireRacer extends Car
{
  public FireRacer(Road road, CarInfo car, float x, float y) {
    super(road, x, y, car.width, car.height, car.speed);
  }

  @Override
  public void render(Batch batch)
  {

  }
}
