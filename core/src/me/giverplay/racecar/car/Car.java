package me.giverplay.racecar.car;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import me.giverplay.racecar.road.Road;

public abstract class Car
{
  protected final Road road;

  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected int speed;

  public Car(Road road, int x, int y, int width, int height, int speed) {
    this.road = road;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.speed = speed;
  }

  public void tick() {
    y -= speed;

    if(y < 0) {
      destroy();
    }
  }

  /**
   * Called in Road rendering
   * @param batch The sprite batch
   */
  public abstract void render(Batch batch);

  public void destroy() {
    road.removeCar(this);
  }

  public Road getRoad() {
    return road;
  }

  public Rectangle getCollisionBox() {
    return new Rectangle(x, y, width, height);
  }

  public boolean isColliding(Car car) {
    return getCollisionBox().overlaps(car.getCollisionBox());
  }

  public void moveX(int x) {
    this.x += x;
  }

  public void moveY(int y) {
    this.y += y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
