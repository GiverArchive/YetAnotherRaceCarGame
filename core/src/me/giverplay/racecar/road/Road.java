package me.giverplay.racecar.road;

import com.badlogic.gdx.graphics.g2d.Batch;
import me.giverplay.racecar.car.Car;
import me.giverplay.racecar.car.CarLoader;

import java.util.ArrayList;

public class Road
{
  private final ArrayList<Car> cars = new ArrayList<>();
  private final CarLoader carLoader = new CarLoader();

  public void updateAndRender(Batch batch) {
    for(Car car : getCars()) {
      car.tick();
      car.render(batch);
    }
  }

  public void removeCar(Car car) {
    cars.remove(car);
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public ArrayList<Car> getCars()
  {
    return new ArrayList<>(cars);
  }

  public void resetRoad() {
    cars.clear();
  }
}
