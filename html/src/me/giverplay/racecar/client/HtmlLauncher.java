package me.giverplay.racecar.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import me.giverplay.racecar.Game;

public class HtmlLauncher extends GwtApplication {
  @Override
  public GwtApplicationConfiguration getConfig() {
    return new GwtApplicationConfiguration(true);
  }

  @Override
  public ApplicationListener createApplicationListener() {
    return new Game();
  }
}