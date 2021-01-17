package me.giverplay.racecar.car;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import me.giverplay.racecar.road.Road;

public abstract class Car
{
  protected final Road road;

  protected float x;
  protected float y;
  protected float width;
  protected float height;
  protected float speed;

  public Car(Road road, float x, float y, float width, float height, float speed) {
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

  public void moveX(float x) {
    this.x += x;
  }

  public void moveY(float y) {
    this.y += y;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
